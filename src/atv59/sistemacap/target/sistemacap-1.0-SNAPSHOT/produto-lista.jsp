<%@ page import="java.util.ArrayList, com.capgemini.models.Produto" %>

<%
    ArrayList<Produto> produtos = (ArrayList<Produto>)request.getAttribute("produtos");
%>


<!DOCTYPE html>
<html lang="pt-br">
    <head>       
        <title>lista de produtos</title>
        <meta charset="utf-8"/>
        <link rel="stylesheet" href="../css/styles.css">
    </head>

    <body>
        <h1>Lista de produtos</h1>
       <form action="/sistemacap-1/produto/listar" method="get">
       nome: <input type="text" name="nome" id="nome">
       <input type="submit" value="Filtrar"> 
       </form>

       <table>
           <thead>
               <tr>
                   <th>Id</th>
                   <th>Nome</th>
                   <th>Descricao</th>
                    <th>Codigo</th>
                    <th>Preco</th>
                    <th>Categoria ID</th>
                    <th></th>
               </tr>
           </thead>
            <tbody>
               <% for (Produto model : produtos){ %>
               <tr>
                   <td><%= model.getId() %></td>
                   <td><%= model.getNome() %></td>
                   <td><%= model.getDescricao() %></td>
                   <td><%= model.getCodigo() %></td>
                   <td><%= model.getPreco() %></td>
                <td><%= model.getCategoriaId() %></td>
                <td>
                        <a href="/sistemacap-1/produto/alterar?id=<%= model.getId() %>">Alterar</a> |
                        <a href="/sistemacap-1/produto/deletar?id=<%= model.getId() %>">Deletar</a>
                    </td>
               </tr>
               <% } %>
           </tbody>

        </table>

        <a href="/sistemacap-1/index.jsp">voltar para o inicio</a>
        
    
    
    </body>


</html>
