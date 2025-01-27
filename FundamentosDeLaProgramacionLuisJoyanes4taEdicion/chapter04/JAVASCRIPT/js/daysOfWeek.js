/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 07.-Se desea diseñar un algoritmo que escriba los nombres de los dias en función del valor de una variable
    DIA introducida por el teclado.

    Los días de la semana son 7: por consiguiente, el rango de los valores será 1 .. 7, y el caso que el día tome un valor 
    fuera de este rango se deberá producir un mensaje de error advirtiendo la situación anómala.  

    ejemplo 4.9, Pagina 141
*/
function calculate(){
    let day=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
            if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
                day=parseFloat(document.getElementById("idDayNum").value);
                switch(day){
                    case 1:
                        varSpan.innerHTML="Lunes";
                        break;
                    case 2:
                        varSpan.innerHTML="Martes";
                        break;
                    case 3:
                        varSpan.innerHTML="Miercoles";
                        break;
                    case 4:
                        varSpan.innerHTML="Jueves";
                        break;
                    case 5:
                        varSpan.innerHTML="Viernes";
                        break;
                    case 6:
                        varSpan.innerHTML="Sabado";
                        break;
                    case 7:
                        varSpan.innerHTML="Domingo";
                        break;
                    default:
                        varSpan.innerHTML="El numero ingresado no pertenece a algun dia de la semana.";
                        break;
                }
                
                document.getElementById("idMessage").appendChild(varSpan);    
                document.getElementById("idBtnCalculate").value="Limpiar";
            }else{
                document.getElementById("idDayNum").value="";
                document.getElementById("idSpan").remove();
        
                document.getElementById("idBtnCalculate").value="Calcular";
            }
        }        