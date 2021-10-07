package atv22.aluno;

/**
 * Aluno
 */
public class Aluno {

    private String nomeCompleto;
    private int idade;
    private String matricula;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String mensagem = "Nome: "+this.nomeCompleto + "\n" 
        + "Idade: "+ this.idade + "\n" 
        + "Matricula: "+this.matricula + "\n------------------"; 
        return mensagem;
    }
}