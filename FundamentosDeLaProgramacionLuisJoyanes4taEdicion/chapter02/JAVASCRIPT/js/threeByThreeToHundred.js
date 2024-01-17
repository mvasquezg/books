/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 03.Calcular el valor de la suma 1+2+3+...+100..
*/

var sum=0;

function calculate(){
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){

        let idParagaph=document.createElement("p");
        idParagaph.setAttribute("id", "idParagraph");
        document.getElementById("idSection").appendChild(idParagaph);
        
        idParagaph.innerHTML+=3;
        sum=3;

        for(let i=6; i<=100; i+=3){
            idParagaph.innerHTML+=", "+i;
            sum+=i;
        }

        idParagaph.innerHTML+="<p></p> La suma total de la serie es igual a: " + sum;
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idParagraph").remove();
        sum=0;
        document.getElementById("idBtnCalculate").value="Calcular";
    }
    
    

}