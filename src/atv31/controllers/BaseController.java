package controllers;

import java.util.ArrayList;

public class BaseController<T> {

    public ArrayList<T> lista;

    public BaseController(){
        lista = new ArrayList<T>();
    }

    //CRUD
    public void create(T obj){
        this.lista.add(obj);
    }

    public ArrayList<T> read(){
        return lista;

    }

    public void update(T obj){
        if(existe(obj)){
            delete(obj);
            create(obj);
        }
    }

    public void delete(T obj){
        this.lista.remove(obj);

    }

    public boolean existe(T obj){
        return this.lista.contains(obj);         
    }


    
}
