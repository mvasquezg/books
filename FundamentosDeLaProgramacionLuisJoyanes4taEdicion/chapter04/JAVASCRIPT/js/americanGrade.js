/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 31.-El sistema de calificación americano (de Estados Unidos) se suele calcular de acuerdo al siguiente cuadro:

                 Grado numérico                                                        Grado en letra
                 Grado mayor o igual a 90                                                A
                 Menor de 90 pero mayor o igual a 80                                         B   
                 Menor de 80 pero mayor o igual a 70                                         C
                 Menor de 70 pero mayor o igual a 69                                         D
                 Menor de 69                                                                 F

                Utilizando esta información, escribir un algoritmo que acepte una calificación numérica del estudiante (0-100),
                convierta esta calificación a su equivalente en letra y visualice la calificación correspondiente en letra.

    Pagina 155-156
*/

 function calculate(){
    let cal=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");        

    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        cal=parseFloat(document.getElementById("idCal").value);
     
        if(cal>=90){
           varSpan.innerHTML="La calificacion "+cal+" es igual a: A";
        }else if(cal>=80 && cal<90){
           varSpan.innerHTML="La calificacion "+cal+" es igual a: B";
        }else if(cal>=70 && cal<80){
           varSpan.innerHTML="La calificacion "+cal+" es igual a: C";
        }else if(cal==69){
           varSpan.innerHTML="La calificacion "+cal+" es igual a: D";
        }else{
           varSpan.innerHTML="La calificacion "+cal+" es igual a: F";
        }

        document.getElementById("idMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idCal").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}