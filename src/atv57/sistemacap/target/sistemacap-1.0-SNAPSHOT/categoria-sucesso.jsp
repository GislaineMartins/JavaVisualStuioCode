<%
    int id = (int)request.getAttribute("id"); 
%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Sucesso</title>
        <meta charset="utf-8"/>
    </head>

    <body>
        <h1>Sucesso</h1>
        <h4>Categoria de id: <%= id  %>cadastrada com sucesso</h4>
    </body>


</html>
