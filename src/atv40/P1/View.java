package P1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        
            Empresa e1 = new Empresa();
            e1.nome = "Nike";
            e1.cnpj = "0983423142432";
            e1.ramoDeAtividade = "esporte";
    
            try {
                FileWriter fw = new FileWriter("P1/empresa.csv", true);
                //DAO (Data Access Object) - Dados do objeto carro para uma string
                String empresaString =  e1.nome + ";" + e1.cnpj  + ";" + e1.ramoDeAtividade + "\n";
                fw.write(empresaString);
                fw.close();
            } 
            catch (IOException e) {
                System.out.println("Não foi possivel abrir o arquivo");
            }
    
            try {
                Scanner sc = new Scanner(new File("P1/empresa.csv"));
                while(sc.hasNextLine()){
                    String linha = sc.nextLine();
                    // DAO (Data Access Object) - Uma string e criando um objeto de Carro
                    String[] empresaString = linha.split(";");
                    Empresa e = new Empresa();
                    e1.nome = empresaString[0];
                    e1.cnpj  = empresaString[1];
                    e1.ramoDeAtividade  = empresaString[2];
    
                    System.out.printf("%s - %s - %s\n", e1.nome, e1.cnpj, e1.ramoDeAtividade);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Não foi possivel abrir o arquivo");
            }
          
        
    }
    
}
