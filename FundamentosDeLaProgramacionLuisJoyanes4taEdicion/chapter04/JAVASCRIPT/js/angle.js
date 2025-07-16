/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 31.-Un ángulo se considera agudo si es menor de 90 grados, obtuso si es mayor de 90 grados y 
    recto si es igual a 90 grados. Utilizando esta información, escribir un algoritmo que acepte un ángulo en grados 
    y visualice el tipo de ángulo correspondiente a los grados introducidos.

    Pagina 155
*/
function calculate(){
    let angle=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");        

    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        angle=parseFloat(document.getElementById("idAngle").value);
     
        if(angle>90){
            varSpan.innerHTML="El angulo "+angle+" es Obtuso.";
        }else if(angle==90){
            varSpan.innerHTML="El angulo "+angle+" es Recto.";
        }else{
            varSpan.innerHTML="El angulo "+angle+" es Agudo.";
        }

        document.getElementById("idMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idAngle").value="";
        

        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Calcular";
    }
}