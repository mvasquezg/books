<html>
    <head>
        <title></title>
    </head>
    <body>
        <h1></h1>
        <%
            
            double d=0;       //discriminante
            double re=0, im=0;  //parte real e imaginaria de la raiz
            
            double a=Double.parseDouble(request.getParameter("a"));
            double b=Double.parseDouble(request.getParameter("b"));
            double c=Double.parseDouble(request.getParameter("c"));
            String result="";

            if(a==0 && b==0){
                result+="La ecuacion es degenerada.";
            }else if(a==0){
                result+="La única raíz es: "+(-c/b);
            }else{    
                //Evaluar la fórmula. Calculo de d. re e im
                re = -b/(2*a);
                d=b*b-4*a*c;
                im=Math.sqrt(Math.abs(d))/(2*a);

                if(d>=0){
                    result+="Raíces reales<br>";
                    result+=(re+im)+", "+(re-im);
                }else{
                    result+="Raíces complejas<br>";
                    result+=re+" + "+Math.abs(im)+" j<br>";
                    result+=re+" - "+Math.abs(im)+" j";
                }
            }
        %>

        <p></p>
        <%
            out.println(result);
        %>
    </body>
</html>