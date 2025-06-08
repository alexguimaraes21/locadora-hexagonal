package br.com.cgtecnologia.infrastructure.web.api.dtos;

import java.time.LocalDateTime;
import java.util.List;

public record ErrorResponseDto(
        LocalDateTime timestamp,
        Integer status,
        String message,
        List<?> errors,
        String path) {
    public ErrorResponseDto(LocalDateTime timestamp, Integer status, String message, String path) {
        this(timestamp, status, message, List.of(), path);
    }
}
