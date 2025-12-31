<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tablero Ajedrez</title>
</head>
<body>
    <h1>Tablero de Ajedrez</h1>
    <%
        int falfil=0, calfil=0;
        int fila=0, columna=0;
        
        falfil=Integer.parseInt(request.getParameter("row"));
        calfil=Integer.parseInt(request.getParameter("col"));

        
        for(int i=1; fila<=8; fila++){

            for(columna=1; columna<=8; columna++){
                if((fila+columna == falfil+calfil) || (fila-columna == falfil-calfil)){
                    out.print("*&nbsp;");
                }else if((fila+columna)%2==0){
                    out.print("B&nbsp;");
                }else{
                    out.print("N&nbsp;");
                }
                
            }
            out.print("<br>");
        }        
    
    %>
</body>
</html>