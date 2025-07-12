/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 30.-Realizar un programa que averigüe si dados dos números introducidos por teclado uno es divisor del otro.
    Pagina 155
*/
function calculate(){
    let num1=0, num2=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");        

    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        num1=parseInt(document.getElementById("idNum1").value);
        num2=parseInt(document.getElementById("idNum2").value);
      
        if(num1%num2==0){
            varSpan.innerHTML=num2+" es divisor de "+num1;
        }else if(num2%num1==0){
            varSpan.innerHTML=num1+" es divisor de "+num2;
        }else{
            varSpan.innerHTML="Los numeros "+num1+", "+num2+" no son divisibles uno del otro.";
        }

        document.getElementById("idMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNum1").value="";
        document.getElementById("idNum2").value="";

        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Calcular";
    }
}