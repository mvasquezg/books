<%@page import="degrees.Degrees"%>
<html>
    <head>
        <title>
            Grados centigrados a Grados Fharenheit
        </title>
    </head>
    <body>
        <%!
            Degrees degrees=new Degrees();
        %>
        <h1>
            Grados centigrados a Grados Fharenheit
        </h1>
        <br>
        <%
                int degreesCelsius=0;
                double degreesFahrenheit=0;

                out.println("Grados C\t  -  -  -  \tGrados F");
                
                while(degreesCelsius<=degrees.LIM_SUPERIOR){
                    degrees.setDegreesC(degreesCelsius);
                    degreesFahrenheit=degrees.getDegreesF();
        
                    out.println("<br>"+degreesCelsius+" C&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - &nbsp;&nbsp;&nbsp; - &nbsp;&nbsp;&nbsp; - &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+degreesFahrenheit+" F<br>");
                    degreesCelsius+=degrees.getIncrement();
                }
        %> 
        </br>
    </body>
</html>