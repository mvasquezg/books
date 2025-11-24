<html>
    <head>
        <title>
            Muestra las clases
        </title>
    </head>
    <body>
        <h2>Muestra las clases</h2>
        <%=request.getParameter("nameData")%>
        
        <%!
            Class objectClass;  
        %> 
        
        <%
           
        objectClass=System.in.getClass();
        out.print("<br>Clase de in: "+objectClass.getName());
        
        objectClass=System.out.getClass();
        out.print("<br>Clase de out: "+objectClass.getName());

        objectClass=System.err.getClass();
        out.print("<br>Clase de err: "+objectClass.getName());

        %>

    </body>
</html>