/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 19.-Si un ángulo es igual a 90 grados, imprimir el mensaje "El ángulo es un ángulo recto" sino imprimir el mensaje 
    "El ángulo no es un ángulo recto.

    Ejercicios
    4.1 (a) Pagina 155
*/
function calculate(){
    
    var angle=0;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");           
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
            
        angle=parseInt(document.getElementById("idAngle").value);
        
        if(angle!=90){
            varSpan.innerHTML="El angulo "+angle+" no es recto";
        }else{
            varSpan.innerHTML="El angulo "+angle+" es recto";
        }            
        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idAngle").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  