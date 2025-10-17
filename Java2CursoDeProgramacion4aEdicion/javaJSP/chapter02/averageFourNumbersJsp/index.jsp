<html>
    <head>
        <title>Promedio de cuatro numeros</title>
        <%!
            int num1=10, num2=20, num3=30, num4=40, sum=0, average=0;  
        %>
    </head>
    <body>
        
        <h1>Promedio de 4 numeros</h1>
    
        <p></p>
        <%
            sum=num1+num2+num3+num4;
            average=sum/4;
            out.println(average);
        %>

    </body>
</html>