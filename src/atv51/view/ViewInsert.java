package view;

import java.sql.Connection;

import model.Categoria;
import utils.CategoriaDAO;
import utils.ConnectionFactory;

public class ViewInsert {
    public static void main(String[] args) {

        try (Connection conn = new ConnectionFactory().getConnection()){
            CategoriaDAO dao = new CategoriaDAO(conn);
            Categoria cat1 = new Categoria("Teste5", "Teste5");
            Categoria cat2 = new Categoria("Teste6", "Teste6");

            dao.create(cat1);
            dao.create(cat2);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
       
    }
    
}