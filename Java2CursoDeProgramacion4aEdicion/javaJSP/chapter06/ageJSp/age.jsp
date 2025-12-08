<html>
    <head>
        <title>Mostrando Datos</title>
    </head>
    <body>
        <h1>Mostrando resultado</h1>
        <%
            String name=request.getParameter("namePerson");
            int year= Integer.parseInt(request.getParameter("year"));

            out.println("Hola "+name+" tu edad en el año 2030 es de "+(2030-year)+" años<br>");;
        %>
    </body>
</html>