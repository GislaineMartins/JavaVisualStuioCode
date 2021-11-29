package com.capgemini.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.capgemini.dao.ProdutoDao;
import com.capgemini.models.Produto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto/listar")
public class ProdutoReadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        ProdutoDao dao = new ProdutoDao();
        ArrayList<Produto> produtos;

        String nome = req.getParameter("nome");

        if(nome != null){
            produtos = dao.read(nome);
        }else{
            produtos = dao.read();
        }   

        req.setAttribute("produtos", produtos);
        RequestDispatcher rd = req.getRequestDispatcher("/produto-lista.jsp");
        rd.forward(req, resp);
    }
    
}
