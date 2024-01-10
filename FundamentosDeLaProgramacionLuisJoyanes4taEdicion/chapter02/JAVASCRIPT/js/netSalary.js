const BASEHOURS=35;                   //Horas base = 35
const COSTPERHOUR=15;                  //Costo por hora = 15
const PRICEEXTRAHOUR=COSTPERHOUR*1.5; //Precio por hora extra

function calculate(){
    let nameWorker;
    let hoursWorked; 
    let pricePerHour;

    let tax=0;         //impuesto a decucir 25%
    let grossSalary;    //Salario bruto
    let netSalary;      //salrio neto (salario despues de descuento de impuestos)
    let salaryDiscount; //Impuesto a descontar
    let extraHours=0;       //Horas extras
    let baseSalary=0;       //Salario base
    let extraSalary=0;      //salario extra

    let paragrafg=document.createElement('p');
    paragrafg.setAttribute("id", "idParagrafg");
        
    if(document.getElementById("idBtnCalculate").value=="Calcular"){
            
            nameWorker=document.getElementById("idName").value;
            hoursWorked=parseInt(document.getElementById("idHoursWorked").value);

            if(hoursWorked>35){
                extraHours=hoursWorked-BASEHOURS;
            }
            
            baseSalary=BASEHOURS*COSTPERHOUR;
            extraSalary=extraHours*PRICEEXTRAHOUR;
            grossSalary=baseSalary+extraSalary;
            
            if(grossSalary<=1000){
                netSalary=grossSalary;
            }else if(grossSalary<=1400){
                netSalary=grossSalary-((grossSalary*25)/100);
                tax=25;
            }else{
                netSalary=grossSalary-((grossSalary*45)/100);
                tax=45;
            }

            paragrafg.innerHTML+="Empleado: "+nameWorker+"<p></p>Salario Bruto: "+grossSalary+"<p></p>Impuesto a descontar: "+tax+"%<p></p>Salario Neto: "+netSalary;
              
            document.getElementById("idSection").appendChild(paragrafg);
            document.getElementById("idBtnCalculate").value="Limpiar";
        }else{
            document.getElementById("idName").value="";
            document.getElementById("idHoursWorked").value="";
            document.getElementById("idParagrafg").remove();
        
            document.getElementById("idBtnCalculate").value="Calcular";
        }
    

}