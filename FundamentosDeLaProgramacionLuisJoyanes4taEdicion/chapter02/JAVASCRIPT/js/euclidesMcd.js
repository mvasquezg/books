
function calculate(){
    
    let num1=0;
    let num2=0;
    let result=0;
    let residuo=0;
    let divisor=0;

    let paragrafg=document.createElement('p');
    paragrafg.setAttribute("id", "idParagrafg");

    if(document.getElementById("idBtnCalculate").value=="Calcular"){
            
            num1=parseInt(document.getElementById("idNum1").value);
            num2=parseInt(document.getElementById("idNum2").value);

            paragrafg.innerHTML+="\nMCD("+num1+", "+num2+") = ";

            do{
                if(num1>=num2 && num2!=0){
                    divisor=num2;
                    residuo=num1%num2;   
                }
                num1=divisor;
                num2=residuo;
            }while(num2!=0);

            
            paragrafg.innerHTML+=num1;
              
            document.getElementById("idSection").appendChild(paragrafg);
            document.getElementById("idBtnCalculate").value="Limpiar";
        }else{
            document.getElementById("idNum1").value="";
            document.getElementById("idNum2").value="";
            document.getElementById("idParagrafg").remove();
            num1=0;
            num2=0;
            document.getElementById("idBtnCalculate").value="Calcular";
        }
    

}