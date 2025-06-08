package br.com.cgtecnologia.domain.ports.out;

import br.com.cgtecnologia.domain.models.LocacaoModel;

import java.util.List;
import java.util.Optional;

public interface LocacaoRepositoryPort {
    LocacaoModel save(LocacaoModel locacaoModel);
    Optional<LocacaoModel> findById(Long id);
    List<LocacaoModel> findAll();
    LocacaoModel update(LocacaoModel locacaoModel);
}
