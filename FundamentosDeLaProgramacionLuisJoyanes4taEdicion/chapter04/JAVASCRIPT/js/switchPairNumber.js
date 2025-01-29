/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 09.-Se desea leer por teclado un numero comprendido entre 1 y 10 (inclusive) y se desea visualizar si el numero es par o impar.

    En primer lugar, se debera detectar si el numero esta comprendido en el rango valido (1 al 10) y a continuacion
    si el numero es 1, 3, 5, 7, 9, escribir mensaje "impar"); si es 2, 4, 6, 8 ,10, escribir un mensaje de "par" 
    
    ejemplo 4.11, Pagina 142
*/
function calculate(){
    let number=0;
     var varSpan=document.createElement("span");
         varSpan.setAttribute("id", "idSpan");           
             
         if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
            number=parseInt(document.getElementById("idNum").value);
            switch(number){
                case 1: case 3: case 5: case 7: case 9:
                    varSpan.innerHTML="Numero "+number+" es impar.";
                    break;
                case 2: case 4: case 6: case 8: case 10:    
                    varSpan.innerHTML="Numero "+number+" es par.";
                    break;
                default:
                    varSpan.innerHTML="El numero "+number+" no esta en le rango permitido.";
                    break;
            }        
                
                 document.getElementById("idMessage").appendChild(varSpan);    
                 document.getElementById("idBtnCalculate").value="Limpiar";
             }else{
                 document.getElementById("idNum").value="";
                 document.getElementById("idSpan").remove();
         
                 document.getElementById("idBtnCalculate").value="Calcular";
             }
         }        