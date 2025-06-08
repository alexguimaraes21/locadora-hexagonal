package br.com.cgtecnologia.domain.ports.out;

import br.com.cgtecnologia.domain.models.PessoaModel;

import java.util.Optional;

public interface PessoaRepositoryPort extends CrudRepositoryPort<PessoaModel> {
    Optional<PessoaModel> findByCpf(String cpf);
}
