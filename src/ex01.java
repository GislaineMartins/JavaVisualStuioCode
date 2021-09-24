import java.util.Scanner;

public class ex01{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite idade: ");
        byte idade = Byte.parseByte(scanner.nextLine());


        if(idade < 25){
            System.out.println("Idade maior que 25 anos");
        }else if(idade > 25){
            System.out.println("Idade menor que 25 anos");
        }else{
            System.out.println("Idade igual a 25 anos");
        }
    }

}