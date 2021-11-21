package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.ConnectionFactory;



public class ViewInsert {
    public static void main(String[] args) {
        
        try (Connection conn = new ConnectionFactory().getConnection()){

            String nome = "Teste4";
            String descricao = "produtos para teste4";

            
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria (nome, descricao) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);
            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);

            }
            

            
            
        } catch (SQLException e) {
            //System.out.println("Não foi possivel conectar");
            e.printStackTrace();
        }
    }
    
}