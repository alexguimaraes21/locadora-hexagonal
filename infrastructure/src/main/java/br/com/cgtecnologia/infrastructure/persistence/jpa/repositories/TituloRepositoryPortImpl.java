package br.com.cgtecnologia.infrastructure.persistence.jpa.repositories;

import br.com.cgtecnologia.domain.models.TituloModel;
import br.com.cgtecnologia.domain.ports.out.TituloRepositoryPort;
import br.com.cgtecnologia.infrastructure.libs.TituloConverter;
import br.com.cgtecnologia.infrastructure.persistence.jpa.entities.TituloEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class TituloRepositoryPortImpl implements TituloRepositoryPort {

    @PersistenceContext
    private EntityManager em;

    @Override
    public TituloModel add(TituloModel model) {
        TituloEntity tituloEntity = TituloConverter.modelToEntity(model);
        em.persist(tituloEntity);
        return TituloConverter.entityToModel(tituloEntity);
    }

    @Override
    public Optional<TituloModel> findById(Long id) {
        TituloEntity tituloEntity = em.find(TituloEntity.class, id);
        return Optional.ofNullable(tituloEntity).map(TituloConverter::entityToModel);
    }

    @Override
    public List<TituloModel> findAll() {
        List<TituloEntity> titulosEntity = em.createQuery("from TituloEntity", TituloEntity.class).getResultList();
        return titulosEntity.stream().map(TituloConverter::entityToModel).collect(Collectors.toList());
    }

    @Override
    public TituloModel update(TituloModel model) {
        TituloEntity tituloEntity = TituloConverter.modelToEntity(model);
        em.merge(tituloEntity);
        return TituloConverter.entityToModel(tituloEntity);
    }

    @Override
    public void delete(Long id) {
        em.remove(em.getReference(TituloEntity.class, id));
    }
}
