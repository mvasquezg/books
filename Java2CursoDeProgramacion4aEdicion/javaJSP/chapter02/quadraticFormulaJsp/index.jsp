<html>
    <head>
        <title>Formula Cuadratica</title>
        <%!
            double a=1, b=5, c=2;
       
            double calculate(double a, double b, double c){
                return ((Math.pow(b, 2)) - (4*a*c))/(2*a);
            }
    
        %>
    </head>
    <body>
        
        <h1>Formula Cuadratica</h1>
    
        <p></p>
        <%
            out.println(calculate(a, b, c));
        %>

    </body>
</html>