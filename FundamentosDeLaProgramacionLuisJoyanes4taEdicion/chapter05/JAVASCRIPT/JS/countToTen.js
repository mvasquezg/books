/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 04.-Cuenta hasta 10
    Pagina 167
*/

function calculate(){
    let num=1;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");      

    if(document.getElementById("idBtnCalculate").value=="Ejecutar"){  
        do{
            
            varSpan.innerHTML+=num+", ";
            num++;
        }while(num<=10);

        document.getElementById("idLblMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Ejecutar";
    }    
}