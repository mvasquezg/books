
function calculate(){
   
    if(document.getElementById("idBtnCalculate").value=="Ejecutar"){                 
        
        let tableBody=document.createElement("tbody");
        tableBody.setAttribute("id", "idTableBody");     

        tableBody.innerHTML+="<tr><td>no (not), !</td><td>no p (not p)</td><td>Negacion de p</td></tr>";
        tableBody.innerHTML+="<tr><td>y (and), &&</td><td>p y q</td><td>Conjuncion de p y q</td></tr>";
        tableBody.innerHTML+="<tr><td>o (or), ||</td><td>p o q</td><td>Disyuncion de p y q</td></tr>";
        
        document.getElementById("idTable").appendChild(tableBody);
        
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idTableBody").remove();      
        document.getElementById("idBtnCalculate").value="Ejecutar";
    }
}