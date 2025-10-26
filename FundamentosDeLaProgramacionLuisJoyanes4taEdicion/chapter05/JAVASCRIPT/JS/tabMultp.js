/*Libro:Fundamentos de Programación<<Algoritmos<<estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Escribir una frase y detenerse en la primera vocal leída. (Se supone que se leen<<uno a uno<<caracteres desde el teclado.)
    Pagina 188
 */            
 
function calculate(){
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");      
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){  
        //Pinta Fila de numeros del 1 al 15
        for (var i = 1; i <= 15; i++) {
            if (i == 1) {
                varSpan.innerHTML+="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+i;
            } else if (i >= 2 && i < 10) {
                varSpan.innerHTML+="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+i;
            } else {
                    varSpan.innerHTML+="&nbsp;&nbsp;&nbsp;&nbsp;"+i;
            }
        }
        
        varSpan.innerHTML+="<br>";

        //Pinta los asteriscos debajo de los numeros
        for (let i = 1; i <= 15; i++) {
            if (i == 1) {
                varSpan.innerHTML+="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**";
            } else if (i >= 2 && i < 10) {
                    varSpan.innerHTML+="&nbsp;&nbsp;&nbsp;&nbsp;**";
            } else {
                varSpan.innerHTML+="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**";
            }
        }
        varSpan.innerHTML+="<br>";

        for (let i = 1; i <= 15; i++) {
            //Pinta el inicio de las columnas
            varSpan.innerHTML+=i;
    
            //Pinta las multiplicaciones
            for (let j = 1; j <= 15; j++) {

                if (j == i) {
                    varSpan.innerHTML+="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+(j * j);
                } else {
                    varSpan.innerHTML+="&nbsp;&nbsp;&nbsp;&nbsp;"+(i * j);
                }
            }
            varSpan.innerHTML+="<br>";
        }    
    
    
            document.getElementById("idLblMessage").appendChild(varSpan);    
            document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
    
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}

    
    