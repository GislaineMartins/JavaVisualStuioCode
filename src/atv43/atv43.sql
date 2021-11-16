--Liste todos os dados de todas as colunas da tabela Categoria.
SELECT *FROM categoria;

-- Liste todos os dados de todas as colunas da tabela Produto.
select * from produto;


-- Liste os dados de todas as colunas da tabela Categoria, para as linhas que possuam uma descrição preenchida.
select id, nome, descricao from categoria where descricao != ''

-- Liste os dados das colunas Id, nome e preço da tabela Produto, para as linhas que possuem um nome iniciando com C
-- Criando produto com C, pois nao tinha
INSERT INTO public.produto
(nome, descricao, codigo, preco, categoria_id)
VALUES('Computador', 'LG All in One Quad Core 4GB ', 3336, 6069, 2);

select id, nome, preco from produto where nome like 'C%';

-- Liste os dados das colunas Id, nome e preço da tabela Produto 
--e os dados id, nome e descrição da tabela Categoria para as linhas que possuem um preço maior que 0.
SELECT p.Id, p.nome, p.preco, c.id , c.nome , c.descricao 
FROM produto as p
INNER JOIN categoria as c
ON p.categoria_id = c.id 

-- Liste os dados de todas as colunas da tabela Produto 
--que possuem categoria com Id maior que 2.
select * from produto where id > 2

