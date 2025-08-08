/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 08.-Es muy frecuente tener que realizar validación de entrada de datos en la mayoría de las aplicaciones. Este ejemplo
                 detecta cualquier entrada comprendida entre 1 y 12, rechazando las restantes, ya que se trata de leer los números
                 correspondientes a los meses del año. 
    Pagina 171
*/
function calculate(){
    let month=0;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");      

    if(document.getElementById("idBtnCalculate").value=="Calcular"){  
            
        do{
            month=parseInt(prompt("Ingresa un numero de mes 1-12, con cualquier otro numero se sale del programa.\nIngrese el numero: "));
            varSpan.innerHTML+=month+"<br>"
        }while(month>=1 && month<=12);

        document.getElementById("idLblMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Calcular";
    }    
}