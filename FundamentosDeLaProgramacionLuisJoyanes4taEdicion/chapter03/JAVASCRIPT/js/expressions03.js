
function calculate(){
   
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                 
        let a=parseInt(document.getElementById("idA").value);
        let b=parseInt(document.getElementById("idB").value);
        let x=parseInt(document.getElementById("idX").value);
        let y=parseInt(document.getElementById("idY").value);
        let u=parseInt(document.getElementById("idU").value);
        let w=parseInt(document.getElementById("idW").value);
        let z=parseInt(document.getElementById("idZ").value);

        let varSpan1=document.createElement("span");
        varSpan1.setAttribute("id", "idSpan1");
        
        let varSpan2=document.createElement("span");
        varSpan2.setAttribute("id", "idSpan2");

        let varSpan3=document.createElement("span");
        varSpan3.setAttribute("id", "idSpan3");

        let varSpan4=document.createElement("span");
        varSpan4.setAttribute("id", "idSpan4");

        varSpan1.innerHTML=5*(x+y);
        document.getElementById("idArt1").appendChild(varSpan1);

        varSpan2.innerHTML= Math.pow(a, 2) + Math.pow(b, 2);
        document.getElementById("idArt2").appendChild(varSpan2);

        varSpan3.innerHTML= (x + y) / (u + w/a);
        document.getElementById("idArt3").appendChild(varSpan3);

        varSpan4.innerHTML= (x/y)*(z+w);
        document.getElementById("idArt4").appendChild(varSpan4);

        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan1").remove();
        document.getElementById("idSpan2").remove();
        document.getElementById("idSpan3").remove();
        document.getElementById("idSpan4").remove();
        
        document.getElementById("idA").value="";
        document.getElementById("idB").value="";
        document.getElementById("idX").value="";
        document.getElementById("idY").value="";
        document.getElementById("idU").value="";
        document.getElementById("idW").value="";
        document.getElementById("idZ").value="";
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}