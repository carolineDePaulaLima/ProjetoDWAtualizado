<%-- 
    Document   : cadastroespecialidades
    Created on : 13/09/2018, 15:04:17
    Author     : Carol
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
            <h1> Cadastro do Especialidades</h1> <img src="logooo.PNG" width=60 height=40>
            
        </div>
        <form action="${pageContext.request.contextPath}/cadastroespecialidades" method="POST">
            <p>
                <!--<label for="id"> ID </label> 
                <input type="text" name="id" value="" />-->
                <label for="especialidades"> Nome da especialidade </label> 
                <input type="text" name="especialidades" value="" />
                <input type="submit" value="Salvar" />
            </p>
            
        </form>
    </body>
</html>