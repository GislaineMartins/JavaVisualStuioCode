package com.capgemini.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

    private DataSource dataSource;
    
    public ConnectionFactory(){
        ComboPooledDataSource pool = new ComboPooledDataSource();
        try {
            pool.setDriverClass("org.postgresql.Driver");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        pool.setJdbcUrl("jdbc:postgresql://localhost:5434/postgres");
        pool.setUser("postgres");
        pool.setPassword("123456");
        pool.setMaxPoolSize(10);
        this.dataSource = pool;

    }

   /* public ConnectionFactory(){
        ComboPooledDataSource pool = new ComboPooledDataSource();
        this.dataSource = pool;

    }*/

    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();

    }

    

    
}
