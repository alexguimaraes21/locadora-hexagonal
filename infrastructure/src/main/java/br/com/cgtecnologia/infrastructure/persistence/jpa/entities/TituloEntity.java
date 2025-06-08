package br.com.cgtecnologia.infrastructure.persistence.jpa.entities;

import br.com.cgtecnologia.domain.enums.TipoGeneroTitulo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tb_titulos")
public class TituloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_titulo")
    private Long cdTitulo;
    @Column(nullable = false, name = "nm_titulo")
    private String nmTitulo;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "tp_genero")
    private TipoGeneroTitulo tpGenero;
    @Column(nullable = false, name = "nr_duracao")
    private Integer nrDuracao;
    @Column(nullable = false, name = "dt_lancamento")
    private LocalDate dtLancamento;
}
