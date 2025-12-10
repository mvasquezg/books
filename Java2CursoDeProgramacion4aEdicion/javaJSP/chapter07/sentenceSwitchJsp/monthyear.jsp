<html>
    <head>
        <title>
            Dias en el mes
        </title>
    </head>
    <body>
        <h1>Dias en el mes</h1>
        <br>
        <%
            int day=0, month=0, year=0;
            
            month=Integer.parseInt(request.getParameter("month"));
            year=Integer.parseInt(request.getParameter("year"));
            
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    day=31;
                    break;
                case 4: case 6: case 9: case 11:
                    day=30;
                    break;
                case 2:
                    //El año es boisiesto
                    if( (year%4==0) && (year % 100 != 0 ) || (year % 400==0))
                        day=29;
                    else
                        day=28;
                    break;    
                default:
                    out.print("El mes no es valido<br>");
                    break;                        
            }//end switch

            if(month>=1 && month<=12){
                out.print("<br>El Mes "+month+" del año "+year+" tiene "+day+" dias.<br>");
            }
        %>
    </body>
</html>