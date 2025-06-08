package br.com.cgtecnologia.infrastructure.web.api.dtos;

import br.com.cgtecnologia.domain.enums.TipoGeneroTitulo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record TituloRequestDto(
        Long cdTitulo,
        @Valid
        @NotNull(message = "O atributo nmTitulo é obrigatório.")
        String nmTitulo,
        @Valid
        @NotNull(message = "O atributo tpGenero é obrigatório.")
        TipoGeneroTitulo tpGenero,
        @Valid
        @NotNull(message = "O atributo nrDuracao é obrigatório.")
        Integer nrDuracao,
        @Valid
        @NotNull(message = "O atributo dtLancamento é obrigatório.")
        @Past(message = "O atribulo dtLancamento deve receber uma Data Passada.")
        LocalDate dtLancamento) {
}
