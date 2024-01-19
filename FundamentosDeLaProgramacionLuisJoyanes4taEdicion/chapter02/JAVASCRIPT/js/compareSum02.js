function calculate(){
    let num1=0;   //numero1
    let num2=0;   //numero2
    let num3=0;   //numero3
    let sum1=0;   //suma de numero1+numero2
    let sum2=0;   //suma de numero1+numero3
    let sum3=0;   //suma de numero2+numero3

    let paragrafg=document.createElement('p');
    paragrafg.setAttribute("id", "idParagrafg");
        if(document.getElementById("idBtnCalculate").value=="Calcular"){
            
            num1=parseInt(document.getElementById("idNumber01").value);
            num2=parseInt(document.getElementById("idNumber02").value);
            num3=parseInt(document.getElementById("idNumber03").value);
            
            sum1=num1+num2;
            sum2=num1+num3;
            sum3=num2+num3;
            
            paragrafg.innerHTML+="Suma 1: "+num1+" + "+num2 + " = "+sum1+"<p></p>";
            paragrafg.innerHTML+="Suma 2: "+num1+" + "+num3 + " = "+sum2+"<p></p>";
            paragrafg.innerHTML+="Suma 3: "+num2+" + "+num3 + " = "+sum3+"<p></p>";
            if(sum1==num3){
                paragrafg.innerHTML+="Suma 1: "+sum1+" es igual al numero: "+3;
            }else if(sum2==num2){
                paragrafg.innerHTML+="Suma 2: "+sum2+" es igual al numero: "+2;
            }else if(sum3==num1){
                paragrafg.innerHTML+="Suma 3: "+sum3+" es igual al numero: "+1;
            }else{
                paragrafg.innerHTML+="Son Distintos";
            }

            document.getElementById("idSection").appendChild(paragrafg);
            document.getElementById("idBtnCalculate").value="Limpiar";
        }else{
            document.getElementById("idNumber01").value="";
            document.getElementById("idNumber02").value="";
            document.getElementById("idNumber03").value="";
            
            document.getElementById("idParagrafg").remove();
        
            document.getElementById("idBtnCalculate").value="Calcular";
        }
    

}