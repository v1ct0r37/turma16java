create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tamanho varchar(10) not null,
tipo varchar(10) not null,
borda varchar(10) not null,
primary key (id)
);

select * from tb_categoria;

insert into tb_categoria (tamanho, tipo, borda) values ("G", "Doce", "C/Recheio"); 
insert into tb_categoria (tamanho, tipo, borda) values ("M", "Salgada", "S/Recheio");
insert into tb_categoria (tamanho, tipo, borda) values ("P", "Doce", "S/Recheio");
insert into tb_categoria (tamanho, tipo, borda) values ("M", "Doce", "C/Recheio");  
insert into tb_categoria (tamanho, tipo, borda) values ("G", "Doce", "S/Recheio");  


-- alterar tabelas
ALTER TABLE tb_categoria MODIFY borda varchar(60);
ALTER TABLE tb_categoria MODIFY id bigint auto_increment;


create table tb_pizza(
id bigint auto_increment,
nome varchar(30) not null,
preco double(10, 2) not null,
pre_assada boolean not null,
entrega boolean not null,
qtd_estoque int not null,
pizza_id bigint,
primary key (id),
foreign key (pizza_id) references tb_categoria (id)

);

select * from tb_pizza;

insert into tb_pizza (nome, preco, pre_assada, entrega, qtd_estoque, pizza_id) 
	values ("Mussarela", 54.00, true, true, 20, 2);
insert into tb_pizza (nome, preco, pre_assada, entrega, qtd_estoque, pizza_id) 
	values ("Calabresa", 64.00, true, false, 10, 2);  
insert into tb_pizza (nome, preco, pre_assada, entrega, qtd_estoque, pizza_id) 
	values ("Portuguesa", 34.00, true, true, 30, 2);
insert into tb_pizza (nome, preco, pre_assada, entrega, qtd_estoque, pizza_id) 
	values ("Chocolate", 79.00, false, true, 5, 1);
insert into tb_pizza (nome, preco, pre_assada, entrega, qtd_estoque, pizza_id) 
	values ("Morango", 34.00, true, true, 2, 5);
insert into tb_pizza (nome, preco, pre_assada, entrega, qtd_estoque, pizza_id) 
	values ("Napolitano", 24.00, true, true, 20, 3);   
insert into tb_pizza (nome, preco, pre_assada, entrega, qtd_estoque, pizza_id) 
	values ("Palmito", 54.00, true, false, 20, 2);    
insert into tb_pizza (nome, preco, pre_assada, entrega, qtd_estoque, pizza_id) 
	values ("Presunto", 24.00, true, true, 20, 2);    
    
-- select produtos com valor maior que 45 R$    
select * from tb_pizza where preco > 45.00;    

-- select produtos com valor entre 29 e 60 R$
select * from tb_pizza where preco between 29.00 and 60.00;

-- Like buscando produtos pela letra C
select * from tb_pizza where nome like "%C%";

-- Inner Join

Select tb_categoria.tamanho, tb_pizza.nome, tb_pizza.preco
	from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.pizza_id;

-- select produtos categoria

Select tb_categoria.tamanho, tb_categoria.tipo, tb_pizza.nome, tb_pizza.preco
	from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.pizza_id
where tipo like "%Doce%"; 