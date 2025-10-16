<html>
    <head>
        <title>Operaciones aritmeticas Jsp</title>
        <%!
            double a=10;
            float b=20;
            int c=2, r=0;   
        %>
    </head>
    <body>
        
        <h1>Operaciones arimeticas</h1>
    
        <p></p>
        <%
            out.println((r=(int) (7.5 *Math.sqrt(a) -b /c)));
        %>

    </body>
</html>