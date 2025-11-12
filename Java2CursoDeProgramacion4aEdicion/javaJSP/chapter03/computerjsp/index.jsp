<!--Importando el paquet de java-->
<%@page import="computer.Computer"%>
<html>
    <head>
        <title>Simulation Computer</title>

        <!--Declaracion de variable-->
        <%!
            Computer comp1=new Computer();
        %>
    </head>
    <body>
        <h1>Simulacion de una computadora</h1>
        <p></p>

        <%=comp1.getTrademark()+comp1.onComputer()+comp1.statusComputer()+comp1.offComputer()%>;
    </body>
</html>