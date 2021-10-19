package atv26;

public class Pessoa {

    public String nome;
    public String sobrenome;
    public int idade;

    
    @Override
    public boolean equals(Object obj) {
        Pessoa pessoa = (Pessoa)obj;
        if(this.nome.equals(obj.nome) && this.sobrenome.equals(obj.sobrenome) && this.idade.equals(obj.idade)){
            return true;
        }
        return false;       
    }


    @Override
    public String toString() {
        String msg = "Nome: " + this.nome
        + "Sobrenome: " + this.sobrenome
        + "Idade: " + this.idade;
        return msg;
    }
    
}
