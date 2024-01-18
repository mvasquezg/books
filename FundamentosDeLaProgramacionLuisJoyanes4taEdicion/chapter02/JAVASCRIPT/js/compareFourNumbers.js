
function calculate(){
    
    let a; //Numero 1
    let b; //Numero 2
    let c; //Numero 3
    let d; //Numero 4


    let paragrafg=document.createElement('p');
    paragrafg.setAttribute("id", "idParagrafg");

    if(document.getElementById("idBtnCalculate").value=="Calcular"){
            
        a=parseInt(document.getElementById("idNum1").value);
        b=parseInt(document.getElementById("idNum2").value);
        c=parseInt(document.getElementById("idNum3").value);
        d=parseInt(document.getElementById("idNum4").value);
        
        if(a==b){
            if(b==c){
                if(c==d){
                    paragrafg.innerHTML+="Los numeros A="+a+" B="+b+", C="+c+", D="+d+". Son iguales\n\n";
                }else if(c>d){
                    paragrafg.innerHTML+="Los numeros A="+a+" B="+b+" C="+c+" Son iguales y mayores que D="+d+"\n\n";
                }else{
                    paragrafg.innerHTML+="El numero D="+d+" es mayor que A="+a+", B="+b+", C="+c+"\n\n";
                }
            }else if(b>c){
                if(b==d){
                    paragrafg.innerHTML+="Los numeros A="+a+", B="+b+", D="+d+" son mayores que C="+c+"\n\n";
                }else if(b>d){
                    paragrafg.innerHTML+="Los numeros A="+a+", B="+b+", son mayores que C="+c+", D="+d+"\n\n";
                }else{
                    paragrafg.innerHTML+="El numero D="+d+" es mayor que A="+a+", B="+b+", C="+c+"\n\n";
                }
            }else{
                if(c==d){
                    paragrafg.innerHTML+="Los numeros C="+c+", D="+d+" son mayores que A="+a+", B="+b+"\n\n";
                }else if(c>d){
                    paragrafg.innerHTML+="El numero C="+c+" es mayor que A="+a+", B="+b+", D="+d+"\n\n";
                }else{
                    paragrafg.innerHTML+="El numero D="+d+" es mayor que A="+a+", B="+b+", C="+c+"\n\n";
                }
            }
        }else if(a>b){
            if(a==c){
                if(c==d){
                    paragrafg.innerHTML+="Los numeros que A="+a+", C="+c+", D="+d+", son mayores que B="+b+"\n\n";
                }else if(c>d){
                    paragrafg.innerHTML+="Los numeros que A="+a+", C="+c+", son mayores que B="+b+", D="+d+"\n\n";
                }else{
                    paragrafg.innerHTML+="El numero D="+d+", es mayor que A="+a+", B="+b+", C="+c+"\n\n";
                }
            }else if(a>c){
                if(a==d){
                    paragrafg.innerHTML+="Los numeros A="+a+", D="+d+" son mayores que B="+b+", C="+c+"\n\n";
                }else if(a>d){
                    paragrafg.innerHTML+="El numero A="+a+", es mayor que B="+b+", C="+c+", D="+d+"\n\n";
                }else{
                    paragrafg.innerHTML+="El numero D="+d+", es mayor que  A="+a+", B="+b+", C="+c+"\n\n";
                }
            }else{
                if(c==d){
                    paragrafg.innerHTML+="Los numeros C="+c+", D="+d+" son mayores que A="+a+", B="+b+".\n\n"; 
                }else if(c>d){
                    paragrafg.innerHTML+="El numero C="+c+" es mayor que A="+a+", B="+b+", D="+d+".\n\n"; 
                }else{
                    paragrafg.innerHTML+="El numero D="+d+" es mayor que A="+a+", B="+b+", C="+c+".\n\n"; 
                }
            }
        }else{
            if(b==c){
                if(c==d){
                    paragrafg.innerHTML+="Los numeros B="+b+", C="+c+", D="+d+" son mayores que A="+a+".\n\n"; 
                }else if(c>d){
                    paragrafg.innerHTML+="Los numeros B="+b+", C="+c+" son mayores que A="+a+", D="+d+".\n\n"; 
                }else{
                    paragrafg.innerHTML+="El numero D="+d+" es mayor que A="+a+", B="+b+", C="+c+".\n\n"; 
                }
            }else if(b>c){
                if(b==d){
                    paragrafg.innerHTML+="Los numeros B="+b+", D="+d+" son mayores que A="+a+", C="+c+".\n\n"; 
                }else if(b>d){
                    paragrafg.innerHTML+="El numero B="+b+" es mayor que A="+a+", C="+c+" D="+d+".\n\n"; 
                }else{
                    paragrafg.innerHTML+="El numero D="+d+" es mayor que A="+a+", B="+b+" C="+c+".\n\n"; 
                }            
            }else{
                if(c==d){
                    paragrafg.innerHTML+="Los numeros C="+c+", D="+d+" son mayores que A="+a+", B="+b+".\n\n"; 
                }else if(c>d){
                    paragrafg.innerHTML+="El numero C="+c+" es mayor que A="+a+", B="+b+" D="+d+".\n\n"; 
                }else{
                    paragrafg.innerHTML+="El numero D="+d+" es mayor que A="+a+", B="+b+" C="+c+".\n\n"; 
                }
            }
        }          
        
        document.getElementById("idSectionBody").appendChild(paragrafg);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
            document.getElementById("idNum1").value="";
            document.getElementById("idNum2").value="";
            document.getElementById("idNum3").value="";
            document.getElementById("idNum4").value="";

            document.getElementById("idParagrafg").remove();
            a=0;
            b=0;
            c=0;
            d=0;
            
            document.getElementById("idBtnCalculate").value="Calcular";
    }
    

}