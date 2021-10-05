package atv20;

public class Universidade {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Carlos");
        funcionario.setSobreNome("da Silva");
        funcionario.setMatricula(1234);
        funcionario.setDepartamento("Administrativo");
        funcionario.setSalario(2500.00);



        Coordenador coordenador = new Coordenador();
        coordenador.setNome("Rita");
        coordenador.setSobreNome("Azevedo");
        coordenador.setBonus(500.00);
        coordenador.setCursoCordenador("Engenharia");
        coordenador.setDepartamento("Gestão de produtos");
        coordenador.setMatricula(4321);
        coordenador.setSalario(4500.00);
       
        Aluno aluno = new Aluno();
        aluno.setNome("Josefina");
        aluno.setSobreNome("das Dores");
        aluno.setCurso("Arquitetura");
        aluno.setMatricula(123456);
        aluno.setTurma("Turma A");
        

        System.out.println("-----------------FUNCIONARIO---------------");
        System.out.println("Nome: "+ funcionario.getNome());
        System.out.println("Sobrenome: "+ funcionario.getSobreNome());
        System.out.println("Matricula: "+ funcionario.getMatricula());
        System.out.println("Departamento: "+ funcionario.getDepartamento());
        System.out.println("Salario: "+ funcionario.getSalario());

        System.out.println("-----------------COORDENADOR---------------");
        System.out.println("Nome: "+ coordenador.getNome());
        System.out.println("Sobrenome: "+ coordenador.getSobreNome());
        System.out.println("Bonus: "+ coordenador.getBonus());
        System.out.println("Curso: "+ coordenador.getCursoCordenador());
        System.out.println("Departamento: "+ coordenador.getDepartamento());
        System.out.println("Matricula: "+ coordenador.getMatricula());
        System.err.println("Salario: "+  coordenador.getSalario());

        System.out.println("-----------------ALUNO---------------");
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Sobrenome: "+ aluno.getSobreNome());
        System.out.println("Curso: "+aluno.getCurso());
        System.out.println("Matricula: "+ aluno.getMatricula());
        System.out.println("Turma: "+ aluno.getTurma());

        
        
        
       
        

        
        
       
        
        
       
       
      

        
        
        
        
        

        
    }
    
}
