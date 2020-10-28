create database db_cursos;
use db_cursos;

create table tb_categoria(
id_categoria bigint auto_increment,
area_curso varchar(100) not null,
tipo_curso varchar(100) not null,
primary key(id_categoria)
);

create table tb_produto1(
id_produto bigint auto_increment,
preco_total float not null,
nome_curso varchar(100) not null,
duracao_curso int not null,
certificado boolean,
id_categoria bigint,
primary key(id_produto),
foreign key(id_categoria) references tb_categoria(id_categoria)
);

insert into tb_categoria (area_curso, tipo_curso) values
('Tecnologia', 'Bacharel'),
('Negócios', 'Bacharel'),
('Tecnologia', 'Intensivo'),
('Saúde e Bem Estar', 'Técnico'),
('Engenharias e Matemática', 'MBA');

insert into tb_produto1 (preco_total, nome_curso, duracao_curso, certificado, id_categoria) values
(35000.00, 'Análise e Desenvolvimento de Sistemas', 6, true, 1),
(60000.00, 'Administração de Empresas', 8, true, 2),
(2000.00, 'Linguaguem de Programação: Java I', 1, false, 3),
(45000.00, 'Estética e Cosmética', 8, true, 4),
(65000.00, 'Engenharia Civil', 10, true, 5),
(2500.00, 'Linguaguem de Programação: Java II', 1, false, 3),
(59.90, 'Interpretação de Exames de Sangue', 1, true, 4),
(45.90, 'Bussines Intelligence - Excel', 1, false, 3);

select * from tb_produto1 where preco_total > 50.00;
select * from tb_produto1 where preco_total between 3 and 60.00;
select * from tb_produto1 where nome_curso like '%jav%';

select preco_total, nome_curso, duracao_curso, certificado, tb_categoria.area_curso, tb_categoria.tipo_curso
from tb_produto1
inner join tb_categoria on tb_produto1.id_categoria = tb_categoria.id_categoria;