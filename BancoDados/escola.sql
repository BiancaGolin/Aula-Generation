create database db_escola;

use db_escola;

create table tb_aluno(
id bigint auto_increment,
nome varchar(150) not null,
matricula bigint,
curso varchar(80) not null,
nota double not null,
primary key (id)
);

insert into tb_aluno (nome, matricula, curso, nota) values
('Armando Pereira', 1234, 'Ensino Fundamental', 7.5),
('Gabriela Santos', 1235, 'Ensino Médio', 8.9),
('Vinicius Marques', 1236, 'Ensino Infantil', 4.5),
('Vanessa Concha', 1236, 'Técnico', 6.8),
('Yara Martins', 1237, 'Técnico', 7.5),
('Felipe Souza', 1238, 'Ensino Médio', 8),
('Mauricio Pascoal', 1239, 'Ensino Fundamental', 9.5),
('Adriana Santos', 1240, 'Ensino Médio', 10);

select * from tb_aluno where nota > 7;
select * from tb_aluno where nota < 7;
update tb_aluno set curso = 'Técnico' where nome = 'Gabriela Santos';

select * from tb_aluno;