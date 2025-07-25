/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 01.-Leer por teclado un número que represente una cantidad de números que a su vez se leerán también por teclado.
                 Calcular la suma de todos esos números.
    Pagina 160
*/
        
function calculate(){
    let totalNumbers=0, sum=0, num=0;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");      


    if(document.getElementById("idBtnCalculate").value=="Calcular"){   
        totalNumbers=parseInt(document.getElementById("idTotalNumbers").value);

        while(totalNumbers>0){
            num=parseInt(prompt("Ingrese un numero: "));
            
            varSpan.innerHTML+=num+" + ";
            
            sum+=num;
            totalNumbers--;
        }

        varSpan.innerHTML+="<br>La suma total de los numeros es igual a "+sum;

        document.getElementById("idLblMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idTotalNumbers").value="";
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Calcular";
    }

    
}