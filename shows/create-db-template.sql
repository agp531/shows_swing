-- Active: 1682272851408@@127.0.0.1@3306



CREATE DATABASE db_show
    DEFAULT CHARACTER SET = 'utf8mb4';

USE db_show;

CREATE TABLE tb_shows(
    codigo_show INTEGER AUTO_INCREMENT NOT NULL UNIQUE PRIMARY KEY,
    artista VARCHAR(50) NOT NULL,
    cache DOUBLE NOT NULL,
    data VARCHAR(10) NOT NULL,
    valor_ingresso DOUBLE NOT NULL,
    local VARCHAR(50) NOT NULL

);


INSERT INTO tb_shows (artista, cache, data, valor_ingresso, local) VALUES
('Anitta', 5000.0, '01/06/2023', 50.0, 'Estádio Maracanã, Rio de Janeiro'),
('Ivete Sangalo', 8000.0, '15/06/2023', 80.0, 'Arena Fonte Nova, Salvador'),
('Marília Mendonça', 3500.0, '02/07/2023', 40.0, 'Allianz Parque, São Paulo'),
('Gusttavo Lima', 6000.0, '20/07/2023', 60.0, 'Mineirão, Belo Horizonte'),
('Zeca Pagodinho', 4000.0, '10/08/2023', 45.0, 'Maracanãzinho, Rio de Janeiro');

SELECT * FROM tb_shows;

