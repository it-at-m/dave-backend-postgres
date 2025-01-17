package de.muenchen.dave.controller;

import de.muenchen.dave.domain.dtos.ChosenTageValidResponseDTO;
import de.muenchen.dave.domain.dtos.ChosenTagesTypValidEaiRequestDTO;
import de.muenchen.dave.domain.dtos.NichtPlausibleTageResponseDTO;
import de.muenchen.dave.domain.dtos.ValidWochentageInPeriodEaiRequestDTO;
import de.muenchen.dave.domain.dtos.ValidWochentageInPeriodResponseDTO;
import de.muenchen.dave.services.MessstelleOptionsmenuService;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messstelleOptionsmenu")
@AllArgsConstructor
@Slf4j
@PreAuthorize(
    "hasAnyRole(T(de.muenchen.dave.security.AuthoritiesEnum).ANWENDER.name(), " +
            "T(de.muenchen.dave.security.AuthoritiesEnum).POWERUSER.name())"
)
public class MessstelleOptionsmenuController {
    public static final String REQUEST_PARAM_MESSSTELLE_ID = "messstelle_id";

    private final MessstelleOptionsmenuService messstelleOptionsmenuService;

    @GetMapping("/nichtPlausibleTage")
    public ResponseEntity<NichtPlausibleTageResponseDTO> getPlausibleTage(@RequestParam(value = REQUEST_PARAM_MESSSTELLE_ID) @NotEmpty String messstelleId) {
        log.debug("#getPlausibleTage for MessstelleId {}", messstelleId);
        return ResponseEntity.ok(messstelleOptionsmenuService.getNichtPlausibleDatenFromEai(messstelleId));
    }

    @PostMapping("/validateTagesTyp")
    public ResponseEntity<ChosenTageValidResponseDTO> isTagesTypDataValid(
            @RequestBody @NotNull ChosenTagesTypValidEaiRequestDTO chosenTagesTypValidEaiRequestDTO) {
        final ChosenTageValidResponseDTO chosenTageValidResponseDTO = messstelleOptionsmenuService.isTagesTypValid(chosenTagesTypValidEaiRequestDTO);
        return ResponseEntity.ok(chosenTageValidResponseDTO);
    }

    @PostMapping("validWochentageInPeriod")
    public ResponseEntity<ValidWochentageInPeriodResponseDTO> getValidWochentageInPeriod(
            @RequestBody ValidWochentageInPeriodEaiRequestDTO validWochentageInPeriodRequestDto) {
        final ValidWochentageInPeriodResponseDTO validWochentageInPeriodResponseDTO = messstelleOptionsmenuService
                .getValidWochentageInPeriod(validWochentageInPeriodRequestDto);
        return ResponseEntity.ok(validWochentageInPeriodResponseDTO);
    }
}
