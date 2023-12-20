let number=0;
let average=0;
let count=0;
let sum=0;

function calculate(){
    

    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        let paragrafafh=document.createElement("p");
        paragrafafh.setAttribute("id", "idParagrafh");    
        
        do{
            number=parseInt(prompt("Ingresa un numero\nPresiona Cero para terminar la captura: "));
            
            if(number>0){
                sum+=number;
                count++;
            }

        }while(number>0 || number<0);
        
        average=sum/count;
        
        paragrafafh.innerHTML+="Numeros positivos Capturados: "+count+"<p>La suma de los numeros positivos es igual a: "+sum+"</p><p>El promedio es igual a: "+average+"</p>";
        document.getElementById("idSection").appendChild(paragrafafh);
        document.getElementById("idBtnCalculate").value="Limpiar";
    
    }else{
        document.getElementById("idParagrafh").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
        sum=0;
        average=0;
    }

}
/**
 * 

    printf("Ingresa un numero: ");
    scanf("%d", &number);
    
    while(number>0 || number<0){

        if(number>0){
            sum+=number;
            count++;
        }

        printf("Ingresa un numero: ");
        scanf("%d", &number);    
    }
    
    average=sum/count;

    printf("\n\nSuma: %d\nNumeros positvos ingresados: %d \nPromedio: %d\n\n", sum, count, average);
 * 
 * 
 */