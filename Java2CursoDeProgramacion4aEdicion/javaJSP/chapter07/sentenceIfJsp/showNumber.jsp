<html>
    <head>
        <title>Mostrando el numero menor</title>
    </head> 
    <body>
        <h1>Mostrando el numero menor</h1>
        
        <%
            int num1=0, num2=0, num3=0, menor=0;
        
            num1=Integer.parseInt(request.getParameter("num1"));
            num2=Integer.parseInt(request.getParameter("num2"));
            num3=Integer.parseInt(request.getParameter("num3"));

            if(num1==num2){
                if(num2==num3){
                    out.print("<br>Todos los numeros son iguales.");
                }else if(num2>num3){
                    menor=num3;
                }else{
                    menor=num2;    
                }
            }else if(num1>num2){
                if(num1==num3){
                    menor=num2;
                }else if(num1>num3){
                    if(num2==num3){
                        menor=num3;
                    }else if(num2>num3){
                        menor=num3;
                    }else{
                        menor=num2;
                    }
                }else{
                    menor=num2;
                }
            }else{
                if(num2==num3){
                    menor=num1;
                }else if(num2>num3){
                    if(num1==num3){
                        menor=num3;
                    }else if(num1>num3){
                        menor=num3;
                    }else{
                        menor=num1;
                    }
                }else{
                    menor=num1;
                }
            }
        

            if(menor!=0){
                out.print("<br>El numero menor: "+menor);
            }  
        %>
    </body>   


</html>