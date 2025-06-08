CREATE TABLE tb_pessoas
(
    cd_pessoa     BIGINT       NOT NULL,
    nm_pessoa     VARCHAR(255) NOT NULL,
    nr_cpf        VARCHAR(255) NOT NULL,
    tp_sexo       VARCHAR(255) NOT NULL,
    dt_nascimento date         NOT NULL,
    dt_associado  date         NOT NULL,
    dt_rescisao   date         NULL,
    tp_pessoa     VARCHAR(255) NOT NULL,
    CONSTRAINT pk_tb_pessoas PRIMARY KEY (cd_pessoa)
);