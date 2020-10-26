create database db_rh;

use db_rh;

create table tb_funcionario (
id bigint auto_increment,
nome varchar (150) not null,
cpf varchar (11) not null,
salario float not null,
cargo varchar (50),
primary key (id)
);

insert into tb_funcionario (nome, cpf, salario, cargo) values (
'Pedro Sampaio', '44411122299', 2500.50, 'Analista Jr',
'Priscila Santos', '11122233344', 10358.20, 'Gerente de Contas',
'Renata Souza', '55566677788', 3400.00, 'Assistente Administrativa',
'Amanda Brandao', '88899911122', 7800.00, 'Coordenadora',
'Lais Prantos', '33344455566', 7500.00, 'Analista Marketing'
);

update tb_funcionario set salario = 1950.20 where id = 1;
select * from tb_funcionario where salario > 2000.00;
select * from tb_funcionario where salario < 2000.00;
update tb_funcionario set salario = 15000.00 where id = 2;

select * from tb_funcionario;