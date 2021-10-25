import java.util.Scanner;

public class Teste {
    static  int opcao;
    static  Calculadora cal = new Calculadora();
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

       
        
        boolean validoMenu = true; 

        do{

            int numUm = lerNumero("Digite primeiro numero");
            int numDois = lerNumero("Digite segundo numero");
            cal.setNumDois(numUm);
            cal.setNumDois(numDois);
            try {
                
                    menu();
                    validoMenu = true;                     
                    chamaSwitch();
              
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
                validoMenu = false;
            }
            

        }while (validoMenu == false || opcao != 5);       

        }

    public static void chamaSwitch(){
        
        switch (opcao) {
            case 1:
                int soma = cal.soma();
                System.out.println("Soma: " + soma);
                break;

                case 2:
                int subtracao = cal.subtracao();
                System.out.println("Subtração: " + subtracao);
                
                break;

                case 3:
                int multiplicacao = cal.multiplicacao();
                System.out.println("Multiplicação: " + multiplicacao);               
                
                break;
                 

                case 4:
                System.out.println("Entrando no caso 4");                
                 verificaZero();                       
                break;
        
            default:
                break;
        }  

        System.out.println("Saindo do programa");

    }

    public static void verificaZero(){
        if(cal.getNumDois() == 0){
            throw new IllegalArgumentException("Numero nao pode ser zero");
        }else{
            double divisao = cal.divisao();
            System.out.println("Divisão: " + divisao);
        }    

    }


    public static void menu(){
        System.out.println("-----------CALCULADORA--------------");
        System.out.println("1) soma");
        System.out.println("2) subtração");
        System.out.println("3) multiplicação");
        System.out.println("4) divisão");
        System.out.println("5) Sair");
        System.out.println("Escolha a opção:");
        opcao = Integer.parseInt(sc.nextLine());

    }

    public static int lerNumero(String mensagem){
        boolean valido = true;
        int numero =0;
        do{            
            try {         
            System.out.println(mensagem);            
                numero = Integer.parseInt( sc.nextLine());         
                valido = true;
                
            } catch (Exception e) {
                System.out.println("Numero invalido. Só é permitido numeros inteiros");
                valido = false;
            }       

       }while(valido == false);

       return numero;
        
    }

   
    
}
