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

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();

        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));
        model.setId( dao.insert(model));

        req.setAttribute("id", model.getId());
       
        RequestDispatcher rd = req.getRequestDispatcher("categoria-sucesso.jsp");
        rd.forward(req, resp);

        // PrintWriter out = resp.getWriter();
       // out.printf("Categoria salva com sucesso Id gerado = %d", model.getId());     
       
       
    }
    
}
