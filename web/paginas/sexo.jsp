<%-- 
    Document   : sexo
    Created on : 05/07/2018, 16:16:37
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clinica Noventa Graus</title>
        <link href="../Estilos/estiloLista.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
           <jsp:include page="./menu.jsp"/>
        <form>
            <table>
                <tr>
                    <th> Identificação Sexo (f/m) </th>
                    <th> Nome </th>
                    </tr>
                    ${resultado}
                </table>
        </form>
    </body>
</html>
