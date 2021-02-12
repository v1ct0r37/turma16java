create database db_estoque;

use db_estoque;

create table tb_marcas(
id bigint(5) auto_increment, -- 99999
nome varchar(20) not null,
ativo boolean,
primary key(id)
)

select * from tb_marcas;

insert into tb_marcas(nome, ativo) values ("Nike", true);
insert into tb_marcas(nome, ativo) values ("Fatal Surf", false);
insert into tb_marcas(nome, ativo) values ("Addidas", true);
insert into tb_marcas(nome, ativo) values ("Renner", true);
insert into tb_marcas(nome, ativo) values ("Americanas", true);
insert into tb_marcas(nome, ativo) values ("Puma", true);
insert into tb_marcas(nome, ativo) values ("Nike", true);

update tb_marcas set nome = "Fatal Surff", ativo = true
 where id = 2;
 
 delete from tb_marcas where id = 3;
 
 -- selecionar uma coluna especifica com LIKE
 select * from tb_marcas where nome like "%Addidas%"