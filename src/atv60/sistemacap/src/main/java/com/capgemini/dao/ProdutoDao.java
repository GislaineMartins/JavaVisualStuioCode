package com.capgemini.dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.capgemini.models.Produto;



public class ProdutoDao {

    public int insert(Produto model){
        int idGerado = 0;
        try (Connection conn = new ConnectionFactory().getConnection()){
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO produto (nome, descricao, codigo, preco, categoria_id) VALUES(?, ?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());
            prepStatement.setFloat(3, model.getCodigo());
            prepStatement.setFloat(4, model.getPreco());
            prepStatement.setInt(5, model.getCategoriaId());
            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

        while(ids.next()){
            idGerado = ids.getInt("id");
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idGerado;
      
    }

    public ArrayList<Produto> read(String nome){
        ArrayList<Produto> list = new ArrayList<>();

        try(Connection conn = new ConnectionFactory().getConnection()) {
            PreparedStatement prepStatement = conn.prepareStatement("select * from produto where nome = ? ");
            prepStatement.setString(1, nome);
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            list = createList(result);
        }catch (Exception e) {
            e.printStackTrace();
        }

        return list;

    }

    public ArrayList<Produto> read(){
        ArrayList<Produto> list = new ArrayList<>();

        try(Connection conn = new ConnectionFactory().getConnection()) {
            PreparedStatement prepStatement = conn.prepareStatement("select * from produto");
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            list = createList(result);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Produto readByid(int id){
        Produto model = new Produto();

        try(Connection conn = new ConnectionFactory().getConnection()) {
            PreparedStatement prepStatement = conn.prepareStatement("select * from produto where id = ?");
            prepStatement.setInt(1, id);
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            while(result.next()){
                model.setId(result.getInt("id"));
                model.setNome(result.getString("nome"));
                model.setDescricao(result.getString("descricao"));
                model.setCodigo(result.getFloat("codigo"));
                model.setPreco(result.getFloat("preco"));
                model.setCategoriaId(result.getInt("categoria_id"));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }


    private ArrayList<Produto> createList( ResultSet result) throws SQLException {
        ArrayList<Produto> list = new ArrayList<>();
        while (result.next()) {
            Produto model= new Produto();
            model.setId(result.getInt("id"));
            model.setNome(result.getString("nome"));
            model.setDescricao(result.getString("descricao"));
            model.setCodigo(result.getFloat("codigo"));
            model.setPreco(result.getFloat("preco"));
            model.setCategoriaId(result.getInt("categoria_id"));
            list.add(model);
        }
        return list;
    }

    
    public int update(Produto model){
        int linhasAfetadas = 0;

        try(Connection conn = new ConnectionFactory().getConnection()) {
            PreparedStatement prepStatement = conn.prepareStatement("UPDATE produto SET nome=?, descricao=?, codigo=?, preco=?, categoria_id=? WHERE id=?;");
            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());
            prepStatement.setFloat(3, model.getCodigo());
            prepStatement.setFloat(4, model.getPreco());
            prepStatement.setInt(5, model.getCategoriaId());
            prepStatement.setInt(6, model.getId());
            
            prepStatement.execute();
            linhasAfetadas = prepStatement.getUpdateCount();
    
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linhasAfetadas;

        }

        public int delete(int id){

            int linhasAfetadas = 0;
    
            try (Connection conn = new ConnectionFactory().getConnection()){         
               PreparedStatement prepStatement = conn.prepareStatement("DELETE FROM produto WHERE id=?");
               prepStatement.setInt(1, id);
    
               prepStatement.execute();
               linhasAfetadas = prepStatement.getUpdateCount();
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
           
            return linhasAfetadas;
            
        }

        public int delete(Produto model){

            int linhasAfetadas = 0;
    
            try (Connection conn = new ConnectionFactory().getConnection()){         
               PreparedStatement prepStatement = conn.prepareStatement("DELETE FROM produto WHERE id = ?");
               prepStatement.setInt(1, model.getId());
               prepStatement.execute();
               linhasAfetadas = prepStatement.getUpdateCount();
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
           
            return linhasAfetadas;
            
        }
    
}
