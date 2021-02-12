create database db_ecommerce;
use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
descricao varchar(255) not null,
plataforma varchar(20) not null,
preco float not null,
midia varchar(10) not null,
disponivel boolean not null,
primary key(id)
);

select * from tb_produtos;

insert into tb_produtos (descricao, plataforma, preco, midia, disponivel)
values ("UFC", "PS5", 300.00, "Digital", true);

select descricao, plataforma, preco from tb_produtos where preco > 500;
select descricao, plataforma, preco from tb_produtos where preco < 500;

update tb_produtos set plataforma = "PS5" where id = 3;
update tb_produtos set descricao = "The Last of Us Part 2" where id = 3;
