/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 03.-Obtener un algoritmo que lea un número (por ejemplo, 198) y obtenga el número inverso (por ejemplo, 891).
    Pagina 166
*/
function calculate(){
    let num=0, inverseNumber=0;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");      

    if(document.getElementById("idBtnCalculate").value=="Ejecutar"){  
        num=parseInt(document.getElementById("idNumber").value);
        varSpan.innerHTML+="<br>Numero Inverso: ";
        
        do{
            inverseNumber=parseInt(num%10);

            varSpan.innerHTML+=inverseNumber;
            num=parseInt(num/10);
        }while(num>0);

        document.getElementById("idLblMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNumber").value="";
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Ejecutar";
    }    
}