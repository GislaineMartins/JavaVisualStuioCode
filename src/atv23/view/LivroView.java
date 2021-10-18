package atv23.view;

import java.util.Scanner;

import atv23.controller.LivroController;
import atv23.model.Livro;

public class LivroView {
    public static void main(String[] args) {
        LivroController liv = new LivroController();
                
       /* Livro l = new Livro(1);        
        l.setAutor("a");
        l.setEditora("a1");
        l.setNome("aaaaaa");
        liv.salvar(l);

        Livro l2 = new Livro(2);        
        l2.setAutor("b");
        l2.setEditora("b1");
        l2.setNome("bbbbb");
        liv.salvar(l2); 
        */
             

        
        Scanner sc = new Scanner(System.in);
        int op;
               
        
        do{
            menu();
             op = Integer.parseInt(sc.nextLine()); 
            switch (op) {
                case 1: 
                   dadosCadastro(liv);  
                                  
                break;
    
                case 2:
                     listarLivros(liv);                    
                break;

                case 3:
                System.out.println("----------LISTA DE LIVROS CADASTRADOS-----------");
                listarLivros(liv); 
                int del = escolhaIdDeletar();
                
                                    
                break;
            
                default:
                    break;
            }

        }while(op != 0);
     
        
    }

    private static void menu() {
        System.out.println("=================MENU=============");
        System.out.println("1- Cadastrar");
        System.out.println("2- listar");
        System.out.println("3- Excluir");
        System.out.println("4- Alterar");
        System.out.println("5- Sair");
        System.out.println("Escolha opção");
    }

    public static void listarLivros(LivroController livroController){
        for (Livro l : livroController.listar()) {
            System.out.println(l);
        }

    }

    public static void dadosCadastro(LivroController liv){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Digite autor: ");
        String autor = sc.nextLine();
        System.out.println("Digite nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite editora: ");
        String editora = sc.nextLine();
        Livro l = new Livro(id);
        l.setAutor(autor);  
        l.setNome(nome);
        l.setEditora(editora);       
        liv.salvar(l);
    }

    public static int escolhaIdDeletar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o Id para deletar");
        int delete = Integer.parseInt(sc.nextLine());
        return delete;
    }


    
}
