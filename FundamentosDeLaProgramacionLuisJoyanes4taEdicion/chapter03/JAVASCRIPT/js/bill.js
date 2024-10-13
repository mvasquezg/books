function calculate(){
    let amount=0, idProduct=0, price=0, subTotal=0, total=0, iva=0, discount=0;
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        price=parseFloat(document.getElementById("idPrice").value);
        amount=parseInt(document.getElementById("idAmount").value);
        
        subTotal=price*amount;
        iva=subTotal*0.15;
        total=subTotal+iva;
        if(total>1000){
            discount=(total*0.05);
        }

        document.getElementById("idSubtotal").value=subTotal;
        document.getElementById("idIVA").value=iva;
        document.getElementById("idTotal").value=total;
        document.getElementById("idDiscount").value=(total-discount);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idClaveProduct").value="";
        document.getElementById("idPrice").value="";
        document.getElementById("idAmount").value="";
        document.getElementById("idSubtotal").value="";
        document.getElementById("idIVA").value="";
        document.getElementById("idTotal").value="";
        document.getElementById("idDiscount").value="";
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}