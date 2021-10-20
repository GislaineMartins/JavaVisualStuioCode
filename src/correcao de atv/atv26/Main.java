package atv26;

public class Main {
    public static void main(String[] args) {
        Dados dados = new Dados();
        Pessoa p1 = new Pessoa();
        p1.nome = "Inez";
        p1.sobrenome = "Calipso";
        p1.idade = 32;
    
        Aluno a1 = new Aluno();
        a1.nome = "Jojo";
        a1.sobrenome = "Calipso";
        a1.idade = 38;
        a1.matricula = "asasdas";
        a1.turma = "Do fundão";
        a1.curso = "VASP";

        dados.add(p1);
        dados.add(a1);

        Pessoa p2 = new Pessoa();
        p2.nome = "Inez";
        p2.sobrenome = "Calipso";
        p2.idade = 32;

        boolean existe = dados.existe(p2);
        System.out.println(existe);
        
        dados.remove(a1);
        System.out.println(dados.existe(a1));

      
        

    }
    
}
