/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 01.-Definición de la función: y = x^n (potencia n de x)
    
    Ejemplo1
    Pagina 206
*/

function calculate(){
    let x=0, n=0;

    if(document.getElementById("idBtnCalculate").value=="Calcular"){  
        x=parseInt(document.getElementById("idX").value);
        n=parseInt(document.getElementById("idN").value);

        document.getElementById("idY").value=calculateY(x, n);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        cleanPage();
    }


}

function calculateY(x, n){
    let result=1;
    for(let i=1; i<=n; i++){
        result*=x;
    }
    return result;
}

function cleanPage(){
    document.getElementById("idX").value="";
    document.getElementById("idN").value="";
    document.getElementById("idY").value="";
    document.getElementById("idBtnCalculate").value="Calcular";
}