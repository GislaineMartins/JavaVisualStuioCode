import Database from './Database.js';
import ClienteTable from './ClienteTable.js'


Database.sync() // vai atualizar o banco de dados
  .then(() => console.log('Sincronizando database')) 
  .catch(() => console.log('Deu erro'));