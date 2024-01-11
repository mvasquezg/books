
function calculate(){
    
    let number1=0;
    let number2=0;
    let result=0;

    let paragrafg=document.createElement('p');
    paragrafg.setAttribute("id", "idParagrafg");

    if(document.getElementById("idBtnCalculate").value=="Calcular"){
            
            number1=parseInt(document.getElementById("idNum1").value);
            number2=parseInt(document.getElementById("idNum2").value);

            result=number1*number2;

            paragrafg.innerHTML+="Multiplicacion: "+result;
              
            document.getElementById("idSection").appendChild(paragrafg);
            document.getElementById("idBtnCalculate").value="Limpiar";
        }else{
            document.getElementById("idNum1").value="";
            document.getElementById("idNum2").value="";
            document.getElementById("idParagrafg").remove();
            number1=0;
            number2=0;
            document.getElementById("idBtnCalculate").value="Calcular";
        }
    

}