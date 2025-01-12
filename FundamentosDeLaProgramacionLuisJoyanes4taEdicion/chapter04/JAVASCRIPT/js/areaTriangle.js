/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 06.-Programa que nos calcule el area de un triangulo conociendo sus lados. 
    La estructura selectiva se utiliza para el control de entrada de datos del programa.

    Nota: 
    Area = sqrt(P * (P-a) * (P-b) * (P-c))
    P = (a + b + c)/2

    donde P>a y P>b y P>c, sino se cumple la condicion entonces no es un triangulo.

    ejemplo 4.8, Pagina 138
*/
 
function calculate(){
    let Area=0, P=0, a=0, b=0, c=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
        if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
            a=parseFloat(document.getElementById("idA").value);
            b=parseFloat(document.getElementById("idB").value);
            c=parseFloat(document.getElementById("idC").value);
            P=(a+b+c)/2;
            if(P>a && P>b && P>c){
                Area=Math.sqrt(P * (P-a) * (P-b) * (P-c));
            }
            if(Area!=0){
                varSpan.innerHTML="\nEl area es igual a: "+Area;
            }else{
                varSpan.innerHTML="No es un triangulo.";
            }
        document.getElementById("idMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idA").value="";
        document.getElementById("idB").value="";
        document.getElementById("idC").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}