package com.capgemini.servlet;

import java.io.IOException;


import com.capgemini.dao.CategoriaDao;
import com.capgemini.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/carregar")
public class CategoriaBuscarIdServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        int id = Integer.parseInt(req.getParameter("id"));
        Categoria model = dao.readByid(id);

        RequestDispatcher rd = req.getRequestDispatcher("/categoria-alterar.jsp");
        req.setAttribute("model", model);
        rd.forward(req, resp);
        

        
       
    }

    
}
