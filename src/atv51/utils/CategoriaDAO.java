package utils;

import java.util.ArrayList;

import model.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CategoriaDAO {

    private Connection conn;

    public CategoriaDAO(Connection conn){
        this.conn = conn;

    }

    public void create(Categoria model) throws SQLException{
      
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria (nome, descricao) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());
            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);

            }          

        }

    public ArrayList<Categoria> list()throws SQLException{
        ArrayList<Categoria> list = new ArrayList<>();
        PreparedStatement prepStatement = conn.prepareStatement("select * from categoria");
        prepStatement.execute();
        ResultSet result = prepStatement.getResultSet();
        while (result.next()) {
            Categoria cat = new Categoria(result.getInt("id"), result.getString("nome"),result.getString("descricao"));
            list.add(cat);
        }
        return list;

    }

    public int update(Categoria model)throws SQLException{

        PreparedStatement prepStatement = conn.prepareStatement("UPDATE categoria SET nome=?, descricao = ? WHERE id = ?");
        prepStatement.setString(1, model.getNome());
        prepStatement.setString(2, model.getDescricao());
        prepStatement.setInt(3, model.getId());


        prepStatement.execute();
        return prepStatement.getUpdateCount();
    }

    public int delete(int id){

        int linhasAfetadas = 0;

        try (Connection conn = new ConnectionFactory().getConnection()){         
           PreparedStatement prepStatement = conn.prepareStatement("DELETE FROM categoria WHERE id = ?");
           prepStatement.setInt(1, id);

           prepStatement.execute();
           linhasAfetadas = prepStatement.getUpdateCount();
            
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            e.printStackTrace();
        }
       
        return linhasAfetadas;
        
    }
    
}
