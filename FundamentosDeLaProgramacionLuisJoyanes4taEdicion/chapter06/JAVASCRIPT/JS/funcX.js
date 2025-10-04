/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 02.-Calcular la siguiente funcion
		
				f(x)=x/1+(x*x)
    Ejemplo2
    Pagina 205
*/  
function functionX(x){
    return x/(1+(x*x));
} 

function calculate(){
    let x=0;

    if(document.getElementById("idBtnCalculate").value=="Calcular"){  
        x=parseFloat(document.getElementById("idX").value);
        
        document.getElementById("idResult").value=functionX(x);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        cleanPage();
    }
}

function cleanPage(){
    document.getElementById("idX").value="";
    document.getElementById("idResult").value="";
    document.getElementById("idBtnCalculate").value="Calcular";
}