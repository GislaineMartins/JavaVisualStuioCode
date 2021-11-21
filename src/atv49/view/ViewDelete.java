package view;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;


public class ViewDelete {
    public static void main(String[] args) {
       
        try (Connection conn = new ConnectionFactory().getConnection()){
            int id = 10;
            
            
            PreparedStatement prepStatement = conn.prepareStatement("DELETE FROM categoria WHERE id = ?");
           prepStatement.setInt(1, id);

            prepStatement.execute();
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            e.printStackTrace();
        }

        
    
    }

}