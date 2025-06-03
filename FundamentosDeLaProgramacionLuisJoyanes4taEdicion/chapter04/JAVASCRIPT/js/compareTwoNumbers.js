/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 24.-Escribir un programa que solicite al usuario introducir dos números. Si el primer número introducido es mayor que el segundo número, 
    el programa debe imprimir el mensaje El primer número es el mayor, en caso contrario el programa debe imprimir el mensaje El primer número es el más 
    pequeño. Considerar el caso de que ambos números sean iguales e imprimir el correspondiente mensaje.
    
    Pagina 155
*/

function calculate(){
    var num1, num2;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
    
        if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
            
            num1=parseInt(document.getElementById("idNum1").value);
            num2=parseInt(document.getElementById("idNum2").value);
            
            if(num1==num2){
                document.getElementById("idSpan3").innerHTML="El numero 1 y el numero 2 son iguales.";
                
            }else if(num1>num2){
                document.getElementById("idSpan1").innerHTML="Numero mayor";
            }else{
                document.getElementById("idSpan1").innerHTML="Numero mas pequeño";
            }


            document.getElementById("idBtnCalculate").value="Limpiar";
            
        }else{                   
            document.getElementById("idSpan1").innerHTML="";
            document.getElementById("idSpan2").innerHTML="";
            document.getElementById("idSpan3").innerHTML="";

            document.getElementById("idNum1").value="";
            document.getElementById("idNum2").value="";
        
            document.getElementById("idBtnCalculate").value="Calcular";
    }
}
