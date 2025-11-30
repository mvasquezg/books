<html>
    <head>
        <title>Tipos de datos</title>
    </head>
    <body>
        <h1>Tipos de datos</h1>
        <%
            String sString="Lenguaje Java";
            char[] cArrayChar={'a', 'b', 'c'};
            int dataInt=4;
            long dataLong=Long.MIN_VALUE;
            float dataFloat=Float.MAX_VALUE;
            double dataDouble=Math.PI;
            boolean dataBoolean=true;

            out.println(sString+"<br>");
            out.println(cArrayChar[0]+"&nbsp;"+cArrayChar[1]+"&nbsp;"+cArrayChar[2]+"<br>");
            out.println(dataInt+"<br>");
            out.println(dataLong+"<br>");
            out.println(dataDouble+"<br>");
            out.println(dataFloat+"<br>");
            out.println(dataBoolean+"<br>");
        %>
    </body>
</html>