function calculate(){
    let sumEven=0, sumOdd=0;
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");    
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        
        for(var i=1; i<=200; i++){

            if(i%2==0){
                sumEven+=i;
            }else{
                sumOdd+=i;
            }
        }
        
        varSpan.innerHTML="La suma de los numeros pares es igual a: "+sumEven+"<br>La suma de los numeros impares es igual a: "+sumOdd;
        document.getElementById("idPtext").appendChild(varSpan);

        
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular"
    }   

    
}