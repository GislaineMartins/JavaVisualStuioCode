import  Sequelize  from "sequelize";
import Database from "./Database.js";

const ClienteTable = Database.define('clientes', {
    id:{
        type: Sequelize.INTEGER,
        allowNull: false,
        autoIncrement: true,
        primaryKey: true,

    },
    codigo:{
        type: Sequelize.INTEGER,
        allowNull: false
    },

    numeCartaoCredito:{
        type: Sequelize.INTEGER,
        allowNull: false
        
    },
    nome:{
        type: Sequelize.STRING,
        allowNull: false
    }

});

export default ClienteTable;

