public class Main {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Gi";
        p.sobrenome = "Martins";
        p.idade = "20";

        Aluno a = new Aluno();
        a.nome = "Gi";
        a.sobrenome = "Martins";
        a.idade = "20";
        a.matricula = "12345";
        a.curso = "Sistema de Informação";
        a.turma = "D";

        Pessoa p2 = p;

        Dados dados = new Dados();
        String res = dados.adiciona(p);
        String res1 = dados.adiciona(a);
        //dados.verificar(p2);
        String remover = dados.remover(a);

        System.out.println(res);
        System.out.println(res1);
        System.out.println(remover);




    }
}
