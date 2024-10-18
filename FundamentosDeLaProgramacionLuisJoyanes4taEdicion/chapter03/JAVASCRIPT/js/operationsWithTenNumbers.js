function calculate(){
    let num=0, sumPairs=0, sumOfOdd=0, countPairs=0, countOdd=0, averageOdd=0;
    
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
            
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     

        varSpan.innerHTML+="Numeros pares: <br>"
        for(var i=1; i<=10; i++){
            num=parseInt(prompt(i+".-Ingresa un numero"));

            if(num%2==0){
                countPairs++;
                sumPairs+=num;
                varSpan.innerHTML+=num+"<br>"
            }else{
                countOdd++;
                sumOfOdd+=num;
            }            
        }
        averageOdd=sumOfOdd/countOdd;
        varSpan.innerHTML+="<br>En total se capturaron: "+countPairs+" numero pares.<br>El promedio de los numeros impares es: "+averageOdd+"\n";
        document.getElementById("idShowData").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
        
