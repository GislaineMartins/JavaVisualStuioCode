<%@ page import="java.util.ArrayList, com.capgemini.models.Categoria" %>

<%
    ArrayList<Categoria> categorias = (ArrayList<Categoria>)request.getAttribute("categorias");
%>


<!DOCTYPE html>
<html lang="pt-br">
    <head>       
        <title>lista de categorias</title>
        <meta charset="utf-8"/>
        <link rel="stylesheet" href="../css/styles.css">
    </head>

    <body>
        <h1>Lista de categorias</h1>
       <form action="/sistemacap-1/categoria/listar" method="get">
       nome: <input type="text" name="nome" id="nome">
       <input type="submit" value="Filtrar"> 
       </form>

       <table>
           <thead>
               <tr>
                   <th>Id</th>
                   <th>Nome</th>
                   <th>Descricao</th>
               </tr>
           </thead>
            <tbody>
               <% for (Categoria model : categorias){ %>
               <tr>
                   <td><%= model.getId() %></td>
                   <td><%= model.getNome() %></td>
                   <td><%= model.getDescricao() %></td>
               </tr>
               <% } %>
           </tbody>
           

         

       </table>
    
    
    
    </body>


</html>
