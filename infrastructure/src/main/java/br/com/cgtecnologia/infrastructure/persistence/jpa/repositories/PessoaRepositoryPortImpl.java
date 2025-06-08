package br.com.cgtecnologia.infrastructure.persistence.jpa.repositories;

import br.com.cgtecnologia.domain.models.PessoaModel;
import br.com.cgtecnologia.domain.ports.out.PessoaRepositoryPort;
import br.com.cgtecnologia.infrastructure.libs.PessoaConverter;
import br.com.cgtecnologia.infrastructure.persistence.jpa.entities.PessoaEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class PessoaRepositoryPortImpl implements PessoaRepositoryPort {

    @PersistenceContext
    private EntityManager em;

    @Override
    public PessoaModel add(PessoaModel model) {
        PessoaEntity pessoaEntity = PessoaConverter.modelToEntity(model);
        em.persist(pessoaEntity);
        return PessoaConverter.entityToModel(pessoaEntity);
    }

    @Override
    public Optional<PessoaModel> findById(Long id) {
        PessoaEntity pessoaEntity = this.em.find(PessoaEntity.class, id);
        return Optional.ofNullable(pessoaEntity).map(PessoaConverter::entityToModel);
    }

    @Override
    public List<PessoaModel> findAll() {
        List<PessoaEntity> pessoasEntity = this.em.createQuery("from PessoaEntity", PessoaEntity.class).getResultList();
        return pessoasEntity.stream().map(PessoaConverter::entityToModel).collect(Collectors.toList());
    }

    @Override
    public PessoaModel update(PessoaModel model) {
        PessoaEntity pessoaEntity = PessoaConverter.modelToEntity(model);
        em.merge(pessoaEntity);
        return PessoaConverter.entityToModel(pessoaEntity);
    }

    @Override
    public void delete(Long id) {
        em.remove(em.getReference(PessoaEntity.class, id));
    }

    @Override
    public Optional<PessoaModel> findByCpf(String nrCpf) {
        PessoaEntity pessoaEntity = em.createQuery("FROM PessoaEntity p WHERE p.nrCpf = :nrCpf", PessoaEntity.class).getSingleResult();
        return Optional.ofNullable(pessoaEntity).map(PessoaConverter::entityToModel);
    }
}
