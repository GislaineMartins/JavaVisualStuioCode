package atv26;

public class Aluno extends Pessoa{

    public int matricula;
    public String turma;
    public String curso;

   
    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno)obj;
        if(aluno.matricula == this.matricula && aluno.turma == this.turma && aluno.curso == this.curso){
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
