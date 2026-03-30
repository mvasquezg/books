/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 08.-Algoritmo que transforma un número introducido por teclado en notación decimal a romana. El número será entero
                 y positivo y no excederá de 3.000. 
    
    Ejemplo 9
    Pagina 212-213
*/

  
    function convertToRomanNumeral(digit, v1, v2, v3){
        var romanNUmber="";
        
        if(digit==9){
            romanNUmber+=v1+""+v3;
        }else if(digit>4){
            romanNUmber+=v2;

            for(var i=1; i<=digit-5; i++){
                romanNUmber+=v1;
            }
        }else if(digit==4){
            romanNUmber+=v1+""+v2;
        }else{ 
            for(var i=1; i<=digit; i++){
                romanNUmber+=""+v1;
            }   
        }    
        return romanNUmber;
    }
    
    
    function calculate(){
        var num=0;
        var r=0, digit=0;
        var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");

        if(document.getElementById("idBtnCalculate").value=="Calcular"){

            num=document.getElementById("idNum").value;

            //Millar
            r=num;
            digit=parseInt(r/1000);
            r=r%1000;

            document.getElementById("idResult").value=varSpan.innerHTML+=convertToRomanNumeral(digit, 'M', ' ', ' ');

            //Centena
            digit=parseInt(r/100);
            r=r%100;

            document.getElementById("idResult").value=varSpan.innerHTML+=convertToRomanNumeral(digit, 'C', 'D', 'M');

            //Decena
            digit=parseInt(r/10);
            r=r%10;

            document.getElementById("idResult").value=varSpan.innerHTML+=convertToRomanNumeral(digit, 'X', 'L', 'C');

            //Unidad
            digit=r;
            document.getElementById("idResult").value=varSpan.innerHTML+=convertToRomanNumeral(digit, 'I', 'V', 'X');

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
    
 