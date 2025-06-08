package br.com.cgtecnologia.infrastructure.web.api.dtos;

import br.com.cgtecnologia.domain.enums.TipoPessoa;
import br.com.cgtecnologia.domain.enums.TipoSexoEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;


public record PessoaRequestDto(
        Long cdPessoa,
        @Valid
        @NotNull(message = "O atributo nmPessoa é obrigatório.")
        String nmPessoa,
        @Valid
        @NotNull(message = "O atributo nrCpf é obrigatório.")
        @CPF(message = "O CPF informado não é um CPF válido.")
        String nrCpf,
        @Valid
        @NotNull(message = "O atributo tpSexo é obrigatório.")
        TipoSexoEnum tpSexo,
        @Valid
        @NotNull(message = "O atributo dtNascimento é obrigatório.")
        @PastOrPresent(message = "A data de nascimento informada não pode ser uma data futura.")
        LocalDate dtNascimento,
        @Valid
        @NotNull(message = "O atributo dtAssociado é obrigatório.")
        @FutureOrPresent(message = "A data de associação não pode ser uma data passada.")
        LocalDate dtAssociado,
        @Valid
        @FutureOrPresent(message = " data de rescisao não pode ser uma data passada.")
        LocalDate dtRescisao,
        @Valid
        @NotNull(message = "O atributo tpPessoa é obrigatório.")
        TipoPessoa tpPessoa
) {
}
