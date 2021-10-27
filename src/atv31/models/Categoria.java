package models;


public class Categoria extends BaseID{
    public String descricao;

    @Override
    public String toString() {        
        return "\n Categoria ID:" + this.id + "\n Categoria: " + this.descricao+ "\n\n";
    }
}