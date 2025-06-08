CREATE TABLE tb_titulos
(
    cd_titulo     BIGINT       NOT NULL,
    nm_titulo     VARCHAR(255) NOT NULL,
    tp_genero     VARCHAR(255) NOT NULL,
    nr_duracao    INT          NOT NULL,
    dt_lancamento date         NOT NULL,
    CONSTRAINT pk_tb_titulos PRIMARY KEY (cd_titulo)
);