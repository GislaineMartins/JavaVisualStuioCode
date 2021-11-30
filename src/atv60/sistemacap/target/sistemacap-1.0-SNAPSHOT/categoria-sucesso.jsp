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
        <h4>Categoria de id: <%= id  %>cadastrada com sucesso</h4>
        <br/>
        <a href="/sistemacap-1/categoria/listar">listar categoria</a>
    </body>


</html>
