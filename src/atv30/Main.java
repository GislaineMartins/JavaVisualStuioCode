import java.util.Scanner;

public class Main {
    static  int opcao, numUm, numDois;
    static  Calculadora cal = new Calculadora();
     
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean valido = true;
        boolean validoMenu = true;

        do{
           
            try {
                System.out.println("Digite primeiro numero: ");
                numUm = Integer.parseInt( sc.nextLine());
                cal.setNumUm(numUm);        
                valido = true;
                
            } catch (Exception e) {
                System.out.println("Numero invalido. Só é permitido numeros inteiros");
                valido = false;
            }
           
    
           }while(valido == false);
        
       do{
           
        try {
            

            System.out.println("Digite segundo numero: ");
            numDois = Integer.parseInt( sc.nextLine());
            cal.setNumDois(numDois);
            valido = true;
            
        } catch (Exception e) {
            System.out.println("Numero invalido. Só é permitido numeros inteiros");
            valido = false;
        }
       

       }while(valido == false);
        
        

        do{
            try {
              System.out.println("-----------CALCULADORA--------------");
              System.out.println("1) soma");
              System.out.println("2) subtração");
              System.out.println("3) multiplicação");
              System.out.println("4) divisão");
              System.out.println("5) Sair");
              System.out.println("Escolha a opção:");
              opcao = Integer.parseInt(sc.nextLine());
              validoMenu = true;
                
            } catch (Exception e) {
                System.out.println("Numeros invalidos. Só é permitido numeros inteiros");
                validoMenu = false;
            }
            

        }while (validoMenu == false);  
          

        
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
                System.out.println("Multiplicao: " + multiplicacao);                
                
                break;
                 

                case 4:
                if(numUm == 0 || numDois == 0){
                    throw new IllegalArgumentException("Numero nao pode ser zero");
                }else{
                    double divisao = cal.divisao();
                    
                    System.out.println("Divisao: " + divisao);

                }
               
                
                break;
        
            default:
                break;
        }


        
        
    
        
    }
        
    }
    

