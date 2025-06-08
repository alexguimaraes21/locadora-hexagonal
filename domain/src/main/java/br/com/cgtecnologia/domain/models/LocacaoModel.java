package br.com.cgtecnologia.domain.models;

import java.time.LocalDate;
import java.util.List;

public class LocacaoModel {
    private Long cdLocacao;
    private PessoaModel cliente;
    private List<TituloModel> titulos;
    private LocalDate dtLocacao;
    private LocalDate dtDevolucao;
    private double vlLocacao;
}
