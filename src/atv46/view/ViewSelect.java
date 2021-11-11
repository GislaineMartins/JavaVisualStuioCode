package view;

/**
 * View
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewSelect {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres", "postgres", "123456");
            Statement statement = conn.createStatement();
            statement.execute("Select * from produto");
            ResultSet result = statement.getResultSet();

            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                int codigo = result.getInt("codigo");
                float preco = result.getFloat("preco");
                int categoriaId = result.getInt("categoria_id");
                System.out.printf("%d - %s - %s - %d - R$%.2f - %d\n", id, nome,descricao, codigo, preco, categoriaId);
              

            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            //e.printStackTrace();
        }
    }
}