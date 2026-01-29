/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 06.-Algoritmo que simplifique un quebrado, dividiendo numerador y denominador por su máximo común divisor.
    
    Ejemplo 7
    Pagina 208-209
*/

    function showMcd(numerator, denominator){
        var dividendo=0, divisor=0;

        if(numerator%denominator==0){
            return denominator;
        }else{
            dividendo=denominator;
            divisor=numerator%denominator;
            return showMcd(dividendo, divisor);
        }   
    }   

    function calculate(){
        var numerator=0, denominator=0, mcd=0;
        var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");

        if(document.getElementById("idBtnCalculate").value=="Calcular"){  
            numerator=parseInt(document.getElementById("idNum").value);
            denominator=parseInt(document.getElementById("idDen").value);

            mcd=showMcd(numerator, denominator);
             
            varSpan.innerHTML+="<br>Fraccion: "+numerator+" / "+denominator+"<br>MCD: "+mcd+"<br>Fraccion simplificada: "+(numerator/mcd)+" / "+(denominator/mcd)+"<br>";
            document.getElementById("idResult").append(varSpan);
            document.getElementById("idBtnCalculate").value="Limpiar";
        
        
        }else{
            cleanPage();
        }
    }

    function cleanPage(){
        document.getElementById("idNum").value="";
        document.getElementById("idDen").value="";
        document.getElementById("idResult").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }