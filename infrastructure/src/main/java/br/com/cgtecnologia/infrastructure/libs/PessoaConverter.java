package br.com.cgtecnologia.infrastructure.libs;

import br.com.cgtecnologia.domain.models.PessoaModel;
import br.com.cgtecnologia.infrastructure.persistence.jpa.entities.PessoaEntity;
import br.com.cgtecnologia.infrastructure.web.api.dtos.PessoaRequestDto;
import br.com.cgtecnologia.infrastructure.web.api.dtos.PessoaResponseDto;

public class PessoaConverter {

    public static PessoaEntity modelToEntity(PessoaModel model) {
        return PessoaEntity.builder()
                .cdPessoa(model.getCdPessoa())
                .nmPessoa(model.getNmPessoa())
                .nrCpf(model.getNrCpf())
                .tpSexo(model.getTpSexo())
                .dtNascimento(model.getDtNascimento())
                .dtAssociado(model.getDtAssociado())
                .dtRescisao(model.getDtRescisao())
                .tpPessoa(model.getTpPessoa())
                .build();
    }

    public static PessoaModel entityToModel(PessoaEntity entity) {
        return new PessoaModel.Builder()
                .setCdPessoa(entity.getCdPessoa())
                .setNmPessoa(entity.getNmPessoa())
                .setNrCpf(entity.getNrCpf())
                .setTpSexo(entity.getTpSexo())
                .setDtNascimento(entity.getDtNascimento())
                .setDtAssociado(entity.getDtAssociado())
                .setDtRescisao(entity.getDtRescisao())
                .setTpPessoa(entity.getTpPessoa())
                .build();
    }

    public static PessoaModel requestDtoToModel(PessoaRequestDto dto) {
        return new PessoaModel.Builder()
                .setNmPessoa(dto.nmPessoa())
                .setNrCpf(dto.nrCpf())
                .setTpSexo(dto.tpSexo())
                .setDtNascimento(dto.dtNascimento())
                .setDtAssociado(dto.dtAssociado())
                .setDtRescisao(dto.dtRescisao())
                .setTpPessoa(dto.tpPessoa())
                .build();
    }

    public static PessoaResponseDto modelToResponseDto(PessoaModel model) {
        return new PessoaResponseDto(model);
    }
}
