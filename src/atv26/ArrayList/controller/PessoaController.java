package atv26.ArrayList.controller;

import java.util.ArrayList;

import atv26.ArrayList.model.Pessoa;



public class PessoaController {

    private ArrayList<Pessoa> dados;  
 

    public PessoaController() {
        this.dados = new ArrayList<Pessoa>();
    }

    public int numeroItens() {
        return dados.size();
    }

    public ArrayList<Pessoa> read(){
        return this.dados;
    }

    public void update(Pessoa obj){

        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }

    }
   
    public void create(Pessoa obj) {
        this.dados.add(obj);
    }

    public void delete(Pessoa obj) {
        this.dados.remove(obj);
    }

    public boolean existe(Pessoa obj){
       return  this.dados.contains(obj);

    }






    
}
