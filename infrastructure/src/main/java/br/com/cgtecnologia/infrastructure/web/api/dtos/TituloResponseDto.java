package br.com.cgtecnologia.infrastructure.web.api.dtos;

import br.com.cgtecnologia.domain.enums.TipoGeneroTitulo;
import br.com.cgtecnologia.domain.models.TituloModel;
import br.com.cgtecnologia.infrastructure.persistence.jpa.entities.TituloEntity;

import java.time.LocalDate;

public record TituloResponseDto(
        Long cdTitulo,
        String nmTitulo,
        TipoGeneroTitulo tpGenero,
        Integer nrDuracao,
        LocalDate dtLancamento) {
        public TituloResponseDto(TituloModel model) {
                this(model.getCdTitulo(), model.getNmTitulo(), model.getTpGenero(), model.getNrDuracao(), model.getDtLancamento());
        }

        public TituloResponseDto(TituloEntity entity) {
                this(entity.getCdTitulo(), entity.getNmTitulo(), entity.getTpGenero(), entity.getNrDuracao(), LocalDate.now());
        }

        public TituloResponseDto(Long cdTitulo, String nmTitulo, TipoGeneroTitulo tpGenero, Integer nrDuracao, LocalDate dtLancamento) {
                this.cdTitulo = cdTitulo;
                this.nmTitulo = nmTitulo;
                this.tpGenero = tpGenero;
                this.nrDuracao = nrDuracao;
                this.dtLancamento = dtLancamento;
        }
}
