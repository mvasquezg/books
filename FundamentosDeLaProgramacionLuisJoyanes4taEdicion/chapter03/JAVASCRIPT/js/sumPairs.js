/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 28.-Escribir la suma de los primeros diez numeros pares.
*/
function calculate(){
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
            
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        varSpan.innerHTML+="<br>2";
        sum=2;
        for(var i=2; i<=10; i++){
            sum+=i*2;
            varSpan.innerHTML+=" + "+(i*2);
        }
        varSpan.innerHTML+=" = "+sum+"<br><br>"; 
        document.getElementById("idShowData").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
        
