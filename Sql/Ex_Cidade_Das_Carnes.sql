create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(10) not null,
entrega char(1) not null,
disponivel char(1) not null,
primary key(id)
);

select * from tb_categoria;

insert into tb_categoria (tipo, entrega, disponivel) values ("Bovina", "S", "S");
insert into tb_categoria (tipo, entrega, disponivel) values ("Suína", "S", "S");
insert into tb_categoria (tipo, entrega, disponivel) values ("Aves", "S", "S");
insert into tb_categoria (tipo, entrega, disponivel) values ("Peixes", "S", "S");
insert into tb_categoria (tipo, entrega, disponivel) values ("Ovina", "S", "S");

create table tb_produto(
id bigint auto_increment,
nome varchar(30) not null,
tipo_de_corte varchar(15) not null,
preco double(10, 2) not null,
desconto char(1) not null,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);

select * from tb_produto;

insert into tb_produto (nome, tipo_de_corte, preco, desconto, categoria_id)
	values ("Boi", "Filé mignon", 69.00, "S", 1);
insert into tb_produto (nome, tipo_de_corte, preco, desconto, categoria_id)
	values ("Boi", "Fraldinha", 39.00, "S", 1);
insert into tb_produto (nome, tipo_de_corte, preco, desconto, categoria_id)
	values ("Boi", "Acém", 59.00, "S", 1);
insert into tb_produto (nome, tipo_de_corte, preco, desconto, categoria_id)
	values ("Boi", "maminha", 69.00, "S", 1);
insert into tb_produto (nome, tipo_de_corte, preco, desconto, categoria_id)
	values ("Porco", "Bisteca", 29.00, "S", 2);
insert into tb_produto (nome, tipo_de_corte, preco, desconto, categoria_id)
	values ("Peixe", "Filé", 59.00, "S", 4);
insert into tb_produto (nome, tipo_de_corte, preco, desconto, categoria_id)
	values ("Ovina", "Pernil", 39.00, "S", 5);
insert into tb_produto (nome, tipo_de_corte, preco, desconto, categoria_id)
	values ("Aves", "Filé ", 38.00, "S", 1);
    
 -- select produtos com valor maior que 50R$
select * from tb_produto where preco > 50.00;

-- select produtos com a letra F 
select * from tb_produto where tipo_de_corte like "F%";

select tb_categoria.tipo, tb_produto.tipo_de_corte, tb_produto.preco
	from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_categoria.tipo, tb_produto.tipo_de_corte, tb_produto.preco
	from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tipo like "%Bovina%";

