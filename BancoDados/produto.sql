create database ecommerce;

use ecommerce;

create table tb_produto(
id bigint auto_increment,
nome varchar(100) not null,
preco float not null,
marca varchar(100),
sessao varchar(100) not null,
primary key (id)
);

insert into tb_produto (nome, preco, marca, sessao) values
('A30', 255.00, 'Samsung', 'Smartphone'),
('Pneu', 180.00, 'GoodYear', 'Automoveis'),
('Arroz', 20.00, 'Prato Fino', 'Mercado'),
('Agua Sanitaria', 4.98, 'Candura', 'Limpeza'),
('Cadeira Gamer', 1750.80, 'DT3', 'Conforto'),
('Guarda Sol', 126.80, 'Praianos', 'Lazer'),
('Camiseta', 155.00, 'Nike', 'Vestuario'),
('Tenis', 250.00, 'Adidas', 'Calçado');

select * from tb_produto where preco > 500.00;
select * from tb_produto where preco < 500.00;
update tb_produto set preco = 13.50 where nome = 'Arroz';

select * from tb_produto;

