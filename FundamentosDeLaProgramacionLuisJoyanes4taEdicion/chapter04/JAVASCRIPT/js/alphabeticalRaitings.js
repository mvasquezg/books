/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 08.-Se desea convertir las calificaciones alfabeticas A, B, C, D, E y F a calificaciones
    numericas 4, 5, 6, 7, 8, 9 respectivamente.

    A=4 
    B=5 
    C=6 
    D=7 
    E=8
    F=9
    
    ejemplo 4.10, Pagina 141
*/
function calculate(){
   let letter=' ', cal=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
            
        if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
            letter=document.getElementById("idCal").value;
            
            switch(letter){
                case 'A':
                   cal=4;
                   break;
                case 'B':
                   cal=5;
                   break;
                case 'C':
                   cal=6;
                   break;
                case 'D':
                   cal=7;
                   break;
                case 'E':
                   cal=8;
                   break;
                case 'F':
                   cal=9;
                   break;
                default:
                    varSpan.innerHTML="Calificacion no valida<br>";
                    break;                   
            }
    
            if(cal!=0){
                varSpan.innerHTML="La calificacion "+letter+" es equivalente a "+cal+"<br><br>";
            }        
               
                document.getElementById("idMessage").appendChild(varSpan);    
                document.getElementById("idBtnCalculate").value="Limpiar";
            }else{
                document.getElementById("idCal").value="";
                document.getElementById("idSpan").remove();
        
                document.getElementById("idBtnCalculate").value="Calcular";
            }
        }        