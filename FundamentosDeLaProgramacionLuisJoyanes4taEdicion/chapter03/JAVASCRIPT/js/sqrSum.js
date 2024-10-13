function calculate(){
    let sum=0
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        for(var i=1; i<=100; i++){
            varSpan.innerHTML+=i+" * "+i+" = "+Math.pow(i, 2)+"<br>";
            sum+=Math.pow(i, 2);
        }
        varSpan.innerHTML+="Suma Total: "+sum+"<br>";
        document.getElementById("idShowData").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
        