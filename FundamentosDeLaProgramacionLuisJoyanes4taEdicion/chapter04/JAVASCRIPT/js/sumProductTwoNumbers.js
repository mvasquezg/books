/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 01.-Calcula la suma y el producto de dos numeros.
    ejemplo 4.1, pagina 129
*/        
function calculate(){
    let num1=0, num2=0, sum=0, product=0;
            
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        num1=parseInt(document.getElementById("idNumber1").value);
        num2=parseInt(document.getElementById("idNumber2").value);

        sum=num1+num2;
        product=num1*num2;
        document.getElementById("idSum").value=sum;
        document.getElementById("idProduct").value=product;

        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNumber1").value="";
        document.getElementById("idNumber2").value="";
        document.getElementById("idSum").value="";
        document.getElementById("idProduct").value="";

        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
        
