/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 11.-Preguntar que dia fue el dia 1 del mes actual y calcular que dia de la semana es hoy.
    ejemplo 4.13, Pagina 143
*/
function calculate(){
    let day=0, dayNow=0, dayCalculate=0, d=0, dayChar='0';
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
             
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        dayChar=document.getElementById("idDayChar").value;
        dayNow=parseInt(document.getElementById("idNow").value);
           
        switch(dayChar){
            case 'L':
                day=0;
                break;
            case 'M':
                day=1;
                break; 
            case 'X':
                day=2;
                break;
            case 'J':
                day=3;
                break;
            case 'V':
                day=4;
                break;
            case 'S':
                day=5;
                break;
            case 'D':
                day=6;
                break;
            default:
                day=-1;
                break;
        }
        
        dayCalculate=dayNow+day;

        d=dayCalculate%7;
        varSpan.innerHTML+="<p></p>";
        switch(d){
            case 1:
               varSpan.innerHTML+="El dia de hoy es: Lunes";
               break;
            case 2:
               varSpan.innerHTML+="El dia de hoy es: Martes";
               break;
            case 3:
               varSpan.innerHTML+="El dia de hoy es: Miercoles";
               break;
            case 4:
               varSpan.innerHTML+="El dia de hoy es: Jueves";
               break;        
            case 5:
               varSpan.innerHTML+="El dia de hoy es: Viernes";
               break;
            case 6:
               varSpan.innerHTML+="El dia de hoy es: Sabado";
               break;
            case 0:
               varSpan.innerHTML+="El dia de hoy es: Domingo";
               break;            
        }


            document.getElementById("idSection").appendChild(varSpan);    
            document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idDayChar").value="";
        document.getElementById("idNow").value="";
        document.getElementById("idSpan").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}        
        
