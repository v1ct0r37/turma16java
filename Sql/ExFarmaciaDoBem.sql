create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(30) not null,
receita varchar(15) not null,
entrega varchar(20) not null,
primary key(id)
);

select * from tb_categoria;

insert into tb_categoria (tipo, receita, entrega) values ("Genéricos", "Sim", "Sim");
insert into tb_categoria (tipo, receita, entrega) values ("Vitaminas", "Não", "Sim");
insert into tb_categoria (tipo, receita, entrega) values ("Suplementos Alimentaries", "Não", "Não");
insert into tb_categoria (tipo, receita, entrega) values ("Higiene", "Não", "Sim");
insert into tb_categoria (tipo, receita, entrega) values ("Beleza", "Não", "Sim");


create table tb_produto (
id bigint auto_increment,
nome varchar(40) not null,
sexo char(1) not null,
preco double (10, 2) not null,
entrega char(1) not null,
desconto char(1) not null,
tipo_id bigint,
primary key (id),
foreign key (tipo_id) references tb_categoria (id)
);

select * from tb_produto;

insert into tb_produto (nome, sexo, preco, desconto, tipo_id)
	values ("Paracetamol","A", 32.00, "N", 1);
insert into tb_produto (nome, sexo, preco, desconto, tipo_id)
	values ("ACCUVIT 30 COMPRIMIDOS","A", 43.00,  "S", 2);   
insert into tb_produto (nome, sexo, preco, desconto, tipo_id)
	values ("KIT WHEY","A", 94.00, "S", 3);       
insert into tb_produto (nome, sexo, preco, desconto, tipo_id)
	values ("Sabonete Intimo","F", 23.00, "N", 4);       
insert into tb_produto (nome, sexo, preco, desconto, tipo_id)
	values ("Condicionador","A", 53.00, "S", 5);  
insert into tb_produto (nome, sexo, preco, desconto, tipo_id)
	values ("Acebutolol","A", 63.00, "S", 1); 
insert into tb_produto (nome, sexo, preco, desconto, tipo_id)
	values ("Shampoo","A", 13.00, "N", 5); 
insert into tb_produto (nome, sexo, preco, desconto, tipo_id)
	values ("Nova Souce","A", 53.00, "S", 3); 
    
    alter table tb_produto drop column entrega; --  deletar coluna
    
    -- select produtos com valor maior que 50R$
select * from tb_produto where preco > 50.00;

-- select produtos com valor entre 3 e 60 R$
select * from tb_produto where preco between 3.00 and 60.00;

-- select produtos com a letra S 
select * from tb_produto where nome like "S%";

-- inner join
select tb_categoria.tipo, tb_produto.nome, tb_produto.preco 
	from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.tipo_id;

select tb_categoria.tipo, tb_produto.nome 
from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.tipo_id
where tipo like "%Gene%";

