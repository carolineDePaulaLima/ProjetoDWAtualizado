<%-- 
    Document   : horarioScriplet
    Created on : 13/09/2018, 13:36:39
    Author     : Gabi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%><%@page import="java.util.*,
        DAOs.DAOSexo,
        Entidades.Sexo"%>
<%
    Locale ptBR =new Locale("pt","BR");
    DAOSexo dao = new DAOSexo();
    List<Sexo> sexo = dao.listInOrderNome();
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <jsp:include page="./menu.jsp"/>
        <form>
            <table>
                <tr>
                    <th> Identificação Sexo </th>
                    <th> Nome </th>
                    </tr>
                    <tbody>
                    <%
                        for (Sexo s : sexo) {
                        %>
                        <tr>
                            <td><%=s.getIdsexo() %></td>
                            <td><%=s.getNomeSexo()%></td>
                        </tr>
                        <%}%>
                </tbody>
                </table>
        </form>
    </body>
</html>
