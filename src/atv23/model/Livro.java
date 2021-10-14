package atv23.model;

/**
 * Livro
 */
public class Livro{ 

private int id;
private String autor;
private String nome;
private String editora;

public Livro(int id) {
    this.id = id;
}

public int getId() {
    return id;
}

public String getAutor() {
    return autor;
}
public void setAutor(String autor) {
    this.autor = autor;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getEditora() {
    return editora;
}
public void setEditora(String editora) {
    this.editora = editora;
}








    
}