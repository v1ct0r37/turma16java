create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
id bigint(5) auto_increment,
nome varchar(20) not null,
cargo varchar(20) not null,
salario double(10, 2) not null,
primary key(id)
);

select * from tb_classe;

insert into tb_classe (nome, cargo, salario) values ("Victor", "Vendedor", 2500);
insert into tb_classe (nome, cargo, salario) values ("Marcela", "Gerente", 4500);
insert into tb_classe (nome, cargo, salario) values ("Felipe", "Vendedor", 2600);
insert into tb_classe (nome, cargo, salario) values ("Caio", "Vendedor", 2500);
insert into tb_classe (nome, cargo, salario) values ("Fernando", "Gerente", 4500);



create table tb_personagem(
id bigint(5) auto_increment,
nome_heroi varchar(20) not null,
poder_ataque int not null,
poder_defesa int not null,
velocidade varchar(30) not null,
heroi_marvel_ou_dc varchar(10) not null,
funcionario_id bigint not null,
primary key(id),
foreign key(funcionario_id) references tb_classe (id)
);

select * from tb_personagem;

insert into tb_personagem (nome_heroi, poder_ataque, poder_defesa, velocidade, heroi_marvel_ou_dc, funcionario_id)
	values ("Homem de Ferro", 3000, 2300, 1800, "Marvel", 1);
insert into tb_personagem (nome_heroi, poder_ataque, poder_defesa, velocidade, heroi_marvel_ou_dc, funcionario_id)
	values ("Capitão América", 2000, 4300, 1850, "Marvel", 2);
insert into tb_personagem (nome_heroi, poder_ataque, poder_defesa, velocidade, heroi_marvel_ou_dc, funcionario_id)
	values ("Hulk", 5000, 3300, 1200, "Marvel", 3);
insert into tb_personagem (nome_heroi, poder_ataque, poder_defesa, velocidade, heroi_marvel_ou_dc, funcionario_id)
	values ("Thor", 6000, 2300, 1600, "Marvel", 1);
insert into tb_personagem (nome_heroi, poder_ataque, poder_defesa, velocidade, heroi_marvel_ou_dc, funcionario_id)
	values ("Super Man", 4000, 3300, 4800, "DC", 4);
insert into tb_personagem (nome_heroi, poder_ataque, poder_defesa, velocidade, heroi_marvel_ou_dc, funcionario_id)
	values ("Batman", 2000, 1300, 800, "DC", 5);    
insert into tb_personagem (nome_heroi, poder_ataque, poder_defesa, velocidade, heroi_marvel_ou_dc, funcionario_id)
	values ("Mulher - Maravilha", 4000, 4300, 3800, "DC", 1);
insert into tb_personagem (nome_heroi, poder_ataque, poder_defesa, velocidade, heroi_marvel_ou_dc, funcionario_id)
	values ("Flash", 2500, 2300, 6800, "DC", 2);
    


-- funcionario poder de ataque
select tb_classe.nome, tb_personagem.poder_ataque
from tb_personagem, tb_classe
where tb_personagem.poder_ataque > 2000;

-- funcionario poder defesa
select tb_classe.nome,  tb_personagem.poder_defesa
from tb_personagem, tb_classe
where tb_personagem.poder_defesa between 1000 and 2000;

-- Buscando Personagem com a letra C 
select * from tb_personagem
	where nome_heroi like "%C%";
    

-- Inner Join
select tb_classe.nome, tb_personagem.nome_heroi, tb_personagem.heroi_marvel_ou_dc
from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.funcionario_id;  

-- Classe Especifica
select * from tb_personagem
where tb_personagem.heroi_marvel_ou_dc like "DC";



