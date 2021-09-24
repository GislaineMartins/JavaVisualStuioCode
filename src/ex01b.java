import java.util.Scanner;

public class ex01b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salario: ");
        double salario = Double.parseDouble(scanner.nextLine());
        boolean valida = true;
        

        if(salario > 1997.58  && salario < 5399.99){
            System.out.println("Salario maior que R$1997.58");
        }else if(salario >= 5399.99){
            System.out.println("Salario maior que R$5399.99");
        }else if(salario <= 0){
            System.out.println("Salario menor ou igual a zero: ");
            do{
                System.out.println("Salario precisa estar entre 1997.58 e 5399.99");
                if(salario <= 0){
                    System.out.println("Digite salario novamente: ");
                    salario = Double.parseDouble(scanner.nextLine());                   

                } 
                valida = false;               
               
            }while(!valida);

        }
    }
    
}
