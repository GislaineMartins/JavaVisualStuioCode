package com.capgemini.servlet;

import java.io.IOException;


import com.capgemini.dao.CategoriaDao;
import com.capgemini.models.Categoria;
//import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/deletar")
public class CategoriaDeletarServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();
        
        int id = Integer.parseInt(req.getParameter("id"));
        model.setId(id);
        dao.delete(model);

       // PrintWriter pw = resp.getWriter();
       // pw.printf("Id %d deletado", id);

       RequestDispatcher rd = req.getRequestDispatcher("/categoria/listar");
       rd.forward(req, resp);

    }
    
}
