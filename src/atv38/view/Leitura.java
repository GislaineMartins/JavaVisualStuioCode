package view;

/**
 * Leitura
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
public class Leitura {

    public static void main(String[] args) {
        
    
            try{
                FileInputStream fis = new FileInputStream("dados/leitura.txt");                
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
    
                while(br.ready()){
                    String linha = br.readLine();
                    System.out.println(linha);
                }
                br.close();
            }catch(FileNotFoundException e){
                System.out.println("O arquivo não foi encontrado");
            }catch(IOException e){
                System.out.println("Não foi possível ler o arquivo.");
            }
        
    }
}