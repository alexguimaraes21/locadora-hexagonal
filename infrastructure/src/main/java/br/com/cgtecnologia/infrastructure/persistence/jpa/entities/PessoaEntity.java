package br.com.cgtecnologia.infrastructure.persistence.jpa.entities;

import br.com.cgtecnologia.domain.enums.TipoPessoa;
import br.com.cgtecnologia.domain.enums.TipoSexoEnum;
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
@Table(name = "tb_pessoas")
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_pessoa")
    private Long cdPessoa;
    @Column(nullable = false, name = "nm_pessoa")
    private String nmPessoa;
    @Column(nullable = false, name = "nr_cpf", unique = true)
    private String nrCpf;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "tp_sexo")
    private TipoSexoEnum tpSexo;
    @Column(nullable = false, name = "dt_nascimento")
    private LocalDate dtNascimento;
    @Column(nullable = false, name = "dt_associado")
    private LocalDate dtAssociado;
    @Column(nullable = true, name = "dt_rescisao")
    private LocalDate dtRescisao;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "tp_pessoa")
    private TipoPessoa tpPessoa;
}
