package br.com.cgtecnologia.infrastructure.web.api.dtos;

public record ErrorMessageResponseDto(String message) {
    public ErrorMessageResponseDto(String message) { this.message = message; }
}
