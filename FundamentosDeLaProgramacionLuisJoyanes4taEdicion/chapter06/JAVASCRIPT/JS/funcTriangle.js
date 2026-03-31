/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 12.-La función triángulo calcula el área de un triángulo en C++
    
    Ejemplo 6.15
    Pagina 232-233
*/
function calcArea(baseT, heigth){
    return (baseT*heigth)/2;
}

function calculate(){
    var baseT=0.0, heigth=0.0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");

        if(document.getElementById("idBtnCalculate").value=="Calcular"){

            baseT=document.getElementById("idBaseT").value;
            heigth=document.getElementById("idHeight").value;
            
            document.getElementById("idResult").value=varSpan.innerHTML="<br>Area: "+calcArea(baseT, heigth)+"<p></p><p></p>";

            document.getElementById("idResult").append(varSpan);
            document.getElementById("idBtnCalculate").value="Limpiar";

        }else{
            cleanPage();
        }
    }        
            
    function cleanPage(){
        document.getElementById("idBaseT").value="";
        document.getElementById("idHeight").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
        
    }