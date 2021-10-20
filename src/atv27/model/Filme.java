package model;

/**
 * Filme
 */
public class Filme {

    public int id;
    public String titulo;    
    public String categoria;
    public int ano;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Filme){
            Filme filme = (Filme)obj;
            if(this.id == filme.id){
                return true;
            }            
        }
        return false;
    }

    @Override
    public String toString() {
        String mensgem = "Id: " + this.id + " Titulo: " + this.titulo
        + " Categoria: " + this.categoria + " Ano: " + this.ano;
        return mensgem;
    }


}