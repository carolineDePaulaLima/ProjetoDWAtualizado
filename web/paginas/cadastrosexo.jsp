<%-- 
    Document   : cadPessoa
    Created on : 05/07/2018, 16:34:00
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clinica Noventa Graus</title>
        <link href="../Estilos/form.css" rel="stylesheet" type="text/css"/>
        
    </head>
    
    <body>
          <jsp:include page="./menu.jsp"/>
        <div>
            <h1> Cadastro do Sexo</h1> <img src="logooo.PNG" width=60 height=40>
            
        </div>
        <form action="${pageContext.request.contextPath}/cadastrosexo" method="POST">
            <p>
                <label for="idsexo"> Identificação </label> 
                <input type="text" name="idsexo" value="" />
                <label for="nome_sexo"> Sexo </label> 
                <input type="text" name="nome_sexo" value="" />
                <input type="submit" value="Salvar" />
            </p>
            
        </form>
    </body>
</html>
