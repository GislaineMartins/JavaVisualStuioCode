import Database from './Database.js';

Database.sync() // vai atualizar o banco de dados
  .then(() => console.log('Sincronizando database')) 
  .catch(() => console.log('Deu erro'));