/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 27.-Escribir los diferentes métodos para deducir si una variable o expresión numérica es par.

    Ejercicios:
    4.5  página 155 
*/
function calculate(){
    var num=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
             
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        num=parseInt(document.getElementById("idNum").value);
        
        if(num%2==0){
            varSpan.innerHTML="El numero: "+num+" es par";
        }else{
            varSpan.innerHTML="El numero: "+num+" es impar"
        }

        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNum").value="";
        document.getElementById("idSpan").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  