/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 09.-Validar un numero de identificacion. 
    Pagina 176
*/

function calculate(){
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");      

    if(document.getElementById("idBtnCalculate").value=="Ejecutar"){  
        
        for(let i=1; i<=25; i++){
            varSpan.innerHTML+=i+" ";
         
             if(i==5){
                varSpan.innerHTML+="<br><b><b>Numero: "+i+" es hora de salir.";
                break;
             }
         }

        document.getElementById("idLblMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Ejecutar";
    }

    
}