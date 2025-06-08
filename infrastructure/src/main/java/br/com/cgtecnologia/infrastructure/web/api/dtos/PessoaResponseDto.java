package br.com.cgtecnologia.infrastructure.web.api.dtos;

import br.com.cgtecnologia.domain.enums.TipoPessoa;
import br.com.cgtecnologia.domain.enums.TipoSexoEnum;
import br.com.cgtecnologia.domain.models.PessoaModel;
import br.com.cgtecnologia.infrastructure.persistence.jpa.entities.PessoaEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;


public record PessoaResponseDto(
        Long cdPessoa,
        String nmPessoa,
        String nrCpf,
        TipoSexoEnum tpSexo,
        LocalDate dtNascimento,
        LocalDate dtAssociado,
        LocalDate dtRescisao,
        TipoPessoa tpPessoa
) {
        public PessoaResponseDto(PessoaModel model) {
                this(model.getCdPessoa(), model.getNmPessoa(), model.getNrCpf(), model.getTpSexo(), model.getDtNascimento(),
                        model.getDtAssociado(), model.getDtRescisao(), model.getTpPessoa());
        }

        public PessoaResponseDto(PessoaEntity entity) {
                this(entity.getCdPessoa(), entity.getNmPessoa(), entity.getNrCpf(), entity.getTpSexo(), entity.getDtNascimento(),
                        entity.getDtAssociado(), entity.getDtRescisao(), entity.getTpPessoa());
        }

        public PessoaResponseDto(Long cdPessoa, String nmPessoa, String nrCpf, TipoSexoEnum tpSexo, LocalDate dtNascimento,
                                 LocalDate dtAssociado, LocalDate dtRescisao, TipoPessoa tpPessoa) {
                this.cdPessoa = cdPessoa;
                this.nmPessoa = nmPessoa;
                this.nrCpf = nrCpf;
                this.tpSexo = tpSexo;
                this.dtNascimento = dtNascimento;
                this.dtAssociado = dtAssociado;
                this.dtRescisao = dtRescisao;
                this.tpPessoa = tpPessoa;
        }
}
