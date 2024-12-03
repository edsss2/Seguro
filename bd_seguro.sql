DROP DATABASE seguro_db;

CREATE DATABASE seguro_db;
USE seguro_db;

DROP TABLE laudo;
CREATE TABLE laudo(
	codigo_os INT(6) NOT NULL,
    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    id_equipamento INT,
    PRIMARY KEY (codigo_os),
    FOREIGN KEY (codigo_os) REFERENCES empresa(codigo_os),
    FOREIGN KEY (id_equipamento) REFERENCES equipamento(id)
);

DROP TABLE empresa;

DELETE FROM empresa WHERE codigo_os = 291446;

CREATE TABLE empresa(
	nome VARCHAR(40) NOT NULL,
    cnpj bigint NOT NULL,
    tecnico VARCHAR(50),
    empresa_tecnico VARCHAR(40),
    endereco VARCHAR(100),
    bairro VARCHAR(30),
    cidade VARCHAR(30),
    cep INT(8),
    data_acidente DATE,
    hora_acidente VARCHAR(5),
    descricao VARCHAR(300),
    email VARCHAR(256),
    telefone varchar (30),
	codigo_os INT(6) PRIMARY KEY NOT NULL
);

DROP TABLE equipamento;

CREATE TABLE equipamento(
	marca VARCHAR(40),
    modelo VARCHAR(60),
    numero_serie VARCHAR(30),
    quantia VARCHAR(20),
    tempo_uso VARCHAR(40),
    danos VARCHAR(60),
    data_hora_laudo DATETIME DEFAULT CURRENT_TIMESTAMP,
    id INT PRIMARY KEY auto_increment not NULL,
    codigo_os int (6) not null,
    Foreign key (codigo_os) references empresa(codigo_os)
    
);

CREATE TABLE log_laudo(
	id INT PRIMARY KEY AUTO_INCREMENT,
    codigo_os int,
    quando DATETIME
);

DELIMITER $

CREATE TRIGGER log_insert_laudo AFTER INSERT ON empresa
	FOR EACH ROW
    BEGIN
		INSERT INTO log_laudo VALUES (NULL, new.codigo_os, sysdate());
	END $

DELIMITER ;

