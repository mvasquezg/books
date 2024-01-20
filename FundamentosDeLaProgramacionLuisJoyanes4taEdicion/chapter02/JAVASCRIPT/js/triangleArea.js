/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 27.Escribir un algoritmo que calcule la superficie de un triángulo en función de la base y la altura 
    (S = 1/2Base × Altura)
*/


function calculate(){
    
    let base=document.getElementById("idB").value;      //Base
    let heihgt=document.getElementById("idH").value;     //Altura
    let area=0;

    let paragrafh=document.createElement("p");
    paragrafh.setAttribute("id", "idParagraf");

    if(document.getElementById("idBtnCalculate").value=="Calcular"){

        area=(base*heihgt)/2;

        paragrafh.innerHTML="El area del tiangulo es igual a: "+area;

        document.getElementById("idSection").appendChild(paragrafh);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idParagraf").remove();
        
        document.getElementById("idB").value="";
        document.getElementById("idH").value="";

        document.getElementById("idBtnCalculate").value="Calcular";
    }    
}

/*
        
        
        System.out.print("\nEl sueldo total mensual es igual a: "+totalSalary+"\n");
    }
}*/

