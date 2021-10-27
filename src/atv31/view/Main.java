package view;

import java.util.Scanner;

import controllers.ProdutoController;
import models.Produto;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ProdutoController controller = new ProdutoController();
        int opcao; 
        
        do{
            imprimeOpcoes();
            opcao = getNumero();
            menu(opcao, controller); 
        }while(opcao != 5);    
             
}

    public static void imprimeOpcoes(){
        System.out.println("Opções: \n 1 - Cadastrar \n 2- Atualizar \n 3 - Listar \n 4 - Deletar \n 5 - Sair");

    }

    private static int getNumero(){        
        int numero=0;
        boolean valido;
        do{
            try {
                numero = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("O número digitado não é um inteiro");                
                valido = false;
            }
        }while(!valido);   
        return numero;
    }

    public static void menu(int opcao, ProdutoController controler){
        
            switch (opcao) {
                case 1:
                System.out.println("------------Cadastrar------------");
                controler.create(cadastrar());
                break;
    
                case 2:
                System.out.println("------------Atualizar------------"); 
                Produto p = cadastrar();               
                controler.update(p);
                break;
    
                case 3:
                System.out.println("------------Listando Produtos------------");
                listar(controler);
                break;
    
                case 4:
                System.out.println("------------Deletar------------");
                controler.delete(deletar(controler));
                System.out.println("Produto deletado com sucesso!!");
                break;
    
                case 5:
                System.out.println("------------Saindo. Obrigada------------");
                break;              
                    
            
                default:
                    break;
            }

       
        
    }

    public static Produto cadastrar(){

        Produto p = new Produto();

        System.out.printf("Digite o id do Produto:");
        p.id = sc.nextLine();

        System.out.printf("Digite o nome do Produto:");
        p.nome = sc.nextLine();

        System.out.printf("Digite o id da Categoria: ");
        p.categoria.id = sc.nextLine();

        System.out.printf("Digite a descriçaõ da Categoria:");
        p.categoria.descricao = sc.nextLine();

        return p;

    }

    public static Produto atualizar(){
        Produto p = new Produto();

        System.out.println("Digite o id do produto que voce deseja atualizar");
        p.id = sc.nextLine();

        return p;

        
    }

    public static void listar(ProdutoController controller){
        for(Produto p : controller.read()){
            System.out.println(p);

        }
        
    }

    public static Produto deletar(ProdutoController controller){
        Produto p = new Produto();

        System.out.println("Digite o id do produto que voce deseja deletar");
        p.id = sc.nextLine();

        return p;
        
    }
    
}
