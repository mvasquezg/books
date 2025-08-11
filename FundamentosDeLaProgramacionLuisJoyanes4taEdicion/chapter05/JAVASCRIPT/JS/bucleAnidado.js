/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 12.-El segmento de programa siguiente visualiza una tabla de multiplicación por cálculo y visualización de productos
                 de la forma x * y para cada x en el rango de 1 a Xultimo y desde cada y en el rango 1 a Yultimo (donde Xultimo, e Yultimo son enteros prefijados). La tabla que se desea obtener es
    Pagina 183
*/

function calculate(){
    let x=3, y=10, producto=0;
    var varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan"); 
    if(document.getElementById("idBtnCalculate").value=="Ejecutar"){  
        varSpan.innerHTML+="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;i&nbsp;&nbsp;&nbsp;j<br>"
        for(let i=0; i<=4; i++){
            varSpan.innerHTML+="Externo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+i+"<br>"
            for(let j=0; j<=i; j++){
               producto=i*j;

                 varSpan.innerHTML+="&nbsp;&nbsp;&nbsp;Interno&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+j+"<br>"
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