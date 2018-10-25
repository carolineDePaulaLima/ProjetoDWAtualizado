<%-- 
    Document   : calendario
    Created on : 24/10/2018, 17:55:46
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            * {box-sizing: border-box;}
            ul {list-style-type: none;}
            body {font-family: Verdana, sans-serif;}
            .month {
                padding: 70px 25px;
                width: 100%;
                background: #E9967A;
                text-align: center;
            }

            .month ul li {
                color: white;
                font-size: 20px;
                text-transform: uppercase;
                letter-spacing: 3px;
            }
            .weekdays {
                padding: 10px;
                background: #eee;
                margin-top: 300px;
            }
            .weekdays li {
                list-style-type: none;
                display: inline-block;
                width: 18.6%;
                text-align: center;
                font-size: 12px;
                color: #777;

            }

            .days {
                background: #eee;
                margin-top: 325px;
            }

            .days li {
                list-style-type: none;
                display: inline-block;
                width: 18.6%;
                text-align: center;
                margin-bottom: 5px;
                font-size:12px;
                color: #777;
            }

            .days li .active {
                padding: 5px;
                background: #CD5C5C;
                color: white !important
            }
            a .voltar{
                margin-top: 350px;
            }
        </style>
    </head>

    <body>

        <jsp:include page="./menu.jsp"/>

        <div class="month">      
            <h2> CALENDÁRIO</h2>
            <h1>2019</h1>
            <img src="logooo.PNG" width=60 height=40>
        </div>
        <form action="${pageContext.request.contextPath}/calendario" method="POST"></form>

        <ul class="weekdays">
            <li>Segunda</li>
            <li>Terça</li>
            <li>Quarta</li>
            <li>Quinta</li>
            <li>Sexta</li>
            <li>Sabado</li>
            <li>Domingo</li>
        </ul>

        <ul class="days">  
            <li>1</li>
            <li>2</li>
            <li>3</li>
            <li>4</li>
            <li>5</li>
            <li>6</li>
            <li>7</li>
            <li>8</li>
            <li>9</li>
            <li><span class="active">10</span></li>
            <li>11</li>
            <li>12</li>
            <li>13</li>
            <li>14</li>
            <li>15</li>
            <li>16</li>
            <li>17</li>
            <li>18</li>
            <li>19</li>
            <li>20</li>
            <li>21</li>
            <li>22</li>
            <li>23</li>
            <li>24</li>
            <li>25</li>
            <li>26</li>
            <li>27</li>
            <li>28</li>
            <li>29</li>
            <li>30</li>
            <li>31</li>
        </ul>
        
    </body>
</html>