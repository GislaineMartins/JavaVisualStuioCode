public class Pessoa {

    public String nome;
    public String sobrenome;
    public String idade;

    @Override
    public boolean equals(Object obj){
        Pessoa pessoa = (Pessoa)obj;
        if(this.nome.equals(pessoa.nome) && this.sobrenome.equals(pessoa.sobrenome) && this.idade.equals(pessoa.idade)){
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
