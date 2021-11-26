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

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProdutoDao dao = new ProdutoDao();
        PrintWriter out = resp.getWriter();
        Produto model = new Produto();

        String nome = req.getParameter("nome");
        String descricao = req.getParameter("descricao");
        String parametroCodigo = req.getParameter("codigo");        
        String parametroPreco = req.getParameter("preco");        
        String parametroCategoria = req.getParameter("categoriaId");
                
      
        model.setNome(nome);
        model.setDescricao(descricao);

        if(parametroCodigo != null && parametroPreco != null && parametroCategoria != null){
            model.setCodigo(Float.parseFloat(parametroCodigo));
            model.setPreco(Float.parseFloat(parametroPreco));
            model.setCategoriaId(Integer.parseInt(parametroCategoria));
            model.setId(dao.insert(model));

            out.printf("Categoria salva com sucesso Id gerado = %d ",model.getId());

        }else{
            out.printf("Modulo produtos -- Nome = %s, Descrição = %s ", model.getNome(), model.getDescricao());
            
        }
       
    
    
    
    }
    
}
