function calculate(){
   
    if(document.getElementById("idBtnCalculate").value=="Ejecutar"){                 
        
        let tableBody1=document.createElement("tbody");
        let tableBody2=document.createElement("tbody");
        let tableBody3=document.createElement("tbody");
        
        tableBody1.setAttribute("id", "idTableBody1");
        tableBody2.setAttribute("id", "idTableBody2");     
        tableBody3.setAttribute("id", "idTableBody3");     

        tableBody1.innerHTML+="<tr><td>Verdadero</td><td>Falso</td><td>no (6>10) es verdadera</td></tr>";
        tableBody1.innerHTML+="<tr><td>Falso</td><td>Verdadero</td><td>Ya que (6>10) es falsa</td></tr>";

        tableBody2.innerHTML+="<tr><td>Verdadero</td><td>Verdadero</td><td>Verdadero</td></tr>";
        tableBody2.innerHTML+="<tr><td>Verdadero</td><td>Falso</td><td>Falso</td><td rowspan='2'>A y B son verdadero solo si a y b son verdaderos</td></tr>";
        tableBody2.innerHTML+="<tr><td>Falso</td><td>Verdadero</td><td>Falso</td></tr>";
        tableBody2.innerHTML+="<tr><td>Falso</td><td>Falso</td><td>Falso</td></tr>";

        tableBody3.innerHTML+="<tr><td>Verdadero</td><td>Verdadero</td><td>Verdadero</td></tr>";
        tableBody3.innerHTML+="<tr><td>Verdadero</td><td>Falso</td><td>Verdadero</td><td rowspan='2'>A o B es verdadero cuando a, b o ambas son verdaderas</td></tr>";
        tableBody3.innerHTML+="<tr><td>Falso</td><td>Verdadero</td><td>Verdadero</td></tr>";
        tableBody3.innerHTML+="<tr><td>Falso</td><td>Falso</td><td>Falso</td></tr>";
        
        document.getElementById("idTable1").appendChild(tableBody1);
        document.getElementById("idTable2").appendChild(tableBody2);
        document.getElementById("idTable3").appendChild(tableBody3);
        
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idTableBody1").remove();
        document.getElementById("idTableBody2").remove();
        document.getElementById("idTableBody3").remove();      
        document.getElementById("idBtnCalculate").value="Ejecutar";
    }
}