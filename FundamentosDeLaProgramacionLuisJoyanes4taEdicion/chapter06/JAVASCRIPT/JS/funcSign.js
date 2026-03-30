/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 10.-La función (signo) realiza la siguiente tarea: dado un número real x, si x es 0, entonces se devuelve un 0; si x es
                positivo, se devuelve 1, y si x es negativo, se devuelve un valor –1. 
    
    Ejemplo 10
    Pagina 216-217
*/
  function signNum(num){
       var result=0;
        
        if(num>0){
            result=1; 
        }else if(num<0){
            result=-1;
        }else{
            result=0;
        }
        return result;
    }

     function calculate(){
        var num=0;
        var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");

        if(document.getElementById("idBtnCalculate").value=="Calcular"){

            num=parseInt(document.getElementById("idNum").value);

            varSpan.innerHTML=signNum(num);
            
            document.getElementById("idResult").append(varSpan);
            document.getElementById("idBtnCalculate").value="Limpiar";

        }else{
            cleanPage();
        }
    }        
            
    function cleanPage(){
        document.getElementById("idNum").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
        
    }      
    
    
    
    
        

        