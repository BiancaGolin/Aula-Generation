create database db_acougue;
use db_acougue;

create table tb_categorias(
id_cat bigint auto_increment,
nome_cat varchar(50) not null,
congelado varchar(100) not null,
primary key(id_cat)
);

create table tbl_produto(
id_prod bigint auto_increment,
produto varchar(100) not null,
preco decimal (4,2) not null,
qtd_prod float not null,
marca varchar(100) not null,
id_cat bigint,
primary key(id_prod),
foreign key(id_cat) references tb_categorias(id_cat)
);

insert into tb_categorias (nome_cat, congelado) values
('Aves', true),
('Bovina', false),
('Suino', true),
('Peixaria', true),
('Outros', false);

insert into tbl_produto (produto, preco, qtd_prod, marca, id_cat) values
('Peito de frango', 15.99, 2, 'Sadia', 1),
('Coxão mole', 46.99, 1,'Friboi', 2),
('Filé Mignon', 60.00, 1, 'Friboi', 2),
('Costela Suina', 26.93, 2, 'Perdigão', 3),
('Lombo Suino', 29.99, 2, 'Sadia', 3),
('Salmão', 75.99, 1, 'Swift', 4),
('Pão de alho', 7.99, 3, 'Santa Massa', 5),
('Queijo coalho', 21.99, 2, 'President', 5);

select * from tbl_produto;

select * from tbl_produto where preco > 50.00;
select * from tbl_produto where preco between 3.00 and 60.00;
select * from tbl_produto where produto like '%co%';

select nome_cat, congelado, tbl_produto.produto, tbl_produto.preco, tbl_produto.qtd_prod, tbl_produto.marca
from tbl_produto
inner join tb_categorias on tbl_produto.id_cat = tb_categorias.id_cat;

select produto from tbl_produto where id_cat = 2;