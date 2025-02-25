/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 15.-Leer dos numeros y deducir si estan en orden creciente. 
    Actividades de programacion Rsueltas
    4.1, Pagina 151
*/
function calculate(){
    var num1=0, num2=0;;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
             
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        num1=parseInt(document.getElementById("idNum1").value);
        num2=parseInt(document.getElementById("idNum2").value);
        

        if(num1<num2){
            varSpan.innerHTML="<p></p>Los numeros estan en forma ascendente: "+num1+", "+num2+"<br>";
        }else if(num1==num2){
            varSpan.innerHTML="<p></p>Los numeros son iguales: "+num1+", "+num2+"<br>";
        }else{
            varSpan.innerHTML="<p></p>Los numeros estan en forma ascendente: "+num2+", "+num1+"<br>";
        }

        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNum1").value="";
        document.getElementById("idNum2").value="";
        document.getElementById("idSpan").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  