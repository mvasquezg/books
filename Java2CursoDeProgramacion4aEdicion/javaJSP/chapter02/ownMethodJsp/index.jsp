<html>
    <head>
        <title>Uso de metodos propios</title>
        <%!
            double sum(double x, double y){
                double result=0;
                result=x+y;
                return result;
            }
        %>
    </head>
    <body>
        
        <h1>Muestra datos JSP</h1>
        <p></p>
        <h3></h3>
        <%
            out.println("Suma: "+sum(10, 20));
        %> 
    </body>
</html>