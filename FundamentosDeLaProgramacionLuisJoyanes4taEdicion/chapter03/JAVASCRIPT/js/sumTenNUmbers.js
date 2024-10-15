function calculate(){
    let sum=0, number=0;
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
            
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        for(var i=1; i<=10; i++){
            number=parseInt(prompt(i+".-Ingrese un numero: "));
            varSpan.innerHTML+=i+".-"+number+"<br>";
            sum+=number;
        }
        varSpan.innerHTML+="<br>Suma Total: "+sum+"<br>";
        document.getElementById("idShowData").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
        
