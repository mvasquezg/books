function calculate(){
    let count15=0, countBetween2545=0, count50=0;
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
        
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        for(var i=1; i<=100; i++){
            if(i<15){
                count15++;
            }

            if(i>25 && i<45){
                countBetween2545++;
            }

            if(i>50){
                count50++;
            }
        } 
        varSpan.innerHTML+="<br>Numero mayores a 15: "+count15+"<br>Numeros entre 25 y 45: "+countBetween2545+"<br>Numero mayor a 50: "+count50;
        document.getElementById("idShowData").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
                
        