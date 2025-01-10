/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 02.-Resolucion de una ecuacion de primer grado.
    Si la ecuacion es ax+b=0, a y b son los datos, y las posibles soluciones son:
    ** a <> 0               x= -b/a
    ** a = 0  b <> 0   entonces "Solucion imposible"
    ** a = 0 b = 0     entonces "Solucion indeterminada"
    ejemplo 4.3, pagina 133
*/
function calculate(){
    let a=0, b=0, x=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        a=parseInt(document.getElementById("idNumber1").value);
        b=parseInt(document.getElementById("idNumber2").value);

        if(a!=0){
            x=-b/a;
            varSpan.innerHTML+="x=-b/a\nx="+x+"<br>";

        }else if(a==0 && b!=0){
            varSpan.innerHTML+="Solucion imposible";
        }else if(a==0 && b==0){
            varSpan.innerHTML+="Solucion indeterminada  ";
        }

        document.getElementById("idMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNumber1").value="";
        document.getElementById("idNumber2").value="";
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
