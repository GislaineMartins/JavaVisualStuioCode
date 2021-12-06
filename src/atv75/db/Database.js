import  Sequelize from "sequelize";

const Database = new Sequelize(
    'postgres' //database
    ,'postgres' //user
    ,'123456' //senha
    ,{
        host: 'localhost', //endereço do server
        port: 5434, // porta do postgress
        dialect: 'postgres'
    }
);

export default Database;

