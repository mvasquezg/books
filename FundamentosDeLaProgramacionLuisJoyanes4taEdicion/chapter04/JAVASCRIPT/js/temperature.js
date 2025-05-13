/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 20.-Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima del punto de ebullición del agua”
     sino visualizar el mensaje “por debajo del punto de ebullición del agua”

    Ejercicios
    4.1 (b) Pagina 155
*/
function calculate(){
    
    var temperature=0;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");           
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
            
        temperature=parseInt(document.getElementById("idTemp").value);
        
        if(temperature>100){
            varSpan.innerHTML="La temperatura esta por encima del punto de ebullición del agua";
        }else{
            varSpan.innerHTML="La temperatura esta por debajo del punto de ebullición del agua";
        }      
        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idTemp").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  


