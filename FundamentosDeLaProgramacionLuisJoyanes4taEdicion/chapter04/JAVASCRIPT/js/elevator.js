/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 32.-Escriba un programa que simule el funcionamiento normal de un ascensor (elevador) moderno 
                con 25 pisos (niveles) y que posee dos botones de SUBIR y BAJAR, 
                excepto en el piso (nivel) inferior, que sólo existe botón de llamada para SUBIR 
                y en el último piso (nivel) que sólo existe botón de BAJAR.

    Pagina 156
*/


function calculate(Object){
   
    let floor;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
    
    varSpan.innerHTML=" "     
    document.getElementById("idMessage").appendChild(varSpan);
    document.getElementById("idSpan").remove();    
        
    floor=Object;

    varSpan.innerHTML="PISO: " + floor.value 


    document.getElementById("idMessage").appendChild(varSpan);    
}
