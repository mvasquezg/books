<html>
    <head>
        <title>Bucle anidado while</title>
    </head>
    <body>
        <h1>Bucle anidado while</h1>
        <%
            int i=1, j=1;

            while(i<=3){
                out.print("Para i = "+i+": ");
                while(j<=4){
                    out.print("j = "+j+", ");
                    j++;
                }//end j while
                out.println("<br>");
                i++;
                j=1;
            }//end i while

        %>
    </body>
</html>