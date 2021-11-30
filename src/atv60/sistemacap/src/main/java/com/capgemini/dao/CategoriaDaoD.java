package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.models.Categoria;

public class CategoriaDaoD {

    private EntityManager entityManager;

    public CategoriaDaoD(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("postgres");
        this.entityManager = factory.createEntityManager();
    }

    public int create(Categoria model){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
        return model.getId();
    }

    public List<Categoria> read(){
        return entityManager.createQuery("select c from Categoria c", Categoria.class).getResultList();
    }

    public void update(Categoria model){
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(model);
        this.entityManager.getTransaction().commit();

    }
    
    public void delete(int id){
        Categoria model = this.entityManager.find(Categoria.class, id);
        if(model != null){
            this.entityManager.getTransaction().begin();
            this.entityManager.remove(model);;
            this.entityManager.getTransaction().commit();
        }
        
    }
}
