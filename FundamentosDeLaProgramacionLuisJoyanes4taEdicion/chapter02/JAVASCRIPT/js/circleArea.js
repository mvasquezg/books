const PI=3.1416;    //Variable PI

function calculate(){
    let radio;
    let A;
    let P;

    let idParagrafh=document.createElement("p");
    idParagrafh.setAttribute("id", "idParagrafh");

   if(document.getElementById("idBtnCalculate").value=="Calcular"){
        radio=document.getElementById("idRadio").value;
        A=PI*radio*radio;          //Variable Area
        P=2*PI*radio;          //Variable Perimetro
        
        idParagrafh.innerHTML+="Area: "+A+"\nPerimetro: "+P;
        document.getElementById("idSection").appendChild(idParagrafh);
        
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idRadio").value="";
        document.getElementById("idParagrafh").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
    
}
/**
float r=0;          //Variable radio      
    
    

    printf("Ingrese el radio de la circunferencia: ");
    scanf("%f", &r);

    

    printf("\nRadio: %f\nArea: %f\nPerimetro: %f\n\n", r, A, P); 








 */
