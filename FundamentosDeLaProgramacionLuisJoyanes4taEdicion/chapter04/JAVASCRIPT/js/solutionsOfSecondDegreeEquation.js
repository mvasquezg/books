/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 13.-Pseudocodigo que nos permita calcular las soluciones de una ecuacion de segundo grado, incluyendo
    los valores imaginarios.
    ejemplo 4.17, Pagina 147
*/
function calculate(){
    var a=0, b=0, c=0, d=0, x1=0, x2=0, r=0, i=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
             
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        a=parseFloat(document.getElementById("idA").value);
        b=parseFloat(document.getElementById("idB").value);
        c=parseFloat(document.getElementById("idC").value);

        if(a==0){
            varSpan.innerHTML="La ecuacion no es de segundo grado.<br>";
        }else{
            d=b*b-4*a*c;

            if(d==0){
                x1= -b/(2+a);
                x2=x1;
                varSpan.innerHTML="Los valores son para:<br>x1="+x1+"<br>x2="+x2+"<br>";

            }else if(d>0){
                x1=(-b +Math.sqrt(d)) / (2*a);
                x2=(-b -Math.sqrt(d)) / (2*a);
                varSpan.innerHTML="Los valores son para:<br>x1="+x1+"<br>x2="+x2+"<br>";
            }else{
                r=(-b)/(2*a);
                //var dAbs=Math.abs(dAbs);
                i=Math.sqrt(Math.abs(d)) /(2*a);
                varSpan.innerHTML+="<br>Los valores son para:<br>r="+r+" + "+i+"i<br>";
                varSpan.innerHTML+="<br>Los valores son para:<br>r="+r+" - "+i+"i<br>";
            }
        }


        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idA").value="";
        document.getElementById("idB").value="";
        document.getElementById("idC").value="";
        document.getElementById("idSpan").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  