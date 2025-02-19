/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 12.-Algoritmo que nos indique si un numero entero leido de teclado tiene 1, 2, 3 o mas digitos. Considerar los negativos.
    ejemplo 4.14, Pagina 144
*/
function calculate(){
    var number=0, option=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
             
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        number=parseInt(document.getElementById("idNumber").value);

        if((number>=0 && number<10) || (number>-10 && number<=0)){
            varSpan.innerHTML="Tiene una cifra<br>";
        }else if((number>=10 && number<100) || (number<=-10 && number>-100)){
            varSpan.innerHTML="Tiene dos cifras<br>";
        }else if((number>=100 && number<1000) || (number<=-100 && number>-1000)){
            varSpan.innerHTML="Tiene tres cifras<br>";
        }else{
            varSpan.innerHTML="Tiene mas de tres cifras<br>";
        }

        document.getElementById("idLblNumber").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNumber").value="";
        document.getElementById("idSpan").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  