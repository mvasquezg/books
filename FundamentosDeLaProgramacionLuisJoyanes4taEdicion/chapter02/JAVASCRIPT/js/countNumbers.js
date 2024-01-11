
function calculate(){
    let number=0;
    let countNumbers=0;

    let paragrafg=document.createElement('p');
    paragrafg.setAttribute("id", "idParagrafg");

    paragrafg.innerHTML+="Los numeros capturados son: <p></p>";
    if(document.getElementById("idBtnCalculate").value=="Calcular"){
            
        do{
            
            number=prompt("Ingresa un numero diferente de cero.\nEl numero cero termina el programa: ");

            if(number!=0){
                countNumbers++;
                paragrafg.innerHTML+=number+", ";
            }

            
        }while(number!=0);
        
        paragrafg.innerHTML+="<p></p>El total de numeros capturados es: "+countNumbers;    
            
        document.getElementById("idSection").appendChild(paragrafg);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idParagrafg").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
        
    }
}