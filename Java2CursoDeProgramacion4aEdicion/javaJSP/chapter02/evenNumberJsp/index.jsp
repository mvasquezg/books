<html>
    <head>
        <title>Numero par Jsp</title>
        <%!
            int num=23;   
        %>
    </head>
    <body>
        
        <h1>Numero par</h1>
    
        <p></p>
        <%
            if(num%2==0){
                out.println("numero par");
            }else{
                out.println("numero impar");
            }
            
            out.println("Valor: "+num);
        %>

    </body>
</html>