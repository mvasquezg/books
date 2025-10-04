/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 01.-Calcular la superficie (área) de un rectángulo, usando funciones.
    
    Ejemplo1
    Pagina 202
*/

function calculateArea(base, altura){
    return base*altura;
}


function calculate(){
    let base=0, altura=0;

    if(document.getElementById("idBtnCalculate").value=="Calcular"){  
        base=parseFloat(document.getElementById("idBase").value);
        altura=parseFloat(document.getElementById("idAltura").value);

        document.getElementById("idResult").value=calculateArea(base, altura);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        cleanPage();
    }
}

function cleanPage(){
    document.getElementById("idBase").value="";
    document.getElementById("idAltura").value="";
    document.getElementById("idResult").value="";
    document.getElementById("idBtnCalculate").value="Calcular";
}