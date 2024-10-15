//Constante
const MAXVALUE=10;

function calculate(){
    let sum=0, average=0;
    let varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");
            
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        for(var i=1; i<=MAXVALUE; i++){
            num=parseInt(prompt(i+".-Ingrese un numero: "));
            varSpan.innerHTML+=i+".-"+num+"<br></br>";
            sum+=num;
        }
        average=sum/MAXVALUE;

        varSpan.innerHTML+="<br>Suma Total: "+sum+"<br>Promedio: "+average+"<br></br>";
        document.getElementById("idShowData").appendChild(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
        
