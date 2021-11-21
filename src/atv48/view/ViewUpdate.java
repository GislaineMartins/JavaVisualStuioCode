package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ViewUpdate {
    public static void main(String[] args) {
        try {
            int id = 8;
            String nome = "Testes com PreparedStatement";
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres", "postgres", "123456");
            
            PreparedStatement prepStatement = conn.prepareStatement("UPDATE categoria SET nome=? WHERE id = ?");
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);


            prepStatement.execute();
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            //e.printStackTrace();
        }
    }
    
}