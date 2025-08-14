
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 16.-Dados dos números enteros, realizar el algoritmo que calcule su cociente y su resto.
    
    Ejercicio 5.5
    Pagina 187
*/


function calculate(){
    let num1=0, num2=0, dividendo=0, divisor=0, cociente=0;
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){  
        
        num2=document.getElementById("idDividendo").value;
        num1=document.getElementById("idDivisor").value;
        
        divisor=num1;
        dividendo=num2;   

        do{
            dividendo=dividendo-divisor;
            cociente++;
        }while(dividendo>=divisor);

        document.getElementById("idCosiente").value=cociente;
        document.getElementById("idResto").value=dividendo;

        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idDividendo").value="";
        document.getElementById("idDivisor").value="";
 
        document.getElementById("idCosiente").value="";
        document.getElementById("idResto").value="";


        document.getElementById("idBtnCalculate").value="Ejecutar";
    }   
}