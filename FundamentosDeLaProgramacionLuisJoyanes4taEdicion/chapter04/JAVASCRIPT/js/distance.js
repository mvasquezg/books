
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 23.-Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo.

    Ejercicios
    4.1 (e) Pagina 155
*/
function calculate(){
    let distance=0, time=0;
    
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
        
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        

            distance=parseInt(document.getElementById("idDistance").value);

            if(distance>20 && distance<35){
                document.getElementById("idTime").disabled=false;
            }else{
                alert("No cumple la condición ");
            }
        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idDistance").value="";
        document.getElementById("idTime").value="";
        document.getElementById("idTime").disabled=true;
        document.getElementById("idSpan").remove();


        document.getElementById("idBtnCalculate").value="Calcular";
    }
}