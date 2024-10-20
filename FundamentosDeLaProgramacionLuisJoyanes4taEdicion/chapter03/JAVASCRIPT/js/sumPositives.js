function calculate(){
    let sum=0, num=0;
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
        varSpan.innerHTML+="La suma de los isguientes numeros positivos:<br><br> "            
        if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
                
            do{
                
                num=parseInt(prompt("Ingrese un numero: "));
                if(num>0){
                    varSpan.innerHTML+=num+" ";
                    sum+=num;
                }

                
    
            }while(num!=-99);
                varSpan.innerHTML+=" es igual a "+sum+"<br><br>"; 
                document.getElementById("idShowData").appendChild(varSpan);
                document.getElementById("idBtnCalculate").value="Limpiar";
            }else{
                document.getElementById("idSpan").remove();
                document.getElementById("idBtnCalculate").value="Calcular";
            }
        }
                
        