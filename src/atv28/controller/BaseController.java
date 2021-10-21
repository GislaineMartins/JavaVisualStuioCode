package controller;

import java.util.ArrayList;

public class BaseController<E> {

    private ArrayList<E> dados;

    public BaseController(){
        this.dados = new ArrayList<E>();
    }

    public int numeroIitens(){
        return dados.size();
    }

    public void create(E obj){
        this.dados.add(obj);
    }

    public ArrayList<E> read(){
        return this.dados;
    }

    public void update(E obj){
        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(E obj){
        this.dados.remove(obj);
    }

    public boolean existe(E obj){
        return this.dados.contains(obj);
    }


}
