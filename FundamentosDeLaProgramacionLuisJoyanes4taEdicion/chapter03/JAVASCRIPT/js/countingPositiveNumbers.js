
function calculate(){
    let countPositive=0, num=0, maxValue=15;

    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");    
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){

        for(var i=1; i<=maxValue; i++){
            num=parseInt(prompt(i+".-Ingresa un numero: "));
            varSpan.innerHTML+=num+", ";    
            if(num>0){
                countPositive++;
            }
        }
        varSpan.innerHTML+="<br><br>De "+maxValue+" valores, hay "+countPositive+" numeros positivos<br>";    
        document.getElementById("idPtext").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}