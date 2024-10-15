function calculate(){
    let sum=0
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
            
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        varSpan.innerHTML+=2;
        sum+=2;
        for(var i=4; i<=100; i+=2){
            varSpan.innerHTML+=", "+i;
            sum+=i;
        }
        varSpan.innerHTML+="<br>Suma Total: "+sum+"<br>";
        document.getElementById("idShowData").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
        
