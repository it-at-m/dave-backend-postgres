package de.muenchen.dave.domain.mapper.detektor;

import de.muenchen.dave.domain.elasticsearch.detektor.Messfaehigkeit;
import de.muenchen.dave.domain.elasticsearch.detektor.Messquerschnitt;
import de.muenchen.dave.domain.elasticsearch.detektor.Messstelle;
import de.muenchen.dave.domain.mapper.StadtbezirkMapper;
import de.muenchen.dave.geodateneai.gen.model.MessfaehigkeitDto;
import de.muenchen.dave.geodateneai.gen.model.MessquerschnittDto;
import de.muenchen.dave.geodateneai.gen.model.MessstelleDto;
import de.muenchen.dave.util.SuchwortUtil;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.AfterMapping;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MessstelleReceiverMapper {

    Messstelle createMessstelle(MessstelleDto dto, @Context StadtbezirkMapper stadtbezirkMapper);

    Messquerschnitt createMessquerschnitt(MessquerschnittDto dto);

    List<Messquerschnitt> createMessquerschnitte(List<MessquerschnittDto> dto);

    Messfaehigkeit createMessfaehigkeit(MessfaehigkeitDto dto);

    List<Messfaehigkeit> createMessfaehigkeit(List<MessfaehigkeitDto> dto);

    @AfterMapping
    default void createMessstelleAfterMapping(@MappingTarget Messstelle bean, MessstelleDto dto, @Context StadtbezirkMapper stadtbezirkMapper) {
        if (StringUtils.isEmpty(bean.getId())) {
            bean.setId(UUID.randomUUID().toString());
        }

        if (ObjectUtils.isEmpty(bean.getPunkt()) && dto.getXcoordinate() != null && dto.getYcoordinate() != null) {
            bean.setPunkt(new GeoPoint(dto.getXcoordinate(), dto.getYcoordinate()));
        }

        // Suchworte setzen
        final Set<String> generatedSuchwoerter = SuchwortUtil.generateSuchworteOfMessstelle(bean, stadtbezirkMapper);

        bean.setSuchwoerter(new ArrayList<>());
        if (CollectionUtils.isNotEmpty(generatedSuchwoerter)) {
            bean.getSuchwoerter().addAll(generatedSuchwoerter);
        }

        if (CollectionUtils.isNotEmpty(bean.getCustomSuchwoerter())) {
            bean.getSuchwoerter().addAll(bean.getCustomSuchwoerter());
        }

        if (CollectionUtils.isEmpty(bean.getMessquerschnitte())) {
            bean.setMessquerschnitte(new ArrayList<>());
        }

        if (CollectionUtils.isNotEmpty(bean.getMessfaehigkeiten())) {
            bean.getMessfaehigkeiten().forEach(messfaehigkeit -> {
                if (LocalDate.now().isBefore(messfaehigkeit.getGueltigBis())) {
                    bean.setFahrzeugKlassen(messfaehigkeit.getFahrzeugklassen());
                }
            });
        }
    }

    @AfterMapping
    default void createMessquerschnittAfterMapping(@MappingTarget Messquerschnitt bean, MessquerschnittDto dto) {
        if (StringUtils.isEmpty(bean.getId())) {
            bean.setId(UUID.randomUUID().toString());
        }
        if (ObjectUtils.isEmpty(bean.getPunkt()) && dto.getXcoordinate() != null && dto.getYcoordinate() != null) {
            bean.setPunkt(new GeoPoint(dto.getXcoordinate(), dto.getYcoordinate()));
        }
    }

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "sichtbarDatenportal", ignore = true)
    @Mapping(target = "kommentar", ignore = true)
    @Mapping(target = "standort", ignore = true)
    @Mapping(target = "customSuchwoerter", ignore = true)
    @Mapping(target = "suchwoerter", ignore = true)
    @Mapping(target = "geprueft", ignore = true)
    @Mapping(target = "messquerschnitte", ignore = true)
    Messstelle updateMessstelle(@MappingTarget Messstelle existing, MessstelleDto dto, @Context StadtbezirkMapper stadtbezirkMapper);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "standort", ignore = true)
    Messquerschnitt updateMessquerschnitt(@MappingTarget Messquerschnitt existing, MessquerschnittDto dto, @Context StadtbezirkMapper stadtbezirkMapper);

}
