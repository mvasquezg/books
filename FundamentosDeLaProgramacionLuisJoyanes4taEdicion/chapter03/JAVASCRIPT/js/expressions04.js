
function calculate(){
   
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                 
        let varSpan1=document.createElement("span");
        varSpan1.setAttribute("id", "idSpan1");
        
        varSpan1.innerHTML=(12 + 3 * 7 + 5 * 4);
        document.getElementById("idArt1").appendChild(varSpan1);

        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan1").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}