package atv23.view;

import java.util.Scanner;

import atv23.model.Livro;

public class LivroView {
    public static void main(String[] args) {
        Livro l = new Livro(1);

        menu();
        Scanner sc = new Scanner(System.in);
        int op = Integer.parseInt(sc.nextLine());

        switch (op) {
            case 1:                
                l.setAutor("a");
                l.setEditora("a1");
                l.setNome("aaaaaa");
                
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

    
    
}
