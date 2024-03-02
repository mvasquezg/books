
function calculate(){
    
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                 
        let n=5;
        let varSpan1=document.createElement("span");
        varSpan1.setAttribute("id", "idSpan1");
        
        let varSpan2=document.createElement("span");
        varSpan2.setAttribute("id", "idSpan2");
        
        let varSpan3=document.createElement("span");
        varSpan3.setAttribute("id", "idSpan3");
        
        let varSpan4=document.createElement("span");
        varSpan4.setAttribute("id", "idSpan4");
        
        let varSpan5=document.createElement("span");
        varSpan5.setAttribute("id", "idSpan5");
        
        let varSpan6=document.createElement("span");
        varSpan6.setAttribute("id", "idSpan6");

        
        //document.getElementById("idSpan1").innerHTML=n;
        //document.getElementById("idArt1").appendChild(document.getElementById("idSpan1"));
        
        varSpan1.innerHTML=n;
        document.getElementById("idArt1").appendChild(varSpan1);


        varSpan2.innerHTML=n++;
        document.getElementById("idArt2").appendChild(varSpan2);

        varSpan3.innerHTML=n;
        document.getElementById("idArt3").appendChild(varSpan3);

        n=5;

        varSpan4.innerHTML=n;
        document.getElementById("idArt4").appendChild(varSpan4);
        

        varSpan5.innerHTML=(++n);
        document.getElementById("idArt5").appendChild(varSpan5);

        varSpan6.innerHTML=n;
        document.getElementById("idArt6").appendChild(varSpan6);
        
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan1").remove();
        document.getElementById("idSpan2").remove();
        document.getElementById("idSpan3").remove();
        document.getElementById("idSpan4").remove();
        document.getElementById("idSpan5").remove();
        document.getElementById("idSpan6").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}