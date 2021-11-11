package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewInsert {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            String sql = "INSERT INTO produto(nome, descricao, codigo, preco, categoria_id)VALUES('cama', 'Cama Box Casal Herval Ômega', 2222, 1049, 3)";   
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet ids = statement.getGeneratedKeys();
            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println(id);

            }
            

            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            //e.printStackTrace();
        }
    }
    
}
