package com.capgemini.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.capgemini.dao.CategoriaDao;
import com.capgemini.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        CategoriaDao dao = new CategoriaDao();
        for(Categoria model: dao.read()){
            out.printf("%d - %s - %s \n", model.getId(), model.getNome(), model.getDescricao());

        }
    }

    
}
