package atv26;

public class Aluno extends Pessoa{

    public int matricula;
    public String turma;
    public String curso;

    @Override
    public String toString() {
        String msg =  super.toString() + "Matricula: " + this.matricula 
        + "Turma: " + this.turma
        + "Curso: " + this.curso;
        return msg;
    }
    
}
