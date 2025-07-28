/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 02.-Contar los números enteros positivos introducidos por teclado. Se consideran dos variables enteras numero 
                y contador (contará el número de enteros positivos). Se supone que se leen números positivos y se detiene 
                el bucle cuando se lee un número negativo o cero.
    Pagina 161
*/
function calculate(){
    let num=0, totalNumbers=0;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");      

    if(document.getElementById("idBtnCalculate").value=="Ejecutar"){  
        num=parseInt(prompt("Ingrese un numero: "));
        varSpan.innerHTML+=num;

        while(num>0){
            totalNumbers++;
            num=parseInt(prompt("Ingrese un numero: "));
            
            if(num>0){
                varSpan.innerHTML+=", "+num;
            }
            
        }

        varSpan.innerHTML+="<br>Total de numeros positivos ingresados: "+totalNumbers+"</br>";

        document.getElementById("idLblMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Ejecutar";
    }

    
}