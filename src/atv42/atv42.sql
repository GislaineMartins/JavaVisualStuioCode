-- Inserindo categoria
INSERT INTO public.categoria
(nome, descricao)
VALUES('Informatica', 'produtos voltados para tecnologia');

INSERT INTO public.categoria
(nome, descricao)
VALUES('Moveis', 'produtos para decoração do ambiente');

--Mostrando dados de categoria
select * from categoria

--Mostrando dados de produtos
select * from produto

-- Inserindo produtos
INSERT INTO public.produto
(nome, descricao, codigo, preco, categoria_id)
VALUES('Geladeira', 'Eletrolux Duples', 2134, 2700, 1);

INSERT INTO public.produto
(nome, descricao, codigo, preco, categoria_id)
VALUES('Lavadora de roupas', 'Consul', 2135, 1399, 1);

INSERT INTO public.produto
(nome, descricao, codigo, preco, categoria_id)
VALUES('Guarda-roupa', '2 portas de correr 4 gavetas', 1123, 849, 3);

INSERT INTO public.produto
(nome, descricao, codigo, preco, categoria_id)
VALUES('Sofá', '3 lugares', 1124, 1398.60, 3);

INSERT INTO public.produto
(nome, descricao, codigo, preco, categoria_id)
VALUES('Notbooks', 'Lenovo AMD Ryzen 123', 3335, 3199, 2);

INSERT INTO public.produto
(nome, descricao, codigo, preco, categoria_id)
VALUES('Computador', 'LG All in One Quad Core 4GB ', 3336, 6069, 2);


-- Alterando a descricao do produto notbook
UPDATE
  produto
SET
  descricao = 'Lenovo AMD Ryzen 123'
WHERE
  id = 5
  
 -- Alterando a descricao do produto guarda-roupa
  UPDATE
  produto
SET
  descricao = '2 portas de correr'
WHERE
  id = 3
  
  -- Deletando um produto de uma categoria
  DELETE FROM produto WHERE codigo=3336;
 
 -- Alterando a categoria de um produto
  UPDATE
  produto
SET
  categoria_id = 2
WHERE
  id = 1
  
  
 
 
 
