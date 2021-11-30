<%
    int id = (int)request.getAttribute("id"); 
%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Sucesso</title>
        <link rel="stylesheet" href="css/styles.css">
        <meta charset="utf-8"/>
    </head>

    <body>
        <h1>Sucesso</h1>
        <h4>Produto de id: <%= id  %>alterado com sucesso</h4>
        <br/>
        <a href="/sistemacap-1/produto/listar">listar produto</a>
    </body>


</html>
