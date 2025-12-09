<html>
    <head>
        <title>Polinomio</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <%
            float x=0F, a=0F, b=0F, c=0F, d=0F;
            float result=0F;

            x=Float.parseFloat(request.getParameter("x"));
            a=Float.parseFloat(request.getParameter("a"));
            b=Float.parseFloat(request.getParameter("b"));
            c=Float.parseFloat(request.getParameter("c"));
            d=Float.parseFloat(request.getParameter("d"));

            result=(float)((a*(Math.pow(x, 5))) - (b*Math.pow(x, 3)) + (c*x) - d);

            out.print("Resultado: "+result);
        %> 
    </body>
</html>