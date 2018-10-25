<%-- 
    Document   : menu
    Created on : 05/10/2018, 09:52:35
    Author     : a1711938
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="../Estilos/menu.css" rel="stylesheet" type="text/css"/>
<ul>
    <li><a class="active" href="${pageContext.request.contextPath}/paginas/paginaInicial.jsp">Home</a></li>

    <li><a href="${pageContext.request.contextPath}/paginas/cadastroclientes.jsp" >CLIENTE</a></li>
    <li><a href="${pageContext.request.contextPath}/paginas/cadastroespecialidades.jsp" >ESPECIALIDADES</a></li>
    <li><a href="${pageContext.request.contextPath}/paginas/calendario.jsp" >AGENDAMENTO</a></li>
    <li><a href="${pageContext.request.contextPath}/paginas/cadastrotipocontato.jsp" >CONTATO</a></li>
    <li><a href="${pageContext.request.contextPath}/paginas/especialidadesJstl.jsp" >LISTA ESPECIALIDADES</a></li>
    <li><a href="${pageContext.request.contextPath}/paginas/sexoScriplet.jsp">LISTA SEXO</a></li>
    <li><a href="${pageContext.request.contextPath}/paginas/listaclienteJstl.jsp">LISTA CLIENTES</a></li>
    <li><a href="${pageContext.request.contextPath}/paginas/cadastrosexo.jsp">SEXO</a></li>

</ul>




