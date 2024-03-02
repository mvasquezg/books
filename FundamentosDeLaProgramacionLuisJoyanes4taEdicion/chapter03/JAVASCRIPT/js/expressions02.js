
function calculate(){
   
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                 
        let varSpan1=document.createElement("span");
        varSpan1.setAttribute("id", "idSpan1");
        
        let varSpan2=document.createElement("span");
        varSpan2.setAttribute("id", "idSpan2");

        varSpan1.innerHTML=(-4*7+Math.pow(2, 3)/4-5);
        document.getElementById("idArt1").appendChild(varSpan1);

        
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan1").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}