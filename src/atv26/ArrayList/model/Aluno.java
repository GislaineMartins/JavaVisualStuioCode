package atv26.ArrayList.model;

public class Aluno extends Pessoa{

    public String matricula;
    public String turma;
    public String curso;

    

    @Override
    public String toString() {
         String mensagem = super.toString() + this.matricula + this.turma + this.curso;
        return mensagem;
    }


    
}
