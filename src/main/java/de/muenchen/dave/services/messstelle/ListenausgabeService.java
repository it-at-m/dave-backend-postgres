/*
 * Copyright (c): it@M - Dienstleister für Informations- und Telekommunikationstechnik
 * der Landeshauptstadt München, 2023
 */
package de.muenchen.dave.services.messstelle;

import de.muenchen.dave.domain.dtos.laden.messwerte.LadeMesswerteDTO;
import de.muenchen.dave.domain.dtos.laden.messwerte.LadeMesswerteListenausgabeDTO;
import de.muenchen.dave.domain.enums.TypeZeitintervall;
import de.muenchen.dave.domain.enums.Zeitblock;
import de.muenchen.dave.domain.mapper.LadeMesswerteMapper;
import de.muenchen.dave.geodateneai.gen.model.MeasurementValuesPerInterval;
import de.muenchen.dave.util.messstelle.MesswerteBaseUtil;
import de.muenchen.dave.util.messstelle.MesswerteSortingIndexUtil;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ListenausgabeService {

    private final LadeMesswerteMapper ladeMesswerteMapper;
    private final SpitzenstundeService spitzenstundeService;

    protected static final String GESAMT = "Gesamt";
    protected static final String BLOCK = "Block";
    protected static final String STUNDE = "Stunde";

    public LadeMesswerteListenausgabeDTO ladeListenausgabe(final List<MeasurementValuesPerInterval> intervals, final boolean isKfzMessstelle) {
        log.debug("#ladeListenausgabe");
        final LadeMesswerteListenausgabeDTO dto = new LadeMesswerteListenausgabeDTO();
        dto.getZaehldaten().addAll(mapIntervalsToLadeMesswerteDTOs(intervals));
        dto.getZaehldaten().addAll(calculateSumOfIntervalsPerHour(intervals));
        dto.getZaehldaten().addAll(calculateSpitzenstundeAndSumOfIntervalsPerBlock(Zeitblock.ZB_00_06, intervals, isKfzMessstelle));
        dto.getZaehldaten().addAll(calculateSpitzenstundeAndSumOfIntervalsPerBlock(Zeitblock.ZB_06_10, intervals, isKfzMessstelle));
        dto.getZaehldaten().addAll(calculateSpitzenstundeAndSumOfIntervalsPerBlock(Zeitblock.ZB_10_15, intervals, isKfzMessstelle));
        dto.getZaehldaten().addAll(calculateSpitzenstundeAndSumOfIntervalsPerBlock(Zeitblock.ZB_15_19, intervals, isKfzMessstelle));
        dto.getZaehldaten().addAll(calculateSpitzenstundeAndSumOfIntervalsPerBlock(Zeitblock.ZB_19_24, intervals, isKfzMessstelle));
        dto.getZaehldaten().addAll(calculateSpitzenstundeAndSumOfIntervalsPerBlock(Zeitblock.ZB_00_24, intervals, isKfzMessstelle));
        dto.setZaehldaten(dto.getZaehldaten().stream().sorted(Comparator.comparing(LadeMesswerteDTO::getSortingIndex)).collect(Collectors.toList()));
        return dto;
    }

    protected List<LadeMesswerteDTO> mapIntervalsToLadeMesswerteDTOs(final List<MeasurementValuesPerInterval> intervals) {
        final List<LadeMesswerteDTO> dtos = new ArrayList<>();
        intervals.forEach(intervall -> {
            final LadeMesswerteDTO dto = ladeMesswerteMapper.measurementValuesPerIntervalToLadeMesswerteDTO(intervall);
            dto.setSortingIndex(MesswerteSortingIndexUtil.getSortingIndexWithinBlock(dto, TypeZeitintervall.STUNDE_VIERTEL));
            dtos.add(dto);
        });
        return dtos;
    }

    protected List<LadeMesswerteDTO> calculateSumOfIntervalsPerHour(final List<MeasurementValuesPerInterval> intervals) {
        final List<LadeMesswerteDTO> dtos = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            final LocalTime start = LocalTime.of(i, 0);
            final LocalTime end;
            if (i == 23) {
                end = LocalTime.of(i, 59);
            } else {
                end = LocalTime.of(i + 1, 0);
            }
            final LadeMesswerteDTO dto = MesswerteBaseUtil.calculateSum(
                    intervals.stream().filter(intervall -> MesswerteBaseUtil.isTimeBetweenStartAndEnd(intervall.getStartUhrzeit(), start, end))
                            .collect(Collectors.toList()));
            dto.setStartUhrzeit(start);
            dto.setEndeUhrzeit(end);
            dto.setType(STUNDE);
            dto.setSortingIndex(MesswerteSortingIndexUtil.getSortingIndexWithinBlock(dto, TypeZeitintervall.STUNDE_KOMPLETT));
            dtos.add(dto);
        }
        return dtos;
    }

    protected List<LadeMesswerteDTO> calculateSpitzenstundeAndSumOfIntervalsPerBlock(final Zeitblock block, final List<MeasurementValuesPerInterval> intervals,
            final boolean isKfzMessstelle) {
        final List<MeasurementValuesPerInterval> necessaryIntervals = intervals.stream()
                .filter(intervall -> MesswerteBaseUtil.isTimeWithinBlock(intervall.getStartUhrzeit(), block))
                .collect(Collectors.toList());
        final List<LadeMesswerteDTO> ladeMesswerteDTOS = new ArrayList<>();
        ladeMesswerteDTOS.add(spitzenstundeService.calculateSpitzenstunde(block, necessaryIntervals, isKfzMessstelle));
        ladeMesswerteDTOS.add(calculateSumOfIntervalsPerBlock(block, necessaryIntervals));
        return ladeMesswerteDTOS;
    }

    protected LadeMesswerteDTO calculateSumOfIntervalsPerBlock(final Zeitblock block, final List<MeasurementValuesPerInterval> intervals) {
        final LadeMesswerteDTO ladeMesswerteDTO = MesswerteBaseUtil.calculateSum(intervals);
        ladeMesswerteDTO.setEndeUhrzeit(block.getEnd().toLocalTime());
        ladeMesswerteDTO.setStartUhrzeit(block.getStart().toLocalTime());
        if (Zeitblock.ZB_00_24.equals(block)) {
            ladeMesswerteDTO.setType(GESAMT);
            ladeMesswerteDTO.setSortingIndex(MesswerteSortingIndexUtil.getSortingIndexGesamtCompleteDay());
        } else {
            ladeMesswerteDTO.setType(BLOCK);
            ladeMesswerteDTO.setSortingIndex(MesswerteSortingIndexUtil.getSortingIndexWithinBlock(ladeMesswerteDTO, TypeZeitintervall.BLOCK));
        }
        return ladeMesswerteDTO;
    }
}
