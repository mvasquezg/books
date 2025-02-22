/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 14.-Algoritmo al que le damos la HH, MM, SS. y nos calcule la hora dentro de un segundo.
    Leeremos las horas, minutos y segundos como numeros enteros. 
    ejemplo 4.18, Pagina 148
*/
function calculate(){
    var h=0, m=0, s=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
             
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        h=parseInt(document.getElementById("idHH").value);
        m=parseInt(document.getElementById("idMM").value);
        s=parseInt(document.getElementById("idSS").value);

        if(h<24 && m<60 && s<60){
            s=s+1;

            if(s==60){
                s=0;
                m=m+1;

                if(m==60){
                    m=0;
                    h=h+1;
                }

                if(h==24){
                    h=0;
                }
            }
        }
        varSpan.innerHTML="La hora es:  "+h+":"+m+":"+s+" hrs<br>";

        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idHH").value="";
        document.getElementById("idMM").value="";
        document.getElementById("idSS").value="";
        document.getElementById("idSpan").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  