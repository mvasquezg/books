/**

           
        
 */


function calculate(){
    let sum=0;
    let prod=1;

    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");    
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){

        for(var i=20; i<=400; i+=2){
            sum+=i;
            prod*=i;    
        }

        varSpan.innerHTML+="Suma: "+sum+"<br>Producto: "+prod;
        document.getElementById("idPtext").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}