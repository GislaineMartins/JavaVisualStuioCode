public class Aluno extends Pessoa{

    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj){
        Aluno aluno = (Aluno)obj;
        if(this.matricula.equals(aluno.matricula) && this.turma.equals(aluno.turma) && this.curso.equals(aluno.curso)){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        String msg =  super.toString() + "Matricula: " + this.matricula
                + "Turma: " + this.turma
                + "Curso: " + this.curso;
        return msg;
    }
}
