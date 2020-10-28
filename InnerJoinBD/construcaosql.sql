create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tbl_categoria(
id_cat bigint auto_increment,
departamento varchar(100) not null,
loja_filial varchar(100) not null,
primary key(id_cat)
);

create table tbl_produto(
id_prod bigint auto_increment,
nome varchar(100) not null,
preco decimal (5,2) not null,
qtd_prod int not null,
pgto varchar(50) not null,
id_cat bigint,
primary key(id_prod),
foreign key (id_cat) references tbl_categoria(id_cat)
);

insert into tbl_categoria (departamento, loja_filial) values
('Decoração', 'Leroy Merlin - Interlagos'),
('Ferragens', 'Leroy Merlin - Interlagos'),
('Iluminação', 'Leroy Merlin - Interlagos'),
('Ferramentas', 'Leroy Merlin - Interlagos'),
('Jardim', 'Leroy Merlin - Interlagos');

insert into tbl_produto (nome, preco, qtd_prod, pgto, id_cat) values
('Cortina', 299.99, 1, 'dinheiro', 1),
('Papel de parede', 89.99, 5, 'crédito', 1),
('Lixeira de calçada', 49.99, 1, 'dinheiro', 2),
('Abajur', 150.95, 2, 'dinheiro', 3),
('Lampadas', 12.50, 10, 'crédito', 3),
('Broca', 2.99, 3, 'débito', 4),
('Alicate', 10.99, 4, 'dinheiro', 4),
('Samambaia', 35.99, 3, 'crédito', 5);

select * from tbl_produto where preco > 50.00;
select * from tbl_produto where preco between 3.00 and 60.00;
select * from tbl_produto where nome like '%ci%';

select nome, preco, qtd_prod, pgto, tbl_categoria.departamento, tbl_categoria.loja_filial
from tbl_produto
inner join tbl_categoria on tbl_produto.id_cat = tbl_categoria.id_cat;

select nome from tbl_produto where id_cat = 3;