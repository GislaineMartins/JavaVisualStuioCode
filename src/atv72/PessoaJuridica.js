import { Pessoa } from "./Pessoa";

export  class PessoaJuridica extends Pessoa{
    cnpj;

    constructor(cnpj){
        super();
        this.cnpj = cnpj;        
    }

   
}