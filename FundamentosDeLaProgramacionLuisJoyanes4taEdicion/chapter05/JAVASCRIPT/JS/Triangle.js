/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 14.-Escribir un programa que visualice un triángulo isósceles.
    Pagina 188-185
*/
function calculate(){
    let num=5;
    let whiteCharacter='&nbsp;';
    let asterisco='*';

          

    if(document.getElementById("idBtnCalculate").value=="Ejecutar"){  
        let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
        
        for(let i=1; i<=num; i++){

            for(let j=num;j>0;j--){
               varSpan.innerHTML+=whiteCharacter;
            }
            

            for(let k=1;k<(2*i);k++){
               varSpan.innerHTML+=asterisco;
                console.log(asterisco);
            }
            varSpan.innerHTML+="<br>";
        }

        document.getElementById("idLblMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Ejecutar";
    }   
}