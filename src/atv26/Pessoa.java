package atv26;

public class Pessoa {

    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public String toString() {
        String msg = "Nome: " + this.nome
        + "Sobrenome: " + this.sobrenome
        + "Idade: " + this.idade;
        return msg;
    }
    
}
