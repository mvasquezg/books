
function calculate(){
   
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                 
        let varSpan1=document.createElement("span");
        varSpan1.setAttribute("id", "idSpan1");
        
        let varSpan2=document.createElement("span");
        varSpan2.setAttribute("id", "idSpan2");

        varSpan1.innerHTML=3 + 6 * 14;
        document.getElementById("idArt1").appendChild(varSpan1);

        varSpan2.innerHTML= 8 + 7 * 3 + 4 * 6;
        document.getElementById("idArt2").appendChild(varSpan2);

        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan1").remove();
        document.getElementById("idSpan2").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}