package model;

public class Serie {

    public int id;
    public String titulo;
    public String categoria;
    public int qtdTemporadas;
    public int ano;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Serie){
            Serie serie = (Serie)obj;
            if(this.id == serie.id){
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        String mensagem = "Id: " + this.id + " Titulo: " + this.titulo 
        + " Categoria: " + this.categoria + " Quantidade de temporadas: " 
        + this.qtdTemporadas + " Ano: " + this.ano;
        return mensagem;
    }
    
}
