package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewInsert {
    public static void main(String[] args) {
        
        try {

            String nome = "Teste4";
            String descricao = "produtos para teste4";

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres", "postgres", "123456");
       
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria (nome, descricao) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);
            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);

            }
            

            
            conn.close();
        } catch (SQLException e) {
            //System.out.println("Não foi possivel conectar");
            e.printStackTrace();
        }
    }
    
}