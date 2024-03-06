
function calculate(){
   
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                 
        let a=parseInt(document.getElementById("idA").value);
        let b=parseInt(document.getElementById("idB").value);
        let c=parseInt(document.getElementById("idC").value);
        let d=parseInt(document.getElementById("idD").value);
        
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

        varSpan1.innerHTML=(a*(b+3));
        document.getElementById("idArt1").appendChild(varSpan1);

        varSpan2.innerHTML= ((a * b) + 3);
        document.getElementById("idArt2").appendChild(varSpan2);

        varSpan3.innerHTML= (a + (b + c) + d);
        document.getElementById("idArt3").appendChild(varSpan3);

        varSpan4.innerHTML= ((a+b/c) + d);
        document.getElementById("idArt4").appendChild(varSpan4);

        varSpan5.innerHTML= (a*b/c*d);
        document.getElementById("idArt5").appendChild(varSpan5);

        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan1").remove();
        document.getElementById("idSpan2").remove();
        document.getElementById("idSpan3").remove();
        document.getElementById("idSpan4").remove();
        document.getElementById("idSpan5").remove();
        
        document.getElementById("idA").value="";
        document.getElementById("idB").value="";
        document.getElementById("idC").value="";
        document.getElementById("idD").value="";
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}