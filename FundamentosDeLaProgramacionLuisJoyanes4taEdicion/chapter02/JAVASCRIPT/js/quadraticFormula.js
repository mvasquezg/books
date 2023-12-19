var x1;
var x2;

function calculate(){
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        let paragrafh=document.createElement("p");
        paragrafh.setAttribute("id", "idParagrafh");

        let a=document.getElementById("idA").value;
        let b=document.getElementById("idB").value;
        let c=document.getElementById("idC").value;
        
        x1=(-b +(Math.sqrt(b*b - (4*a*c)))) / (2*a);
        x2=(-b -(Math.sqrt(b*b - (4*a*c))))/ (2*a);
        
        paragrafh.innerHTML+="x1 = "+x1+" x2 = "+x2;
        document.getElementById("idSection").appendChild(paragrafh);

        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idA").value="";
        document.getElementById("idB").value="";
        document.getElementById("idC").value="";
        
        document.getElementById("idParagrafh").remove();
        

        document.getElementById("idBtnCalculate").value="Calcular";
    }    
}