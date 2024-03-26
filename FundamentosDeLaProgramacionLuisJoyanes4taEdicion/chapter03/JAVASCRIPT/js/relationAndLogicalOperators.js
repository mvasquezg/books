
function calculate(){
    
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                 
        
        let varSpan1=document.createElement("span");
        varSpan1.setAttribute("id", "idSpan1");
        
        let varSpan2=document.createElement("span");
        varSpan2.setAttribute("id", "idSpan2");
        
        if((1 < 5) && ( 5 < 10)){
            varSpan1.innerHTML+="1 < 5) Y ( 5 < 10) = Verdadero";
        }else{
            varSpan1.innerHTML+="1 < 5) Y ( 5 < 10) = Falso";
        }

        if((5 > 10) || (67 < 66)){
            varSpan2.innerHTML+="(5 > 10) || (C < B) = Verdadero";
        }else{
            varSpan2.innerHTML+="(5 > 10) || (C < B) = Falso";
        }
        
        document.getElementById("idArt1").appendChild(varSpan1);
        document.getElementById("idArt2").appendChild(varSpan2);

        
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan1").remove();
        document.getElementById("idSpan2").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}