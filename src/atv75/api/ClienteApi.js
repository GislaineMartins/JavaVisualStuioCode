import {Router} from 'express';
import Cliente from './../model/Cliente.js'
import ClienteRepository from './../repository/ClienteRepository.js'

const ClienteApi = Router();
const repository = new ClienteRepository();

ClienteApi.get('/', async (req, resp)=>{
    
    const lista = await repository.findAll();
    resp.send(lista);

});


ClienteApi.post('/', async (req, resp)=>{
    const cliente = new Cliente();
    cliente.codigo = req.body.codigo;
    cliente.numeCartaoCredito = req.body.numeCartaoCredito;
    cliente.nome = req.body.nome;

    const retorno = await repository.create(cliente);
    resp.send(retorno);
    
});

ClienteApi.put('/:id', async (req, resp)=>{

    const cliente = new Cliente();
    cliente.id = req.params.id;
    cliente.codigo = req.body.codigo;
    cliente.numeCartaoCredito = req.body.numeCartaoCredito;
    cliente.nome = req.body.nome;
    const retorno = await repository.update(cliente);
    resp.send(retorno);

});

ClienteApi.delete('/:id', async (req, resp)=>{
    const id = req.params.id;
    const retorno = await repository.delete(id);
    resp.send(JSON.stringify(retorno)); 
});

export default ClienteApi;

