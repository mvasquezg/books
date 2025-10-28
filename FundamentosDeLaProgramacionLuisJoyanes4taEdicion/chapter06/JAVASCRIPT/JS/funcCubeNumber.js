/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 05.-Realizar el diseño de la función y = x3 (cálculo del cubo de un número)..
    
    Ejemplo5
    Pagina 207
*/

function calculateCube(x){
    return x*x*x;
}

function calculate(){
    let n=0;

    if(document.getElementById("idBtnCalculate").value=="Calcular"){  
        n=parseInt(document.getElementById("idNum").value);

        document.getElementById("idResult").value=calculateCube(n);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        cleanPage();
    }
}

function cleanPage(){
    document.getElementById("idNum").value="";
    document.getElementById("idResult").value="";
    document.getElementById("idBtnCalculate").value="Calcular";
}