/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 11.-Se trata de realizar el cálculo del área de un círculo y la longitud de la circunferencia en función del valor del radio
                 leído desde el teclado.
    
    Ejemplo 11
    Pagina 223-224
*/
function calArea(radio){
    return Math.PI*radio*radio;
}

function calcCircun(radio){
    return Math.PI*2*radio;
}

function calculate(){
    var radio;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){

        radio=document.getElementById("idNum").value;
        
        document.getElementById("idResult").value=varSpan.innerHTML+="<br>Area: "+calArea(radio)+"<br>Circunferencia: "+calcCircun(radio)+"<br><br>";
        
        document.getElementById("idResult").append(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        cleanPage();
    }
}        
            
function cleanPage(){
    document.getElementById("idNum").value="";
    document.getElementById("idSpan").remove();
    document.getElementById("idBtnCalculate").value="Calcular";
}   