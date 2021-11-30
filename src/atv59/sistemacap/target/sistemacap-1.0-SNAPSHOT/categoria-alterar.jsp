<%@ page import="com.capgemini.models.Categoria" %>

<%
    Categoria model = (Categoria) request.getAttribute("model");
%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>      
        <meta charset="utf-8"/>
        <link rel="stylesheet" href="../css/styles.css">
        <title>Alterando categoria</title>
    </head>

    <body>
        <h1>Alterando categoria</h1>
        <form action="/sistemacap-1/categoria/alterar" method="post">
            id: <input type="text" name="id" id="id" value="<%= model.getId()%>"><br/>
            nome: <input type="text" name="nome" id="nome"  value="<%= model.getNome()%>"><br/>
            descricao: <input type="text" name="descricao" id="descricao" value="<%= model.getDescricao()%>"><br/>
            <input type="submit" value="Alterar"> 

        </form>
        
        
    
    
    
    </body>


</html>
