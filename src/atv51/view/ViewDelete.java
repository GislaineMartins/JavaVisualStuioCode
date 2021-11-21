package view;

import java.sql.Connection;

import utils.CategoriaDAO;
import utils.ConnectionFactory;

public class ViewDelete {
    public static void main(String[] args) {

        try (Connection conn = new ConnectionFactory().getConnection()){
            CategoriaDAO dao = new CategoriaDAO(conn);
            dao.delete(13);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
        
    
    }

}