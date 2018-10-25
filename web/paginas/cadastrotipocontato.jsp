<%-- 
    Document   : cadastrotipocontato
    Created on : 13/09/2018, 15:19:55
    Author     : Gabi
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
            <h1> Cadastro de Tipo de contato</h1> <img src="logooo.PNG" width=60 height=40>
            
        </div>
        <form action="${pageContext.request.contextPath}/cadastrotipocontato" method="POST">
            <p>
                <label for="id_tipo_contato"> Id Tipo contato </label> 
                <input type="text" name="id_tipo_contato" value="" />
                <label for="nome_contato"> Nome contato </label> 
                <input type="text" name="nome_contato" value="" />
                <input type="submit" value="Salvar" />
            </p>
            
        </form>
    </body>
</html>

