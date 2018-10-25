<%-- 
    Document   : especialidadesJstl
    Created on : 13/09/2018, 13:17:49
    Author     : Gabi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="../Estilos/estiloLista.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clinica Noventa Graus</title>
    </head>
    <body>
          <jsp:include page="./menu.jsp"/>
   
        <jsp:useBean id="dao" class="DAOs.DAOEspecialidades"/>
        <form>
            <table id="customers">
                <tr>
                    <th>ID </th>
                    <th>Nome</th>
                </tr>
                <c:forEach var="cat" items="${dao.listInOrderId()}">
            
            <tr>
                <td>${cat.getIdEspecialidades()}</td>
                <td>${cat.getNomeEspecialidade()}</td>
                
            </tr>
            </c:forEach>
             </table>
        </form>   
        
    </body>
</html>
