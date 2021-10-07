package atv22.aluno;

/**
 * Tela
 */
public class Tela {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[2];

        Aluno a1 = new Aluno();
        a1.setNomeCompleto("Carlos");
        a1.setMatricula("111");
        a1.setIdade(21);

        alunos[0] = a1;

        Aluno a2 = new Aluno();
        a2.setNomeCompleto("Pedro");
        a2.setMatricula("222");
        a2.setIdade(22);

        alunos[1] = a2;

        for(Aluno a: alunos){

            System.out.println(a);

        }


    }
}