<html>
    <head>
        <title>Volumen Esfera</title>
    </head>
    <body>
        <h1>Volumen de esfera resultado</h1>
        <%
            float radio=0.0F, volume=0.0F;

            radio=Float.parseFloat(request.getParameter("radio"));

            volume=(float) ((4*Math.PI*Math.pow(radio, 3))/3);
            out.print("El volumen de la esfera es igual a: "+volume);
        %>
    </body>
</html>