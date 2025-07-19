/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 32.-Escribir un programa que seleccione la operación aritmética a ejecutar entre dos números dependiendo del valor de una variable 
        denominada seleccionOp.

    Pagina 156
*/
function calculate(){
    let selectionOpc=0, num1=0, num2=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");        

    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        selectionOpc=parseInt(document.getElementById("idOption").value);
        num1=parseInt(document.getElementById("idNum1").value);
        num2=parseInt(document.getElementById("idNum2").value);

        switch(selectionOpc){
            case 1:
                    varSpan.innerHTML="Suma:<br> "+num1+" + "+num2+" = "+(num1+num2);
                break;
            case 2:
                varSpan.innerHTML="Resta:<br> "+num1+" - "+num2+" = "+(num1-num2);
                break;
            case 3:
                varSpan.innerHTML="Multiplicacion:<br> "+num1+" * "+num2+" = "+(num1*num2);
                break;    
            case 4:
                varSpan.innerHTML="Division:<br> "+num1+" / "+num2+" = "+(num1/num2);
                break;
            default:
                varSpan.innerHTML="La operacion no existe";
                break;        
        }//end switch

        document.getElementById("idMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idOption").value="";
        document.getElementById("idNum1").value="";
        document.getElementById("idNum2").value="";
        
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}