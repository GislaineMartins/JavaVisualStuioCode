package view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ViewDelete {
    public static void main(String[] args) {
        try {
            int id = 8;
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres", "postgres", "123456");
            
            PreparedStatement prepStatement = conn.prepareStatement("DELETE FROM categoria WHERE id = ?");
           prepStatement.setInt(1, id);

            prepStatement.execute();
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            e.printStackTrace();
        }
    }
    
}