/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 27.-Calcular la nota media de los alumnos de una clase considerando n-numero de alumnos
    y c-numero de calificaciones de cada alumno.
*/

function calculate(){
    let numStudents=0, numCal=0, sumCal=0, cal=0, promCal=0;   
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
            
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        numStudents=parseInt(document.getElementById("idNumStudent").value);
        numCal=parseInt(document.getElementById("idNumCal").value);

        for(var i=1; i<=numStudents; i++){
            sumCal=0;
            varSpan.innerHTML+="<br><br>Alumno "+i+", Calificaciones: "
            for(var j=1; j<=numCal; j++){
               cal=parseInt(prompt("Alumno "+i+":\nIngresa la calificacion "+j+": " ));
               varSpan.innerHTML+=cal+" " 
               sumCal+=cal;
            }
            promCal=sumCal/numCal;    
            varSpan.innerHTML+="<br>promedio: "+promCal+"<br><br>"; 
        }

        document.getElementById("idShowData").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNumStudent").value="";
        document.getElementById("idNumCal").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
        
