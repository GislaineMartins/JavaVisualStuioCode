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

@WebServlet(urlPatterns = "/produto/alterar")
public class ProdutoAlterarServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String nome = req.getParameter("nome");
        String descricao = req.getParameter("descricao");
        float codigo = Float.parseFloat(req.getParameter("codigo"));
        float preco = Float.parseFloat(req.getParameter("preco"));
        int categoriaId = Integer.parseInt(req.getParameter("categoriaId"));

        Produto model = new Produto();
        model.setId(id);
        model.setNome(nome);
        model.setDescricao(descricao);
        model.setCodigo(codigo);
        model.setPreco(preco);
        model.setCategoriaId(categoriaId);
        

        ProdutoDao dao = new ProdutoDao();
        dao.update(model);

        RequestDispatcher rd = req.getRequestDispatcher("/produto-alterado-sucesso.jsp");
        req.setAttribute("id", model.getId());
        rd.forward(req, resp);
    }
    
}
