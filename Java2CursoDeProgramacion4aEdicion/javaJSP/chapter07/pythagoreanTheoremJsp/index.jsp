<html>
    <head>
        <title>
            Teorema de pitagoras
        </title>
    </head>

    <body>
        <h1>Teorema de pitagoras</h1>
        <%
            int x=1, y=1, z=0;

            out.print("Z&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Y<br>");
            out.print("--------------------------------<br>");

            while(x<=50){
            
                //Calcular Z. Como Z es un entero, almacena la parte entera
                //de la raiz cuadrada
                z=(int) Math.sqrt(x*x + y*y);
    
                while(y<=50 && z<=50){
                   //Si la raiz cuadrada  anterior fue exacta, escribir x, y ,z
                    if(z*z == x*x + y*y){
                        out.println(z+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+x+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+y+"<br>");
                    }
    
                    y+=1;
                    z=(int) Math.sqrt(x*x+y*y);
    
                }//end y,z while 
    
                x+=1;
                y=x;
    
            }//end x while

        %>  
      
        
    </body>
</html>