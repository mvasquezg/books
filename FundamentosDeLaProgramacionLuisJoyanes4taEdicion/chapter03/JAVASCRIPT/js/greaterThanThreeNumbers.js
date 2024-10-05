function calculate(){
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        let varSpan1=document.createElement("span");
        let varSpan2=document.createElement("span");
        let varSpan3=document.createElement("span");

        let num1=parseInt(document.getElementById("idNum1").value);
        let num2=parseInt(document.getElementById("idNum2").value);
        let num3=parseInt(document.getElementById("idNum3").value);    
        
        
        varSpan1.setAttribute("id", "idSpan1");
        varSpan1.innerHTML=" ";
        
        varSpan2.setAttribute("id", "idSpan2");
        varSpan2.innerHTML=" ";
        
        varSpan3.setAttribute("id", "idSpan3");
        varSpan3.innerHTML=" ";
        
        //Start validation numbers
        if(num1==num2){

            if(num2==num3){
                alert("Los tres numeros son iguales.");
            }else if(num2>num3){
                varSpan1.innerHTML="Es Mayor";
                varSpan2.innerHTML="Es Mayor";
            }else{
                varSpan3.innerHTML="Es ayor";
                document.getElementById("idLblNum3").appendChild(varSpan3);
            }
            document.getElementById("idLblNum1").appendChild(varSpan1);
            document.getElementById("idLblNum2").appendChild(varSpan2);
            document.getElementById("idLblNum3").appendChild(varSpan3);
            document.getElementById("idBtnCalculate").value="Limpiar";
        }else if(num1>num2){
            if(num2==num3){
                varSpan1.innerHTML="Es Mayor";
            }else if(num2>num3){
                varSpan1.innerHTML="Es Mayor";
            }else{
                if(num1==num3){
                    varSpan1.innerHTML="Es Mayor"
                    varSpan3.innerHTML="Es Mayor"
                    
                    document.getElementById("idLblNum1").appendChild(varSpan1);
                    document.getElementById("idLblNum3").appendChild(varSpan3);
                }else if(num1>num3){
                    varSpan1.innerHTML="Es Mayor";
                }else{
                    varSpan3.innerHTML="Es Mayor";
                }
            }

            document.getElementById("idLblNum1").appendChild(varSpan1);
            document.getElementById("idLblNum2").appendChild(varSpan2);
            document.getElementById("idLblNum3").appendChild(varSpan3);
            document.getElementById("idBtnCalculate").value="Limpiar";
        }else{
            if(num2==num3){
                varSpan2.innerHTML="Es Mayor"
                varSpan3.innerHTML="Es Mayor"
            }else if(num2>num3){
                varSpan2.innerHTML="Es Mayor"     
            }else{
                varSpan3.innerHTML="Es Mayor"
            }
            document.getElementById("idLblNum1").appendChild(varSpan1);
            document.getElementById("idLblNum2").appendChild(varSpan2);
            document.getElementById("idLblNum3").appendChild(varSpan3);
            document.getElementById("idBtnCalculate").value="Limpiar";
        }
        //end validation numbers
    
    }else{
        document.getElementById("idNum1").value="";
        document.getElementById("idNum2").value="";
        document.getElementById("idNum3").value="";
        document.getElementById("idBtnCalculate").value="Calcular";
      
        document.getElementById("idSpan1").remove();
        document.getElementById("idSpan2").remove();
        document.getElementById("idSpan3").remove();        
    }//end if botton Calculate   
}