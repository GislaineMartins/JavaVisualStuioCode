package models;

public class Produto extends BaseID{
    public String nome;
    public Categoria categoria;

    public Produto(){
        categoria = new Categoria();
    }

    @Override
    public String toString() {    
        return "Produto ID: " + this.id + "\n Nome: " + this.nome + this.categoria.toString();
    }
    
}
