package br.com.cgtecnologia.domain.models;

import br.com.cgtecnologia.domain.enums.TipoPessoa;
import br.com.cgtecnologia.domain.enums.TipoSexoEnum;

import java.time.LocalDate;

public class PessoaModel {
    private Long cdPessoa;
    private String nmPessoa;
    private String nrCpf;
    private TipoSexoEnum tpSexo;
    private LocalDate dtNascimento;
    private LocalDate dtAssociado;
    private LocalDate dtRescisao;
    private TipoPessoa tpPessoa;

    public PessoaModel(Long cdPessoa, String nmPessoa, String nrCpf, TipoSexoEnum tpSexo, LocalDate dtNascimento,
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

    public PessoaModel() { }

    public Long getCdPessoa() {
        return cdPessoa;
    }

    public PessoaModel setCdPessoa(Long cdPessoa) {
        this.cdPessoa = cdPessoa;
        return this;
    }

    public String getNmPessoa() {
        return nmPessoa;
    }

    public PessoaModel setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
        return this;
    }

    public String getNrCpf() {
        return nrCpf;
    }

    public PessoaModel setNrCpf(String nrCpf) {
        this.nrCpf = nrCpf;
        return this;
    }

    public TipoSexoEnum getTpSexo() {
        return tpSexo;
    }

    public PessoaModel setTpSexo(TipoSexoEnum tpSexo) {
        this.tpSexo = tpSexo;
        return this;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public PessoaModel setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
        return this;
    }

    public LocalDate getDtAssociado() {
        return dtAssociado;
    }

    public PessoaModel setDtAssociado(LocalDate dtAssociado) {
        this.dtAssociado = dtAssociado;
        return this;
    }

    public LocalDate getDtRescisao() {
        return dtRescisao;
    }

    public PessoaModel setDtRescisao(LocalDate dtRescisao) {
        this.dtRescisao = dtRescisao;
        return this;
    }

    public TipoPessoa getTpPessoa() {
        return tpPessoa;
    }

    public PessoaModel setTpPessoa(TipoPessoa tpPessoa) {
        this.tpPessoa = tpPessoa;
        return this;
    }

    public static class Builder {
        private Long cdPessoa;
        private String nmPessoa;
        private String nrCpf;
        private TipoSexoEnum tpSexo;
        private LocalDate dtNascimento;
        private LocalDate dtAssociado;
        private LocalDate dtRescisao;
        private TipoPessoa tpPessoa;

        public Builder setCdPessoa(Long cdPessoa) {
            this.cdPessoa = cdPessoa;
            return this;
        }

        public Builder setNmPessoa(String nmPessoa) {
            this.nmPessoa = nmPessoa;
            return this;
        }

        public Builder setNrCpf(String nrCpf) {
            this.nrCpf = nrCpf;
            return this;
        }

        public Builder setTpSexo(TipoSexoEnum tpSexo) {
            this.tpSexo = tpSexo;
            return this;
        }

        public Builder setDtNascimento(LocalDate dtNascimento) {
            this.dtNascimento = dtNascimento;
            return this;
        }

        public Builder setDtAssociado(LocalDate dtAssociado) {
            this.dtAssociado = dtAssociado;
            return this;
        }

        public Builder setDtRescisao(LocalDate dtRescisao) {
            this.dtRescisao = dtRescisao;
            return this;
        }

        public Builder setTpPessoa(TipoPessoa tpPessoa) {
            this.tpPessoa = tpPessoa;
            return this;
        }

        public PessoaModel build() {
            return new PessoaModel(this.cdPessoa, this.nmPessoa, this.nrCpf, this.tpSexo, this.dtNascimento,
                    this.dtAssociado, this.dtRescisao, this.tpPessoa);
        }
    }
}
