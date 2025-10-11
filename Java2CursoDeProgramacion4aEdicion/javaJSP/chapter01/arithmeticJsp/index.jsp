<html>
    <head>
        <title>Operaciones aritmeticas Jsp</title>
        <%!
        int data1=20;
        int data2=10;
        %>
    </head>
    <body>
        
        <h1>Operaciones arimeticas</h1>
        <p></p>
        <h3>Suma</h3>
        <%
            
            out.println(data1+data2);
        %> 
        <p></p>
        <h3>Resta</h3>
        <%
            out.println((data1-data2));
        %>
        <p></p>
        <h3>Multiplicacion</h3>
        <%
            out.println((data1*data2));
        %>
        <p></p>
        <h3>Division</h3>
        <%
            out.println((data1*data2));
        %>

    </body>
</html>