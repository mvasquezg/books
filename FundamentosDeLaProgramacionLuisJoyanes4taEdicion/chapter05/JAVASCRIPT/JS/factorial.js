/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 06.-Desarrollar el algoritmo necesario para calcular el factorial de un número N que responda a la fórmula:
                N! = N * (N – 1) * (N – 2), ..., 3 * 2 * 1
    Pagina 169
*/
function calculate(){
    let factorial=1, num=0;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");      

    if(document.getElementById("idBtnCalculate").value=="Calcular"){  
        num=parseInt(document.getElementById("idNum").value);
        
        varSpan.innerHTML+="El factorial de "+num+" es igual a: ";
        for(let i=num; i>0; i--){
            factorial*=i;
        }

        varSpan.innerHTML+=factorial;
        document.getElementById("idLblMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNum").value="";
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Calcular";
    }    
}