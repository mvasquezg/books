<html>
    <head>
        <title>Polinomio</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <%
            float x=0F;
            float result=0F;

            x=Float.parseFloat(request.getParameter("x"));

            result=(float)((3*(Math.pow(x, 5))) - (5*Math.pow(x, 3)) + (2*x) -7);

            out.print("Resultado: "+result);
        %> 
    </body>
</html>