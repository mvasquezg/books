
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 21.-Si el número es positivo, sumar el número a total de positivos, sino sumar al total de negativos.

    Ejercicios
    4.1 (c) Pagina 155
*/

function calculate(){
    let num=0, sumPosit=0, sumNegat=0, resp;
    
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        do{
            num=parseInt(prompt("Ingresa un numero: "));

            if(num<0){
                sumNegat+=num;
                varSpan.innerHTML+=num+"<br>";
            }else{
                sumPosit+=num;
                varSpan.innerHTML+=num+"<br>";

            }

            resp=prompt("Desea agregar otro numero: ");

        }while(resp!='n');
        
        varSpan.innerHTML+="<br>Suma de numeros positivos: "+sumPosit+"<br>Suma de numeros negativos: "+sumNegat+"<br><br>";


        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
