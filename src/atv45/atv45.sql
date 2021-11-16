--Dentro de uma única transação, adicione um páis, 3 estados 
--e 6 cidades
begin transaction; 
	INSERT INTO public.pais
	(nome, sigla)
	VALUES('Estados Unidos', 'USA');
    commit;
    
	INSERT INTO public.estado
	(nome, sigla, pais_id)
	VALUES('Alaska', 'AK', 2);
    commit;
   
   INSERT INTO public.estado
	(nome, sigla, pais_id)
	VALUES('California', 'CA', 2);
    commit;
   
    INSERT INTO public.estado
	(nome, sigla, pais_id)
	VALUES('Florida', 'FL', 2);
    commit;
   
    INSERT INTO public.cidade
	(nome, sigla, estado_id)
	VALUES('Orlando', 'OL', 3);
    commit;
   
    INSERT INTO public.cidade
	(nome, sigla, estado_id)
	VALUES('Bradford', 'BD', 3);
    commit;
   
    INSERT INTO public.cidade
	(nome, sigla, estado_id)
	VALUES('São Francisco', 'SF', 2);
    commit;
   
    INSERT INTO public.cidade
	(nome, sigla, estado_id)
	VALUES('San Diego', 'SD', 2);
    commit;
   
    INSERT INTO public.cidade
	(nome, sigla, estado_id)
	VALUES('Anchorage', 'AG', 1);
    commit;
   
    INSERT INTO public.cidade
	(nome, sigla, estado_id)
	VALUES('Juneau', 'JU', 2);
    commit;
 end;


--Selecione todas as cidades, seus estados e países. Deve exibir 
--o id da cidade, o nome, o id do estado, o nome do estado, 
--a sigla do estado, o id do país e a sigla do país.

-- Para a atividade do select, utilize: join, alias(as) para as 
--tabelas e colunas para diferenciar as colunas nome e id 
--entre as tabelas.