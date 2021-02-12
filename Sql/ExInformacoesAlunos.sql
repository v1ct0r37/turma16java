create database db_informacoes_alunos;

use db_informacoes_alunos;

create table tb_alunos(
id bigint auto_increment,
nome varchar(40) not null,
periodo varchar(20) not null,
turma varchar(10) not null,
materia varchar(20) not null,
nota double not null,
primary key(id)
);

select * from tb_alunos;

insert into tb_alunos (nome, periodo, turma, materia, nota)
values ("Victor", "Tarde", "15", "Java", 9.5);
insert into tb_alunos (nome, periodo, turma, materia, nota)
values ("Fernando", "Tarde", "14", "JavaScript", 4.8);
insert into tb_alunos (nome, periodo, turma, materia, nota)
values ("Mayara", "Manha", "6", "Java", 7.7);
insert into tb_alunos (nome, periodo, turma, materia, nota)
values ("Candido", "Noite", "3", "Portugol", 8.8);
insert into tb_alunos (nome, periodo, turma, materia, nota)
values ("Camila", "Noite", "3", "Java", 3.3);
insert into tb_alunos (nome, periodo, turma, materia, nota)
values ("Junior", "Tarde", "1", "JavaScript", 5.5);
insert into tb_alunos (nome, periodo, turma, materia, nota)
values ("Rafael", "Manha", "6", "Java", 9.6);
insert into tb_alunos (nome, periodo, turma, materia, nota)
values ("Carlos", "Tarde", "15", "Java", 6);

select id, nome, turma, materia, nota from tb_alunos where nota > 7;
select id, nome, turma, materia, nota from tb_alunos where nota < 7;

update tb_alunos set nota = 8 where id = 2;