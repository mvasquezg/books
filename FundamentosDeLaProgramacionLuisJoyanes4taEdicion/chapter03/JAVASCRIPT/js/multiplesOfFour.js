function calculate(){
    let num=0;
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
            
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        num=parseInt(document.getElementById("idNum").value);
        
        varSpan.innerHTML+="<br><br>";
        for(var i=1; i<=num; i++){
            
            if(i%4==0){
                varSpan.innerHTML+=i+" ";
            }
        }
        
        document.getElementById("idShowData").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idNum").value="";
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
        
