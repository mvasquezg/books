/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 04.-Diseñar un algoritmo que contenga un subprograma de cálculo del factorial de un número y una llamada al
                mismo.
    
    Ejemplo4
    Pagina 207
*/
function calculate(){
    let x=0;

    if(document.getElementById("idBtnCalculate").value=="Calcular"){  
        x=parseInt(document.getElementById("idX").value);

        document.getElementById("idResult").value=showFactorial(x);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        cleanPage();
    }
}

function showFactorial(x){
    if(x<=1){
        return 1;
    }else{
        return x*showFactorial(x-1);
    }

}

function cleanPage(){
    document.getElementById("idX").value="";
    document.getElementById("idResult").value="";
    document.getElementById("idBtnCalculate").value="Calcular";
}