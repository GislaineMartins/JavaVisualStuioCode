package atv23.view;

import java.util.Scanner;

import atv23.controller.LivroController;
import atv23.model.Livro;

public class LivroView {
    public static void main(String[] args) {
        LivroController liv = new LivroController();
        
        Livro l = new Livro(1);        
        l.setAutor("a");
        l.setEditora("a1");
        l.setNome("aaaaaa");
        liv.salvar(l);

        Livro l2 = new Livro(2);        
        l2.setAutor("b");
        l2.setEditora("b1");
        l2.setNome("bbbbb");
        liv.salvar(l2);

       

        menu();
        Scanner sc = new Scanner(System.in);
        int op = Integer.parseInt(sc.nextLine());

        switch (op) {
            case 1:              
             break;

            case 2:
                 listarLivros(liv);
                
            break;
        
            default:
                break;
        }
        
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

    
    
}
