function calculate(){
    
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                 
        
        let tableBody=document.createElement("tbody");
        tableBody.setAttribute("id", "idTableBody");     

        var PRUEBA=false;
        var number=5;

        if((1 > 0) && (3 == 3)){
            tableBody.innerHTML+="<tr><td> (1 > 0) && (3 == 3) </td><td> Verdadero </td><td> </td></tr>";
        }else{
            tableBody.innerHTML+="<tr><td> (1 > 0) && (3 == 3) </td><td> Falso </td><td> </td></tr>";
        }

        if((!PRUEBA)){
            tableBody.innerHTML+="<tr><td> no PRUEBA </td><td> Verdadero </td><td>es un valor logico falso </td></tr>";
            
        }else{
            tableBody.innerHTML+="<tr><td> no PRUEBA </td><td> Falso </td><td>es un valor logico falso </td></tr>";
        }
        
        if((0 < 5) || (0 > 5)){
            tableBody.innerHTML+="<tr><td> (0 < 5) o (0 > 5) </td><td> Verdadero </td><td> </td></tr>";
        }else{
            tableBody.innerHTML+="<tr><td> (0 < 5) o (0 > 5) </td><td> Falso </td><td> </td></tr>";
        }

        if((5 <= 7) && (2 > 4)){
            tableBody.innerHTML+="<tr><td>  (5 <= 7) && (2 > 4) </td><td> Verdadero </td><td> </td></tr>";
        }else{
            tableBody.innerHTML+="<tr><td>  (5 <= 7) && (2 > 4) </td><td> Falso </td><td> </td></tr>";
        }

        if(!(5!=5)){
            tableBody.innerHTML+="<tr><td>  !(5<>5) </td><td> Verdadero </td><td> </td></tr>";
        }else{
            tableBody.innerHTML+="<tr><td>  !(5<>5) </td><td> Falso </td><td> </td></tr>";
        }

        if((number==5) || (7>=4)){
            tableBody.innerHTML+="<tr><td>  (numero==5) || (7>=4) </td><td> Verdadero </td><td> Numero es una variable entera de valor 5 </td></tr>";
        }else{
            tableBody.innerHTML+="<tr><td>  (numero==5) || (7>=4) </td><td> Falso </td><td> Numero es una variable entera de valor 5 </td></tr>";
        }
    
        document.getElementById("idTable").appendChild(tableBody);
    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idTableBody").remove();
        
        document.getElementById("idBtnCalculate").value="Calcular";
    }
    
        
        
}