import Cliente from './model/Cliente.js';
import ClienteTable from './db/ClienteTable.js';

console.log("==========Cliente======")
const cli = new Cliente();
cli.codigo = 1111;
cli.numeCartaoCredito = 111;
cli.nome =  "Joaquim";

//const result = await ClienteTable.create(cli); // Insert no banco de dados
/*const result = await ClienteTable.update(cli,{
    where:{id:1}
});
*/

const result = await ClienteTable.destroy({
    where:{id:1}
});

console.log(result);
const lista = await ClienteTable.findAll();
console.log(lista);








//npm install sequelize - usado para instalar biblioteca para persistencia do banco de dados
// npm install pg -  drive de conexão com o banco de dados 
// para criar as as tabelas no banco de dados.  node .\db\GerarDataBase.js 


