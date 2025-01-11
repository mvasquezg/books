/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 05.-Estructura selectiva para para averiguar si un año es o no bisiesto.
    Regla para obtener el año bisiesto:
    1.-Todos los año son divisibles entre 4.
    2.-Aquellos años que son divisibles entre 4, pero no entre 100, son bisiestos.
    3.-Los años que son divisibles entre 100, pero no entre 400, no son bisiestos.
    4.-Sin embargo, los años divisibles entre 100 y entre 400 sí que son bisiestos.
    ejemplo 4.7, pagina 136-137
*/
function calculate(){
    let year=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        year=parseInt(document.getElementById("idYear").value);
        if(year%4==0){
          varSpan.innerHTML="A&ntilde;o Bisiesto.<br>";
        }else if(year%100==0){
            if(year%400==0){
                varSpan.innerHTML="A&ntilde;o Bisiesto.<br>";
            }
        }
        document.getElementById("idMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idYear").value="";
        document.getElementById("idSpan").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
        
