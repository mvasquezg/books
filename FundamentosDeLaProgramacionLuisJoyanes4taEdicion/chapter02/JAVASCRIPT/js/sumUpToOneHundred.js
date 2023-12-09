/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 03.Calcular el valor de la suma 1+2+3+...+100..
*/

var sum=0;

function calculate(){
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){

        let idParagaph=document.createElement("p");
        idParagaph.setAttribute("id", "idParagraph");
    
        idParagaph.innerHTML+=1;
        document.getElementById("idSection").appendChild(idParagaph);
        sum+=1;
    
        for(let i=2; i<=100; i++){
            idParagaph.innerHTML+=" + "+i;
            document.getElementById("idSection").appendChild(idParagaph);
            sum+=i;
        }

        idParagaph.innerHTML+=" = " + sum;
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idParagraph").remove();
        sum=0;
        document.getElementById("idBtnCalculate").value="Calcular";
    }
    
    

}