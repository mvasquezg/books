/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 02.Calcular la paga neta de un trabajador conociendo el número de horas trabajadas, 
    la tarifa horaria y la tasa de impuestos.

    salarioBruto=horasTrabajadas*pagoPorHora

    descuentoSalarial=(salarioBruto*impuesto)/100

    salarioNeto=salarioBruto-descuentoSalarial
*/
    var idHoursWorked;    //Horas trabajadas
    var idPricePerHour;   //Pago por Hora
    var idTax;            //impuesto a decucir
    var grossSalary;    //Salario bruto
    var salaryDiscount; //descuento del salario
    var netSalary;      //salrio neto (salario despues de descuento de impuestos)

    function calculate(){
        if(document.getElementById("idBtnCalculate").value=="Calcular"){
            idHoursWorked=document.getElementById("idHoursWorked").value;
            idPricePerHour=document.getElementById("idPricePerHour").value;
            idTax=document.getElementById("idTax").value;

            grossSalary=idHoursWorked*idPricePerHour;
    
            salaryDiscount=(grossSalary*idTax)/100;

            netSalary=grossSalary-salaryDiscount;

            var inputNetSalary=document.createElement("input");
            inputNetSalary.setAttribute("id", "idInputNetSalary");
            inputNetSalary.value=netSalary;
        
            document.getElementById("idSection").appendChild(inputNetSalary);
            
            document.getElementById("idBtnCalculate").value="Limpiar"
        }else{
            document.getElementById("idHoursWorked").value="";
            document.getElementById("idPricePerHour").value="";
            document.getElementById("idTax").value="";

            document.getElementById("idInputNetSalary").remove();
            document.getElementById("idBtnCalculate").value="Calcular";
        }
    }