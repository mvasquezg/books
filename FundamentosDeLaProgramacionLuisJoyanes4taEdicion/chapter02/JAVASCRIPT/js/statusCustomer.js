var client=1;

function calculate() {
    
    if(document.getElementById("idOrder").value=='Pedido'){
        
        if(document.getElementById("idBtnCalculate").value=="Calcular"){
            let paragraf=document.createElement("p");
            paragraf.setAttribute("id", "idParagraf");
                
            if(client==1){
                paragraf.innerHTML="Pedido Aprobado";
                document.getElementById("idSection").appendChild(paragraf);
                document.getElementById("idBtnCalculate").value="Limpiar";
            }else{
                paragraf.innerHTML="Pedido No Aprobado";
                document.getElementById("idSection").appendChild(paragraf);
                document.getElementById("idBtnCalculate").value="Limpiar";
            }        
        }else{
            document.getElementById("idOrder").value="";
            document.getElementById("idParagraf").remove();
            document.getElementById("idBtnCalculate").value="Calcular";        
        }   
    }else{
        alert("Ingrese la palabra 'Pedido'");
        document.getElementById("idOrder").value="";
    }
}