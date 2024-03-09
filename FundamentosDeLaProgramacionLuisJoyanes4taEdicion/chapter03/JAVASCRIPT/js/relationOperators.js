
function calculate(){
   
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                 
        let a=3, b=4;
        
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

        //Empieza condiconanels
        if(a<b){
            varSpan1.innerHTML=(a+" < "+b+" = Verdadero");
            document.getElementById("idArt1").appendChild(varSpan1);
        }else{
            varSpan1.innerHTML=(a+" < "+b+" = Falso");
            document.getElementById("idArt1").appendChild(varSpan1);
        }

        if(a>b){
            varSpan2.innerHTML= (a+" > "+b+" = Verdadero");
            document.getElementById("idArt2").appendChild(varSpan2);
        }else{
            varSpan2.innerHTML= (a+" > "+b+" = Falso");
            document.getElementById("idArt2").appendChild(varSpan2);
        }
    
        if(a==b){
            varSpan3.innerHTML= (a+" == "+b+" = Verdadero");
            document.getElementById("idArt3").appendChild(varSpan3);
        }else{
            varSpan3.innerHTML= (a+" == "+b+" = Falso");
            document.getElementById("idArt3").appendChild(varSpan3);
        }
    
        if(a<=b){
            varSpan4.innerHTML= (a+" <= "+b+" = Verdadero");
            document.getElementById("idArt4").appendChild(varSpan4);
        }else{
            varSpan4.innerHTML= (a+" <= "+b+" = Falso");
            document.getElementById("idArt4").appendChild(varSpan4);
        }
    
        if(a>=b){
            varSpan5.innerHTML= (a+" >= "+b+" = Verdadero");
            document.getElementById("idArt5").appendChild(varSpan5);
        }else{
            varSpan5.innerHTML= (a+" >= "+b+" = Falso");
            document.getElementById("idArt5").appendChild(varSpan5);
        }
    
        if(a!=b){
            varSpan6.innerHTML= (a+" != "+b+" = Verdadero\n");
            document.getElementById("idArt6").appendChild(varSpan6);
        }else{
            varSpan6.innerHTML= (a+" != "+b+" = Falso\n");
            document.getElementById("idArt6").appendChild(varSpan6);
        }
        //Termina condcionales

        
        
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