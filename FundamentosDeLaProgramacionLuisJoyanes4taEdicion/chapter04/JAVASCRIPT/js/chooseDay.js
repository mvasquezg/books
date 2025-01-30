/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 10.-Leida una fecha, decir el dia de la semana, suponiendo que el dia 1 de dicho mes fue lunes.
    ejemplo 4.12, Pagina 142
*/

function calculate(){
    let day=0, month=0, year=0, d=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
             
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        day=parseInt(document.getElementById("idDay").value);
        month=parseInt(document.getElementById("idMonth").value);
        year=parseInt(document.getElementById("idYear").value);
           
        d=day%7;
        switch(d){
            case 1:
               varSpan.innerHTML="<br>La fecha "+day+"-"+month+"-"+year+", el dia fue: Lunes";
               break;
            case 2:
               varSpan.innerHTML="<br>La fecha "+day+"-"+month+"-"+year+", el dia fue: Martes";
               break;
            case 3:
               varSpan.innerHTML="<br>La fecha "+day+"-"+month+"-"+year+", el dia fue: Miercoles";
               break;
            case 4:
               varSpan.innerHTML="<br>La fecha "+day+"-"+month+"-"+year+", el dia fue: Juves";
               break;        
            case 5:
               varSpan.innerHTML="<br>La fecha "+day+"-"+month+"-"+year+", el dia fue: Viernes";
               break;
            case 6:
               varSpan.innerHTML="<br>La fecha "+day+"-"+month+"-"+year+", el dia fue: Sabado";
               break;
            case 0:
               varSpan.innerHTML="<br>La fecha "+day+"-"+month+"-"+year+", el dia fue: Domingo";
               break;            
        }        
            document.getElementById("idMessage").appendChild(varSpan);    
            document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idDay").value="";
        document.getElementById("idMonth").value="";
        document.getElementById("idYear").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}        