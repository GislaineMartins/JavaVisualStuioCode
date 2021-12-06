import { Pessoa } from "./Pessoa";

export  class PessoaFisica extends Pessoa{
    cpf;

    constructor(cpf){
        super();
        this.cpf = cpf;        
    }

}