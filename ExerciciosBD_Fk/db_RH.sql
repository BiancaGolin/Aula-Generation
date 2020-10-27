create database db_RH2;
use db_RH2;

create table tb_funcionario(
id bigint auto_increment,
nome varchar (150) not null,
cpf varchar (11) not null,
salario float not null,
ativo boolean,
id_cargo bigint,
primary key (id),
foreign key (id_cargo) references tb_cargo (id_cargo)
);

create table tb_cargo(
id_cargo bigint auto_increment,
nome_cargo varchar(100) not null,
area_cargo varchar(100) not null,
primary key(id_cargo)
);

insert into tb_cargo (nome_cargo, area_cargo) values
('Analista de RH', 'Recursos Humanos'),
('Desenvolvedor Java', 'Tecnlogia'),
('DevOps', 'Tecnlogia'),
('Coordenador Financeiro', 'Financeiro'),
('Diretor de Tecnologia', 'Tecnlogia');

select * from tb_cargo;
select * from tb_funcionario;

insert into tb_funcionario (nome, cpf, salario, ativo, id_cargo) values
('Amanda Silva', '11122233344', 7500.00, true, 1),
('Gabriela Santos', '68313344075', 4500.00, true, 1),
('Lais Pereira', '81190810050', 5500.00, true, 2),
('Alessandra Marques', '89663117095', 6500.00, true, 4),
('Vagner Souza', '15612461070', 9500.00, true, 3),
('Julia Ulrich', '13789249084', 1500.00, false, 1),
('Jonas Johson', '95763436075', 7500.00, true, 2),
('Andre Ribeiro', '56303801099', 25500.00, false, 5),
('Jack Moura', '40869957007', 7500.00, true, 4),
('Daiane Nascimento', '01959599062', 1500.00, true, 2),
('Caue Santos', '10189824000', 1000.00, true, 2),
('Igor Honor', '74360585098', 3500.00, true, 2),
('Felipe Freitas', '17629502001', 980.00, false, 1),
('Giovana Elton', '07494913025', 1700.00, true, 1),
('Roberto Silva', '51632106027', 7500.00, true, 3);

select * from tb_funcionario where salario > 2000.00;
select * from tb_funcionario where salario between 1000.00 and 2000.00;
select * from tb_funcionario where nome like '%c%';
