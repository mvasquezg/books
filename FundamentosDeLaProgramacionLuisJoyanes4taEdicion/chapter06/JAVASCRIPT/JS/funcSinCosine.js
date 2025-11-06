/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 06.-Algoritmo que contiene y utiliza unas funciones (seno y coseno) a las que les podemos pasar el ángulo en grados.
    
    Ejemplo 6
    Pagina 208
*/

function calculate(){
    let degree=0;

    if(document.getElementById("idBtnCalculate").value=="Calcular"){  
        degree=parseFloat(document.getElementById("idDegree").value);

        document.getElementById("idSin").value=calculateSin(degree);
        document.getElementById("idCosine").value=calculateCosine(degree);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        cleanPage();
    }
}

function calculateSin(degree){
    return Math.sin(degree*2*3.1416/360);
}

function calculateCosine(degree){
    return Math.cos(degree*2*3.1416/360);
}

function cleanPage(){
    document.getElementById("idDegree").value="";
    document.getElementById("idSin").value="";
    document.getElementById("idCosine").value="";
    document.getElementById("idBtnCalculate").value="Calcular";
}