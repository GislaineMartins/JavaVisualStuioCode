package com.capgemini.dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.capgemini.models.Categoria;

public class CategoriaDao {

    public int insert(Categoria model){
        int idGerado = 0;
        try (Connection conn = new ConnectionFactory().getConnection()){
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria (nome, descricao) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());
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

    public ArrayList<Categoria> read(){
        ArrayList<Categoria> list = new ArrayList<>();

        try(Connection conn = new ConnectionFactory().getConnection()) {
            PreparedStatement prepStatement = conn.prepareStatement("select * from categoria");
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            while (result.next()) {
                Categoria model= new Categoria();
                model.setId(result.getInt("id"));
                model.setNome(result.getString("nome"));
                model.setDescricao(result.getString("descricao"));


                list.add(model);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int update(Categoria model){
        int linhasAfetadas = 0;

        try(Connection conn = new ConnectionFactory().getConnection()) {
            PreparedStatement prepStatement = conn.prepareStatement("UPDATE categoria SET nome=?, descricao = ? WHERE id = ?");
            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());
            prepStatement.setInt(3, model.getId());
    
    
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
           PreparedStatement prepStatement = conn.prepareStatement("DELETE FROM categoria WHERE id = ?");
           prepStatement.setInt(1, id);

           prepStatement.execute();
           linhasAfetadas = prepStatement.getUpdateCount();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
        return linhasAfetadas;
        
    }


    
}
