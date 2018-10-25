<%-- 
    Document   : cadastroclientes
    Created on : 13/09/2018, 15:04:17
    Author     : Carol
--%>
<%@page import="Entidades.Sexo"%>
<%@page import="java.util.List"%>
<%@page import="DAOs.DAOSexo"%>
<%
    DAOSexo daoSexo = new DAOSexo();
    List<Sexo> sexo = daoSexo.listInOrderNome();

%>
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
            <h1> Cadastro do Cliente</h1> <img src="logooo.PNG" width=60 height=40>
            
        </div>
        <form action="${pageContext.request.contextPath}/cadastroclientes" method="POST">
            <p>
                <label for="cpf"> CPF </label> 
                <input type="text" name="cpf" value="" />
                <label for="nome"> Nome do cliente </label> 
                <input type="text" name="nome" value="" />
                <select class="form-control" id="sexo" name="sexo_idsexo">
                            <option value="">SELECIONE</option>
                            <%                       
                                for (Sexo s : sexo) {
                            %>
                            <option value="<%=s.getIdsexo()%>"><%=s.getNomeSexo()%></option>
                            <%}%>

                        </select>

                <input type="submit" value="Salvar" />
            </p>
            
        </form>
    </body>
</html>