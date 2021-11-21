package view;

import java.sql.Connection;

import model.Categoria;
import utils.CategoriaDAO;
import utils.ConnectionFactory;

public class ViewSelect {
    public static void main(String[] args) {

        try(Connection conn = new ConnectionFactory().getConnection()) {

           CategoriaDAO dao = new CategoriaDAO(conn);
           for (Categoria c : dao.list()) {
               System.out.println(c);
           }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
