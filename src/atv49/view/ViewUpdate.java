package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;


public class ViewUpdate {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()){
            int id = 8;
            String nome = "Testes com PreparedStatement";
           
            
            PreparedStatement prepStatement = conn.prepareStatement("UPDATE categoria SET nome=? WHERE id = ?");
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);


            prepStatement.execute();
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            //e.printStackTrace();
        }
    }
    
}