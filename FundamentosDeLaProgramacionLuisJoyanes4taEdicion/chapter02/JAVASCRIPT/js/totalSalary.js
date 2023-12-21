function calculate(){
    let nameWorker;
    let hoursWorked; 
    let pricePerHour;

    let tax=25;         //impuesto a decucir 25%
    let grossSalary;    //Salario bruto
    let netSalary;      //salrio neto (salario despues de descuento de impuestos)
    let salaryDiscount; //Impuesto a descontar


    let paragrafg=document.createElement('p');
    paragrafg.setAttribute("id", "idParagrafg");
        
    if(document.getElementById("idBtnCalculate").value=="Calcular"){
            
            nameWorker=document.getElementById("idName").value;
            hoursWorked=parseInt(document.getElementById("idHoursWorked").value);
            pricePerHour=parseInt(document.getElementById("idPriceHour").value);
            
            grossSalary=hoursWorked*pricePerHour;
            salaryDiscount=(grossSalary*tax)/100;
            netSalary=grossSalary-salaryDiscount;

            paragrafg.innerHTML+="Empleado: "+nameWorker+"<p></p>Salario Bruto: "+grossSalary+"<p></p>Impuesto a descontar: "+tax+"%<p></p>Salario Neto: "+netSalary;

            document.getElementById("idSection").appendChild(paragrafg);
            document.getElementById("idBtnCalculate").value="Limpiar";
        }else{
            document.getElementById("idName").value="";
            document.getElementById("idHoursWorked").value="";
            document.getElementById("idPriceHour").value="";
            document.getElementById("idParagrafg").remove();
        
            document.getElementById("idBtnCalculate").value="Calcular";
        }
    

}