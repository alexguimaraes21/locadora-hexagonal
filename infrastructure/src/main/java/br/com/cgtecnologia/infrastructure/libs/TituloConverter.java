package br.com.cgtecnologia.infrastructure.libs;

import br.com.cgtecnologia.domain.models.TituloModel;
import br.com.cgtecnologia.infrastructure.persistence.jpa.entities.TituloEntity;
import br.com.cgtecnologia.infrastructure.web.api.dtos.TituloRequestDto;
import br.com.cgtecnologia.infrastructure.web.api.dtos.TituloResponseDto;

public class TituloConverter {

    public static TituloEntity modelToEntity(TituloModel model) {
        return TituloEntity.builder()
                .cdTitulo(model.getCdTitulo())
                .nmTitulo(model.getNmTitulo())
                .dtLancamento(model.getDtLancamento())
                .tpGenero(model.getTpGenero())
                .nrDuracao(model.getNrDuracao())
                .build();
    }

    public static TituloModel entityToModel(TituloEntity entity) {
        return new TituloModel.Builder()
                .setCdTitulo(entity.getCdTitulo())
                .setNmTitulo(entity.getNmTitulo())
                .setDtLancamento(entity.getDtLancamento())
                .setTpGenero(entity.getTpGenero())
                .setNrDuracao(entity.getNrDuracao())
                .build();
    }

    public static TituloModel requestDtoToModel(TituloRequestDto dto) {
        return new TituloModel.Builder()
                .setCdTitulo(dto.cdTitulo())
                .setNmTitulo(dto.nmTitulo())
                .setDtLancamento(dto.dtLancamento())
                .setTpGenero(dto.tpGenero())
                .setNrDuracao(dto.nrDuracao())
                .build();
    }

    public static TituloResponseDto modelToResponseDto(TituloModel model) {
        return new TituloResponseDto(model);
    }
}
