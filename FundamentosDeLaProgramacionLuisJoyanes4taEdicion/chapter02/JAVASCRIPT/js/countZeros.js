function calculate(){
    let number=0;
    let countZeros=0;
    let paragrafh=document.createElement("p");
    paragrafh.setAttribute("id", "idParagrafh");

    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        
        do{
            number=parseInt(prompt("Ingresa un numero\nCualquier numero negativo termina el programa y muestra la cantidad de ceros capturados: "));
            
            if(number==0){
                countZeros++;
            }
    
        }while(number>=0);

        paragrafh.innerHTML="La cantida de ceros capturados es igual a: "+countZeros;
        document.getElementById("idSection").appendChild(paragrafh);
        document.getElementById("idBtnCalculate").value="Limpiar";  
    }else{
        document.getElementById("idParagrafh").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
/*
    

    printf("El total de ceros capturados es: %d\n\n", countZeros);*/