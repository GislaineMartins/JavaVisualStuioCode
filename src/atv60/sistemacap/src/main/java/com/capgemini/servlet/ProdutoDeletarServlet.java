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

@WebServlet(urlPatterns = "/produto/deletar")
public class ProdutoDeletarServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProdutoDao dao = new ProdutoDao();
        Produto model = new Produto();
        
        int id = Integer.parseInt(req.getParameter("id"));
        model.setId(id);
        dao.delete(model);

       RequestDispatcher rd = req.getRequestDispatcher("/produto/listar");
       rd.forward(req, resp);
    }
    
}
