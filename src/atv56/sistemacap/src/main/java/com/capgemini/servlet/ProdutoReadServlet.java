package com.capgemini.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.capgemini.dao.ProdutoDao;
import com.capgemini.models.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto/listar")
public class ProdutoReadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        ProdutoDao dao = new ProdutoDao();
        for(Produto model: dao.read()){
            out.printf("%d - %s - %s - %f - %f - %d\n", model.getId(), model.getNome(), model.getDescricao(), model.getCodigo(), model.getPreco(), model.getCategoriaId());

        }
    }
    
}
