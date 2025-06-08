package br.com.cgtecnologia.domain.ports.out;

import java.util.List;
import java.util.Optional;

public interface CrudRepositoryPort<T> {
    T add(T model);
    Optional<T> findById(Long id);
    List<T> findAll();
    T update(T model);
    void delete(Long id);
}
