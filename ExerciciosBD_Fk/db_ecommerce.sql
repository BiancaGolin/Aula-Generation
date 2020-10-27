create database db_ecommerce;
use db_ecommerce;

create table tb_produto(
id_pro bigint auto_increment,
nome varchar(100) not null,
preco float not null,
marca varchar(100),
frete double,
id_cat bigint,
primary key (id_pro),
foreign key (id_cat) references tb_categoria (id_cat)
);

create table tb_categoria(
id_cat bigint auto_increment,
sessao varchar(100),
fornecedor varchar(100),
primary key (id_cat)
);

insert into tb_categoria (sessao, fornecedor) values
('Smartphone', 'Loja Oficial'),
('Eletrodomesticos', 'Lojas Americanas'),
('Limpeza', 'Casa da Limpeza'),
('Vestuário', 'Renner'),
('Mercado', 'Sams Club');

insert into tb_produto (nome, preco, marca, frete, id_cat) values
('iPhone 12', 15000.99, 'Apple', 23.50, 1),
('Liquidificador', 135.99, 'Arno', 15.99, 2),
('Detergente', 1.99, 'Ypê', 0.00, 3),
('Camiseta', 120.50, 'Adidas', 4.99, 4),
('Feijão', 9.99, 'Broto Legal', 2.49, 5),
('Note10', 2899.95, 'Xiaomi', 15.20, 1),
('Note20S', 5499.99, 'Samsung', 10.00, 1),
('Geladeira', 1999.99, 'Electrolux', 135.00, 2),
('Microondas', 599.95, 'Brastemp', 99.95, 2),
('Sabão em pó', 35.99, 'Omo', 3.50, 3),
('Sabonete', 1.99, 'Dove', 0.00, 3),
('Calça', 200.00, 'Levis', 10.00, 4),
('Blusa de Moletom', 120.00, 'Nike', 20.50, 4),
('Arroz', 15.99, 'Prato Fino', 1.99, 5),
('Manteiga', 19.99, 'Aviação', 1.99, 5);

select * from tb_produto where preco > 2000.00;
select * from tb_produto where preco between 1000.00 and 2000.00;
select * from tb_produto where nome like 'c%';
