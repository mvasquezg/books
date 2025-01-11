/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 04.-Empleo de estructura selectiva para detectar si un numero tiene o no parte fraccionaria.
    ejemplo 4.6, pagina 136
*/

function calculate(){
    let num=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        num=parseFloat(document.getElementById("idNum").value);

        if(num==Math.trunc(num)){
            varSpan.innerHTML+=num+" No tiene parte fraccionaria\n";
        }else{
            varSpan.innerHTML+=num+" Tiene parte fraccionaria\n\n";
        }

        document.getElementById("idMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNum").value="";
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
