<%@page import="rationalnumber.RationalNumber"%>
<html>
    <head>
        <title>
            Numero racional
        </title>

        <%!
            RationalNumber number=new RationalNumber();
        %>

    </head>
    <body>
        <% number.setNumerator(4);
            number.setDenominator(3);
        %>
        <h1>
            Numero racional
        </h1>
        <%= number.getNumerator()%> / <%=number.getDenominator()%> 
    </body>
</html>