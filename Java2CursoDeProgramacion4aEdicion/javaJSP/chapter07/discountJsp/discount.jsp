<html>
    <head>
        <title>Total a pagar</title>
    </head>
    <body>
        <h1>Total a pagar</h1>
        <%
            int codeItem=0, numberOfPieces=0;
            float unitPrice=0F;
            float discount=0F;
         
        codeItem=Integer.parseInt(request.getParameter("codeItem"));
        numberOfPieces=Integer.parseInt(request.getParameter("numberOfPieces"));
        unitPrice=Float.parseFloat(request.getParameter("unitPrice"));

        if(numberOfPieces>100){
            discount=40F;
        }else if(numberOfPieces>=25){
            discount=20F;
        }else if(numberOfPieces>=10){
            discount=10F;
        }else{
            discount=0F;
        }
        
        out.print("<br>Descuento . . . . . . . . . . "+discount+"%<br>Total . . . . . . . . . . "+(numberOfPieces*unitPrice*(1 - discount/100))+"%<br>");

        %>
    </body>
</html>