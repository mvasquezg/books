
function calculate(){
   
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                 
        let a=3, b=6;
        let tableBody=document.createElement("tbody");
        tableBody.setAttribute("id", "idTableBody");     

        if(a<b){
            tableBody.innerHTML="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" <  "+b+"</td><td>Verdadero</td></tr>";
        }else{
            tableBody.innerHTML="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" <  "+b+"</td><td>Falso</td></tr>";
        }
        a=0, b=1;
        if(a>b){
          tableBody.innerHTML+="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" >  "+b+"</td><td>Verdadero</td></tr>";
        }else{
            tableBody.innerHTML+="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" >  "+b+"</td><td>Falso</td></tr>";
        }
        a=4, b=2;
        if(a==b){
            tableBody.innerHTML+="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" ==  "+b+"</td><td>Verdadero</td></tr>";
        }else{
            tableBody.innerHTML+="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" ==  "+b+"</td><td>Falso</td></tr>";
        }
        a=8, b=5;
        if(a<=b){
            tableBody.innerHTML+="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" <=  "+b+"</td><td>Verdadero</td></tr>";
        }else{
            tableBody.innerHTML+="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" <=  "+b+"</td><td>Falso</td></tr>";
        }
        a=9, b=9;
        if(a>=b){
            tableBody.innerHTML+="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" >=  "+b+"</td><td>Verdadero</td></tr>";
        }else{
            tableBody.innerHTML+="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" >=  "+b+"</td><td>Falso</td></tr>";
        }
        a=5, b=5;
        if(a!=b){
            tableBody.innerHTML+="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" !=  "+b+"</td><td>Verdadero</td></tr>";
        }else{
            tableBody.innerHTML+="<tr><td>"+a+"</td><td>"+b+"</td><td>"+a+" !=  "+b+"</td><td>Falso</td></tr>";
        }
        document.getElementById("idTable").appendChild(tableBody);
        //Termina condcionales
    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idTableBody").remove();

        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}