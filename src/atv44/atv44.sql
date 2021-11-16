--Crie uma tabela Carros com id, marca e modelo.
create table carros(
	id int primary key generated always as identity
	,marca varchar(70) not null
	,modelo varchar(50) not null
)

--Insira dois novos carros dentro desta tabela.
INSERT INTO public.carros
(marca, modelo)
VALUES('Chevrolet', 'Onix');

INSERT INTO public.carros
(marca, modelo)
VALUES('Fiat', 'Argo');

INSERT INTO public.carros
(marca, modelo)
VALUES('Ford', 'ecoesport');

-- Execute todos os comandos em uma única transação.
begin transaction

create table carros(
	id int primary key generated always as identity
	,marca varchar(70) not null
	,modelo varchar(50) not null
)

INSERT INTO public.carros
(marca, modelo)
VALUES('Chevrolet', 'Onix');

INSERT INTO public.carros
(marca, modelo)
VALUES('Fiat', 'Argo');

INSERT INTO public.carros
(marca, modelo)
VALUES('Ford', 'ecoesport');
 
end

-- Crie uma tabela país com id(PK), nome e sigla.
create table pais(
	id int primary key generated always as identity
	,nome varchar(50) not null
	,sigla varchar(3) not null
)
--Crie uma tabela estado com id(PK), nome, sigla e pais_id(FK);
create table estado(
	id int primary key generated always as identity
	,nome varchar(50) not null
	,sigla varchar(3) not null
	,pais_id int
	,constraint fk_pais foreign key(pais_id)
	references pais(id)
)
--Crie uma tabela cidade com id(PK), nome e estado_id(FK);
create table cidade(
	id int primary key generated always as identity
	,nome varchar(50) not null
	,sigla varchar(3) not null
	,estado_id int
	,constraint fk_estado foreign key(estado_id)
	references estado(id)
)

-- Adicione um país, um estado e uma cidade. Execute os DDL e DML em uma mesma transação 
begin transaction; 
	INSERT INTO public.pais
	(nome, sigla)
	VALUES('Brasil', 'BR');
    commit;
    
	INSERT INTO public.estado
	(nome, sigla, pais_id)
	VALUES('Minas Gerais', 'MG', 1);
    commit;
   
    INSERT INTO public.cidade
	(nome, sigla, estado_id)
	VALUES('Juiz de Fora', 'JF', 1);
    commit;
 end;




