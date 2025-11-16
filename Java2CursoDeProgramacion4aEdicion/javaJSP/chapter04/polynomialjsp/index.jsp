<%@page import="polynomial.Polynomial"%>
<html>
    <head>
        <title>Polinomio</title>
    </head>
    <body>
        <%!
            Polynomial poly=new Polynomial();
        %>

        <h1>Polinomio</h1>
        <h3>ax^3+bx^2+cx+d</h3>
        <p>
            valores:
            <br>
            a=1
            <br>
            b=-3.2
            <br>
            c=0
            <br>
            d=7
            <br>
            x=1, x=1.5
        </p>
        <%
            poly.setA(1);
            poly.setB(-3.2);
            poly.setC(0);
            poly.setD(7);
        %>
        <p>
            Resultado para cuando x=1<br>
            <%out.print(poly.getResult(1));%>
        </p>
        <p>
            Resultado para cuando x=1<br>
            <%out.print(poly.getResult(1.5));%>
        </p>
    </body>
</html>