package atv26;

public class Pessoa {

    public String nome;
    public String sobrenome;
    public int idade;

    
    @Override
    public boolean equals(Object obj) {
        Pessoa pessoa = (Pessoa)obj;
        if(pessoa.nome == this.nome && pessoa.sobrenome == this.sobrenome && pessoa.idade == this.idade){
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
