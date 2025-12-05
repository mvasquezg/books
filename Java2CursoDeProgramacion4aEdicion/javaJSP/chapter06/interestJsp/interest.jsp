<html>
    <head>
        <title>
            Resultado interes
        </title>
    </head>
    <body>
        <h1>Resultado</h1>
        <br>
        <%
            double c=0, interest=0, capital=0, t=0;
            float r=0.0F; 

            c=Double.parseDouble(request.getParameter("capital"));
            r=Float.parseFloat(request.getParameter("interest"));
            t=Double.parseDouble(request.getParameter("days"));


            interest=c*r*t/(360*100);
            capital=c+interest;
        %>
        

        <%
            out.println("Intereses producidos... "+interest);
            out.println("<br>Capital acumulado..."+capital);
        %>

    </body>
</html>