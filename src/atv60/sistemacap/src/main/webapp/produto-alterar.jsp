<%@ page import="com.capgemini.models.Produto" %>

<%
    Produto model = (Produto) request.getAttribute("model");
%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>      
        <meta charset="utf-8"/>
        <link rel="stylesheet" href="../css/styles.css">
        <title>Alterando Produto</title>
    </head>

    <body>
        <h1>Alterando Produto</h1>
        <form action="/sistemacap-1/produto/alterar" method="post">
            id: <input type="text" name="id" id="id" value="<%= model.getId()%>"><br/>
            nome: <input type="text" name="nome" id="nome"  value="<%= model.getNome()%>"><br/>
            descricao: <input type="text" name="descricao" id="descricao" value="<%= model.getDescricao()%>"><br/>
            codigo: <input type="text" name="codigo" id="codigo" value="<%= model.getCodigo()%>"><br/>
            preco: <input type="text" name="preco" id="preco" value="<%= model.getPreco()%>"><br/>
            categoria id: <input type="text" name="categoriaId" id="categoriaId" value="<%= model.getCategoriaId()%>"><br/>
            <input type="submit" value="Alterar"> 

        </form>
        
        
    
    
    
    </body>


</html>
