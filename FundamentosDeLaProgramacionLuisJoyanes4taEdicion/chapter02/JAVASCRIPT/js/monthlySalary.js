/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 11.Cálculo de los salarios mensuales de los empleados de una empresa, sabiendo que éstos se calculan 
    en base a las horas semanales trabajadas y de acuerdo a un precio especificado por horas. Si se pasan de 
    cuarenta horas semanales, las horas extraordinarias se pagarán a razón de 1,5 veces la hora ordinaria.
*/


function calculate(){
    let monthlyHours=160;   //Horas constantes al mes
    let hoursWorked=document.getElementById("idHoursWorked").value;      //Horas trabajadas
    let pricePerHour=document.getElementById("idPricePerHour").value;     //Precio por horas
    let extraHours=0;       //Horas extras
    let salary=0;           //Salario
    let extraSalary=0;      //Salario extra
    let totalSalary=0;      //Salario total

    let paragrafh=document.createElement("p");
    paragrafh.setAttribute("id", "idParagraf");

    if(document.getElementById("idBtnCalculate").value=="Calcular"){

    
        if(hoursWorked<=monthlyHours){
            totalSalary=hoursWorked*pricePerHour;
        }else{
            extraHours=hoursWorked-monthlyHours;
            salary=monthlyHours*pricePerHour;
            extraSalary=extraHours*(pricePerHour*1.5);
            totalSalary=salary+extraSalary;
        }

        paragrafh.innerHTML="El sueldo total Mensual es igual a: "+totalSalary;
        document.getElementById("idSection").appendChild(paragrafh);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idParagraf").remove();
        
        document.getElementById("idHoursWorked").value="";
        document.getElementById("idPricePerHour").value="";

        document.getElementById("idBtnCalculate").value="Calcular";
    }    
}

/*
        
        
        System.out.print("\nEl sueldo total mensual es igual a: "+totalSalary+"\n");
    }
}*/

