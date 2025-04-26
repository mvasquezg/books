/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 17.-Los empleados de una fabrica trabajan en dos turnos. Se desea calcular el jornal diario de acuerdo con los siguiente puntos:
        1.-La tarifa de las horas diurnas es de 5 euros.
        2.-La tarifa de las horas nocturnas es de 8 euros.
        3.-Caso de ser domingo, la tarifa se incrementara en 2 euros el turno diurno y 3 horas el turno nocturno.
    Actividades de programacion Resueltas
    4.3, Pagina 151
*/

function calculate(){
    var DAY_SHIFT_PRICE=5;
    var NIGHT_SHIFT_PRICE=8;
    var SUNDAY_DAY_SHIFT_PRICE=2;
    var SUNDAY_NIGHT_SHIFT_PRICE=3;
    var salary=0, salarySunday=0, total=0; 
    var shift=0, hoursWorked=0, hoursWorkedSunday=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        shift=parseInt(document.getElementById("idShiftWorker").value);
        hoursWorked=parseInt(document.getElementById("idWorkHours").value);
        hoursWorkedSunday=parseInt(document.getElementById("idWorkHoursSunday").value);
        if(shift==1){
            salary=hoursWorked*DAY_SHIFT_PRICE;
        }else if(shift==2){
            salary=hoursWorked*NIGHT_SHIFT_PRICE;
        }
        if(hoursWorkedSunday!=0){
            if(shift==1){
                salarySunday=hoursWorkedSunday*SUNDAY_DAY_SHIFT_PRICE;
            }else{
                salarySunday=hoursWorkedSunday*SUNDAY_NIGHT_SHIFT_PRICE;
            }
        }
        total=salary+salarySunday;    
        varSpan.innerHTML+="<p></p><br>El trabajador acumulo "+hoursWorked+" horas trabajadas<br>";
        varSpan.innerHTML+="El trabajador acumulo "+hoursWorkedSunday+" horas trabajadas en domingo<br>";
        varSpan.innerHTML+="Salario Normal:  $ "+salary+"<br>";
        varSpan.innerHTML+="Salario domimgo:  $ "+salarySunday+"<br>";
        varSpan.innerHTML+="Total de Salario:  $ "+total+"<br>";
        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idShiftWorker").value="";
        document.getElementById("idWorkHours").value="";
        document.getElementById("idWorkHoursSunday").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
