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
 select * from tb_marcas where nome like "%Addidas%";
 
 create table tb_produtos(
 id bigint auto_increment,
 nome varchar(50) not null,
 preco decimal(10,2) not null,
 marca_id bigint not null,
 primary key(id),
 foreign key (marca_id) references tb_marcas (id)
 )
 
 select * from tb_produtos;
 
 insert into tb_produtos(nome, preco, marca_id)
 values ("Meia", 39.90, 1);
 
 -- JOIN
 -- on = onde. inner join = cruzar as tabelas e ver o que elas tem em comum
select * from tb_produtos
inner join tb_marcas on tb_marcas.id = tb_produtos.marca_id;

-- trazer somente as colunas que interessam
select tb_produtos.nome, tb_produtos.preco, tb_marcas.nome 
from tb_produtos
inner join tb_marcas on tb_marcas.id = tb_produtos.marca_id
where tb_marcas.nome like "%Nike%"
 -- and tb_produtos.preco < 50.00
 or tb_marcas.nome = "Fatal Surff"; -- or = ou
 
 -- left = vai levar em consideracao a tabela da esquerda, que seria o "nome" do produto.
 select tb_produtos.nome, tb_produtos.preco, tb_marcas.nome 
from tb_produtos
left join tb_marcas on tb_marcas.id = tb_produtos.marca_id;

-- left = vai levar em consideracao a tabela da direita, que seria o "nome" da marca.
 select tb_produtos.nome, tb_produtos.preco, tb_marcas.nome 
from tb_produtos
left join tb_marcas on tb_marcas.id = tb_produtos.marca_id;



 