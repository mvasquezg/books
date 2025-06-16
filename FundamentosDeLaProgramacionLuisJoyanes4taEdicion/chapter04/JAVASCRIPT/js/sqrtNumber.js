/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 26.-Calcular la raíz cuadrada de un número y escribir su resultado. Considerando el caso en que el número sea negativo.

    Ejercicios:
    4.4  página 155 
*/
function calculate(){
    var num=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
             
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        num=parseFloat(document.getElementById("idNum").value);
        
        if(num<=0){
            varSpan.innerHTML="El numero ingresado no tiene raiz cuadrada.";
        }else{
            varSpan.innerHTML="La raiz cuadrada de "+num+" es igual a: "+Math.sqrt(num);
        }

        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNum").value="";
        document.getElementById("idSpan").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  