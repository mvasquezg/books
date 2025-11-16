<html>
    <head>
        <title>
            Casteo de datos implicitos
        </title>
    </head>
    <body>
        <h1>Casteo de datos implicitos</h1>
        <%!
            byte dataByte=1; 
            short dataShort=0;
            int dataInt=0;
            long dataLong=0;
            float dataFloat=0;
            double dataDouble=0;
        %>

        <%
            dataShort=dataByte;
            out.println("Dato byte a dato short: "+dataShort);

            dataInt=dataShort;
            out.println("<br>Dato short a dato int: "+dataInt);

            dataLong=dataInt;
            out.println("<br>Dato entero a dato long: "+dataLong);

            dataFloat=dataLong;
            out.println("<br>Dato long a dato float: "+dataFloat);

            dataDouble=dataFloat;
            out.println("<br>Dato byte a dato short: "+dataDouble);
        %>

    </body>
</html>
