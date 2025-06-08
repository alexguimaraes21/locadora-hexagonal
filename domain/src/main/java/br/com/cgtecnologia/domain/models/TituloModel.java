package br.com.cgtecnologia.domain.models;

import br.com.cgtecnologia.domain.enums.TipoGeneroTitulo;

import java.time.LocalDate;

public class TituloModel {
    private Long cdTitulo;
    private String nmTitulo;
    private TipoGeneroTitulo tpGenero;
    private Integer nrDuracao;
    private LocalDate dtLancamento;

    public TituloModel(Long cdTitulo, String nmTitulo, TipoGeneroTitulo tpGenero, Integer nrDuracao, LocalDate dtLancamento) {
        this.cdTitulo = cdTitulo;
        this.nmTitulo = nmTitulo;
        this.tpGenero = tpGenero;
        this.nrDuracao = nrDuracao;
        this.dtLancamento = dtLancamento;
    }

    public TituloModel() { }

    public Long getCdTitulo() {
        return cdTitulo;
    }

    public TituloModel setCdTitulo(Long cdTitulo) {
        this.cdTitulo = cdTitulo;
        return this;
    }

    public String getNmTitulo() {
        return nmTitulo;
    }

    public TituloModel setNmTitulo(String nmTitulo) {
        this.nmTitulo = nmTitulo;
        return this;
    }

    public TipoGeneroTitulo getTpGenero() {
        return tpGenero;
    }

    public TituloModel setTpGenero(TipoGeneroTitulo tpGenero) {
        this.tpGenero = tpGenero;
        return this;
    }

    public Integer getNrDuracao() {
        return nrDuracao;
    }

    public TituloModel setNrDuracao(Integer nrDuracao) {
        this.nrDuracao = nrDuracao;
        return this;
    }

    public LocalDate getDtLancamento() {
        return dtLancamento;
    }

    public TituloModel setDtLancamento(LocalDate dtLancamento) {
        this.dtLancamento = dtLancamento;
        return this;
    }

    public static class Builder {
        private Long cdTitulo;
        private String nmTitulo;
        private TipoGeneroTitulo tpGenero;
        private Integer nrDuracao;
        private LocalDate dtLancamento;

        public Builder setCdTitulo(Long cdTitulo) {
            this.cdTitulo = cdTitulo;
            return this;
        }

        public Builder setNmTitulo(String nmTitulo) {
            this.nmTitulo = nmTitulo;
            return this;
        }

        public Builder setTpGenero(TipoGeneroTitulo tpGenero) {
            this.tpGenero = tpGenero;
            return this;
        }

        public Builder setNrDuracao(Integer nrDuracao) {
            this.nrDuracao = nrDuracao;
            return this;
        }

        public Builder setDtLancamento(LocalDate dtLancamento) {
            this.dtLancamento = dtLancamento;
            return this;
        }

        public TituloModel build() {
            return new TituloModel(this.cdTitulo, this.nmTitulo, this.tpGenero, nrDuracao, dtLancamento);
        }
    }
}
