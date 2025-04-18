/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Determinar el precio de un boleto de ida y vuelta en un avion, conociendo la distancia
    a recorrery sabiendo que si el numero de dias de estancia es superior a 7 dias y la distancia es superior a 800 km
    el boleto tiene una reeduccion del 30 por 100. El precio por Km es de 2.5 euros.
    Actividades de programacion Resueltas
    4.2, Pagina 151
*/ 
function calculate(){
    const PRICE_FOR_KM=2.5;
    var km=0, days=0, discount=0, subtotal=0;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");           
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
            
        km=parseInt(document.getElementById("idKm").value);
        days=parseInt(document.getElementById("idDays").value);
        
        subtotal=km*PRICE_FOR_KM;

        if(km>800 && days>7){
            discount=(subtotal*30)/100;
        }

        varSpan.innerHTML+="<p><br>******************* TOTAL A PAGAR *******************</p>";
        varSpan.innerHTML+="<br>KM Recorridos: "+km;
        varSpan.innerHTML+="<br>Dias de estancia: "+days;
        varSpan.innerHTML+="<br>Subtotal a pagar $: "+subtotal;
        varSpan.innerHTML+="<br>Descuento en caso de aplicar $: "+discount;
        varSpan.innerHTML+="<br>Total a pagar $: "+(subtotal-discount)+"<br>";
            
        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idKm").value="";
        document.getElementById("idDays").value="";

        document.getElementById("idSpan").remove();
            
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}  