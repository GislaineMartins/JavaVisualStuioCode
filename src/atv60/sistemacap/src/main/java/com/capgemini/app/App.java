package com.capgemini.app;

import com.capgemini.dao.CategoriaDaoD;
import com.capgemini.models.Categoria;


public class App {

    public static void main(String[] args) {
        
        CategoriaDaoD dao = new CategoriaDaoD();
        Categoria model = new Categoria();

        //Teste para inserir no banco 
       /* model.setNome("teste4");
        model.setDescricao("teste4");
        dao.create(model);
        */

        // Teste para alterar no banco
       /* model.setId(28);
        model.setNome("qq1");
        model.setDescricao("qq1");
        dao.update(model);
        */

       // Teste para deletar no banco
       //dao.delete(34);
        

        for(Categoria c: dao.read()){
            System.out.printf("%d - %s - %s\n", c.getId(), c.getNome(), c.getDescricao());

        }
        


        
        
        
        
    }
    
}
