package com.capgemini.servlet;

import java.io.IOException;


import com.capgemini.dao.ProdutoDao;
import com.capgemini.models.Produto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto/carregar")
public class ProdutoBuscarIdServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProdutoDao dao = new ProdutoDao();
        int id = Integer.parseInt(req.getParameter("id"));
        Produto model = dao.readByid(id);

        RequestDispatcher rd = req.getRequestDispatcher("/produto-alterar.jsp");
        req.setAttribute("model", model);
        rd.forward(req, resp);
        

        
       
    }

    
}
