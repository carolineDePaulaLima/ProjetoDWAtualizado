<%-- 
    Document   : horarioScriplet
    Created on : 13/09/2018, 13:36:39
    Author     : Gabi
--%>

<%@page import="DAOs.DAOCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%><%@page import="java.util.*,
        DAOs.DAOCliente,
        Entidades.Cliente"%>
<%
    Locale ptBR =new Locale("pt","BR");
    DAOCliente dao = new DAOCliente();
    List<Cliente> cliente = dao.listInOrderId();
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../Estilos/estiloLista.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
           <jsp:include page="./menu.jsp"/>
        <form>
            <table>
                <tr>
                    <th>CPF </th>
                    <th> Nome </th>
                    <th> Sexo </th>
                    </tr>
                    <tbody>
                    <%
                        for (Cliente s : cliente) {
                        %>
                        <tr>
                            <td><%=s.getCpf()%></td>
                            <td><%=s.getNome()%></td>
                            <td><%=s.getSexoIdsexo().getIdsexo() %></td>
                        </tr>
                        <%}%>
                </tbody>
                </table>
        </form>
    </body>
</html>
