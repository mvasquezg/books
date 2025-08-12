/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 15.-Ejecutar y visualizar el programa siguiente que imprime una tabla de m filas por n columnas y un carácter
prefijado.
    Pagina 185
*/
function calculate(){
    let row=0, column=0, ch=' ';
    
    let varSpan=document.createElement("span");
    varSpan.setAttribute("id", "idSpan");


    if(document.getElementById("idBtnCalculate").value=="Ejecutar"){  
        
        row=document.getElementById("idRow").value;
        column=document.getElementById("idCol").value;
        ch=document.getElementById("idChar").value;

        for(let i=1; i<=row; i++){
            for(let j=1; j<=column; j++)    {
                varSpan.innerHTML+=ch;
            }
            varSpan.innerHTML+="<br>";
        }

        document.getElementById("idLblMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idRow").value="";
        document.getElementById("idCol").value="";
        document.getElementById("idChar").value="";
        
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Ejecutar";
    }   
}