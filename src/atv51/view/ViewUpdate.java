package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Categoria;
import utils.CategoriaDAO;
import utils.ConnectionFactory;


public class ViewUpdate {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()){
         CategoriaDAO dao = new CategoriaDAO(conn);
         Categoria model = new Categoria(12, "teste5", "teste6");
         System.out.println(dao.update(model));
            
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            //e.printStackTrace();
        }
    }
    
}