
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 25.-Dados tres números deducir cuál es el central.

    Ejercicios:
    4.3  página 155 
*/
function calculate(){
    var num1=0, num2=0, num3=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
             
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        num1=parseInt(document.getElementById("idNum1").value);
        num2=parseInt(document.getElementById("idNum2").value);
        num3=parseInt(document.getElementById("idNum3").value);

        if(num1==num2 && num2==num3){
            varSpan.innerHTML="Todos los numeros son iguales";
        }
        
        if(num1>num2){  
            if(num2==num3){
                varSpan.innerHTML="No hay numero intermedio.";
            }else if(num2>num3){
                varSpan.innerHTML="Numero de enmedio es: "+num2;
            }else{
                varSpan.innerHTML="Numero de enmedio es: "+num3;
            }
        }else { 
            if(num1==num3){
                varSpan.innerHTML="No hay numero intermedio.";
            }else if(num1>num3){
                varSpan.innerHTML="Numero de enmedio es: "+num1;
            }else{
                varSpan.innerHTML="Numero de enmedio es: "+num2;
            }
        }


        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNum1").value="";
        document.getElementById("idNum2").value="";
        document.getElementById("idNum3").value="";
        document.getElementById("idSpan").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  