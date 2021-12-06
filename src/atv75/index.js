import bodyParser from 'body-parser';
import  Express  from 'express';
import ClienteApi from './api/ClienteApi.js'


const api = Express();
api.use(bodyParser.json());
api.listen(3000, ()=> console.log("Rodando..."))
api.use('api/cliente',ClienteApi)





//npm install sequelize - usado para instalar biblioteca para persistencia do banco de dados
// npm install pg -  drive de conexão com o banco de dados 
// para criar as as tabelas no banco de dados.  node .\db\GerarDataBase.js 


