import { Categoria } from "./Categoria.js";
import { Produto } from "./Produto.js";

const cat = new Categoria();
cat.id = 1;
cat.nome = "cat";
cat.descricao = "cat teste";

const prod = new Produto();
prod.id = 1;
prod.nome = "prod";
prod.descricao = "prod teste";
prod.codigo = 12112;
prod.preco = 2323.45;
prod.categoriaId = 1;

console.log(cat);
console.log(prod)
