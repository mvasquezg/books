/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Escribir una frase y detenerse en la primera vocal leída. (Se supone que se leen, uno a uno, caracteres desde el teclado.)
    Pagina 188
*/
function calculate(){
    let letter='';
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");      

        if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
            
            do{
                letter=prompt("Ingresa un letra: ");
                varSpan.innerHTML+=letter+"<br>"
            }while(letter!='a' && letter!='e' && letter!='i' && letter!='o' && letter!='u');
    
            varSpan.innerHTML+="<br></br>La vocal que termino el ciclo es: "+letter+"<br><br>";
        
            document.getElementById("idLblMessage").appendChild(varSpan);    
            document.getElementById("idBtnCalculate").value="Limpiar";
            
        }else{                   
             
            document.getElementById("idSpan").remove();        
            document.getElementById("idBtnCalculate").value="Calcular";
        }
}
