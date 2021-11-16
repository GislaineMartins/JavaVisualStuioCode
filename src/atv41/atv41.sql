create table produto(
	id int primary key generated always as identity
	,nome varchar(50) not null
	,descricao varchar(50) not null
	,codigo int not null
	,preco float not null
);

create table categoria(
	id int primary key generated always as identity
	,nome varchar(50) not null
	,descricao varchar(50) null	
	
);

create table carro(
	id int primary key generated always as identity
	,modelo varchar(50) not null
	,marca varchar(50) not null	
);

alter table carro 
add column chassi varchar(200) not null

alter table carro 
add column ano int not null

alter table produto drop column codigo

drop table carro

alter table produto 
add column categoria_id int not null

ALTER TABLE categoria
ADD CONSTRAINT fk_produto FOREIGN KEY (id) REFERENCES produto (id)