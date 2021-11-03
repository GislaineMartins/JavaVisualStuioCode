package view;

/**
 * Escrita
 */

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class Escrita {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            FileOutputStream fos = new FileOutputStream("dados/escrita.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            System.err.println("Digite o nome do primeiro prato");
            String prato1 = sc.nextLine();

            System.err.println("Digite o nome do segundo prato");
            String prato2 = sc.nextLine();
    
            bw.write(prato1);
            bw.newLine();
            bw.write(prato2);
    
            bw.close();
    
            }catch(FileNotFoundException e){
                System.out.println("Não foi possível encontrar o arquivo.");
            }catch(IOException e){
                System.out.println("Não é possível escrever no arquivo.");
            }
        
    }

}