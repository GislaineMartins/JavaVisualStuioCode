package com.capgemini.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.models.Produto;

public class ProdutoDaoD {
    
    private EntityManager entityManager;

    public ProdutoDaoD(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("postgres");
        this.entityManager = factory.createEntityManager();
    }

    
    public int create(Produto model){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
        return model.getId();
    }

    public List<Produto> read(){
        return entityManager.createQuery("select p from Produto p", Produto.class).getResultList();
    }

    public void update(Produto model){
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(model);
        this.entityManager.getTransaction().commit();

    }

    public void delete(int id){
        Produto model = this.entityManager.find(Produto.class, id);
        if(model != null){
            this.entityManager.getTransaction().begin();
            this.entityManager.remove(model);;
            this.entityManager.getTransaction().commit();
        }
        
    }


}
