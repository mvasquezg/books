
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 22.-Si x es mayor que y, y z es menor que 20, leer un valor para p

    Ejercicios
    4.1 (d) Pagina 155
*/

var x=0, y=0, z=0, p=0;

function calculate(){
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
    
        if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
            
            x=parseInt(document.getElementById("idX").value);
            y=parseInt(document.getElementById("idY").value);
            z=parseInt(document.getElementById("idZ").value);
        

            if( (x>y) && (z<20)){
                document.getElementById("idLblP").style.display='block';
            }else{
                alert("\nNo se cumple la condicion X>Y && z<20");
            }
            
            p=parseInt(document.getElementById("idInputP").value);
            document.getElementById("idBtnCalculate").value="Limpiar";
            
        }else{                   
            document.getElementById("idX").value="";
            document.getElementById("idY").value="";
            document.getElementById("idZ").value="";
            document.getElementById("idInputP").value="";
        
            document.getElementById("idLblP").style.display='none';
            document.getElementById("idBtnCalculate").value="Calcular";
    }
}
