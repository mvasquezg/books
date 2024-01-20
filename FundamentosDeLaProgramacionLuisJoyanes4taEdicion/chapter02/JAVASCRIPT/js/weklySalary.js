/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 29.-Escribir un algoritmo que encuentre el salario semanal de un trabajador, 
    dada la tarifa horaria y el número de horas trabajadas diariamente.
*/


function calculate(){
    
    let pricePerHour=document.getElementById("idPricePerHour").value; //Precio por horas
    let hoursWorked=0;
    let sumHours=0;
    let salary=0;
    
    let paragrafh=document.createElement("p");
    paragrafh.setAttribute("id", "idParagraf");

    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        
        for(let i=1; i<=7; i++){
            hoursWorked=parseInt(prompt("Ingresa horas trabajdas del dia "+i+": " ));
            sumHours+=hoursWorked;
        }

        salary=sumHours*pricePerHour;

        paragrafh.innerHTML="Horas trabajadas en la semana: "+sumHours+"<p></P>Salario semanal del trabajador: $ "+salary;
        document.getElementById("idSection").appendChild(paragrafh);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idParagraf").remove();        
        document.getElementById("idPricePerHour").value="";

        document.getElementById("idBtnCalculate").value="Calcular";
    }    
}

/*
        
        
        System.out.print("\nEl sueldo total mensual es igual a: "+totalSalary+"\n");
    }
}*/

