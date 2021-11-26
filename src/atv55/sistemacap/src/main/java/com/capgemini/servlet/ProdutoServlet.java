package com.capgemini.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
        PrintWriter out = resp.getWriter();
        Produto prod1 = new Produto();

        String nome = req.getParameter("nome");
        String descricao = req.getParameter("descricao");
        String parametroCodigo = req.getParameter("codigo");        
        String parametroPreco = req.getParameter("preco");        
        String parametroCategoria = req.getParameter("categoriaId");
      

        prod1.setNome(nome);
        prod1.setDescricao(descricao);

        if(parametroCodigo != null && parametroPreco != null && parametroCategoria != null){
            prod1.setCodigo(Float.parseFloat(parametroCodigo));
            prod1.setPreco(Float.parseFloat(parametroPreco));
            prod1.setCategoriaId(Integer.parseInt(parametroCategoria));
            out.printf("Modulo produtos -- Nome = %s, Descricao = %s, Codigo = %f, Preço = %f, Categoria_id = %d ", 
            prod1.getNome(), prod1.getDescricao(), prod1.getCodigo(), prod1.getPreco(), prod1.getCategoriaId());

        }else{
            out.printf("Modulo produtos -- Nome = %s, Descrição = %s ", prod1.getNome(), prod1.getDescricao());
            
        }
       
    
    
    
    }
    
}
