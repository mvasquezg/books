<html>
    <head>
        <title>Muestra datos Jsp</title>
        <%!
            double a=3.14, b=2.71;
            int c=2;

            String s="Datos";
        %>
    </head>
    <body>
        
        <h1>Muestra datos JSP</h1>
        <p></p>
        <h3></h3>
        <%
            out.println(s);
            out.println("<br>a = "+a);
            out.println("<br>b = "+a);
            out.println("<br>c = "+a);
        %> 
    </body>
</html>