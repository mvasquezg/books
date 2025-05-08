/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 18.-Construir un algoritmo que escriba los nombres de los días de la semana, en función de la entrada correspondiente
a la variable DIA.
        1. LUNES
        2. MARTES
        3. MIERCOLES
        4. JUEVES
        5. VIERNES
        6. SABADO
        7. DOMINGO
    
        Actividades de programacion Resueltas
        4.4, Pagina 152-153

*/
function calculate(){
    var day=0;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");           
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
            
        day=parseInt(document.getElementById("idDay").value);
        
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
                 varSpan.innerHTML="El valor ingresado no pertenece a algun dia de la semana.";
                break;                            
        }
            
        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idDay").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  