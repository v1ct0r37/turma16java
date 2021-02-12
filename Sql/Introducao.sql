-- cria uma banco de dados
create database db_servico_rh;

-- acessa o banco de dados
use db_servico_rh;

-- cria tabelas
create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
salario float not null,
primary key(id)
);

-- busca das informações da tabela
select * from tb_funcionarios;
select nome, salario from tb_funcionarios where salario = 20000;

-- cadastra dados na minha tabela
insert into tb_funcionarios (nome,idade,salario) values ("Rafael",00,10000);
insert into tb_funcionarios (nome,idade,salario) values ("Rafao top instrutor",00,10000);
insert into tb_funcionarios (nome,idade,salario) values ("Maria",00,10000);

-- add coluna na tabela
alter table tb_funcionarios
add descricao varchar(255);

-- alterar descricao da tabela
alter table tb_funcionarios change descricao_funcionario varchar(255);

-- atualiza um dado na tabela
update tb_funcionarios set salario = 20000 where id = 2;

-- deleta 
delete from tb_funcionarios where id = 3;
