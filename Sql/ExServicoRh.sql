create database db_ex_servico_rh;
use db_ex_servico_rh;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(50) not null,
idade int not null,
setor varchar(50) not null,
cargo varchar(50) not null,
salario float not null,
primary key (id)
);

select * from tb_funcionarios;

insert into tb_funcionarios(nome, idade, setor, cargo, salario) 
values ("Joao", 43, "Administrativo", "Aux. Administrativo", 1500);
insert into tb_funcionarios(nome, idade, setor, cargo, salario) 
values ("Carla", 22, "Compras", "Aux. Compras", 1700);
insert into tb_funcionarios(nome, idade, setor, cargo, salario) 
values ("Marcela", 38, "Vendas", "Vendedor(a)", 2700);
insert into tb_funcionarios(nome, idade, setor, cargo, salario) 
values ("Ed", 57, "Contabilidade", "Contador(a)", 4000);

select nome, cargo, salario from tb_funcionarios where salario > 2000;

select id, nome, cargo, salario from tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 1500 where id = 1;
