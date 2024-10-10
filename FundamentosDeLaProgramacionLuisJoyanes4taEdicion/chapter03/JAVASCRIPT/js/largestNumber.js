/*
    
        
        if(largestNumber!=0){
            System.out.print("El numero mayor de la serie es: "+largestNumber+"\n");
        }

*/


function calculate(){
    let largestNumber=0, number=0;
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");    
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        
        do{
            number=parseInt(prompt("Presiones -99 para salir.\n\nIngresa un numero: "));
            

            
            if(number<0 && number!=-99){
                varSpan.innerHTML+=number+" numero negativo.<br>";
            }else if(number>0){

                if(number>largestNumber){
                    largestNumber=+number;
                    varSpan.innerHTML+=number+"<br>";   
                }else{
                    varSpan.innerHTML+=number+"<br>";
                }
            }else{
                varSpan.innerHTML+=" ";
            }
            

        }while(number!=-99);
        
        if(largestNumber!=0){
            varSpan.innerHTML+="<br>El numero mayor de la serie es: "+largestNumber;
        }
        document.getElementById("idPtext").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}