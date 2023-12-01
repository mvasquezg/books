/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
  Capitulo 02.-Metodología de la programación y desarrollo de software.
  Problema 01.Se desea obtener una tabla con las depreciaciones acumuladas y los valores reales de cada año, de un automóvil
  comprado por 20.000 euros en el año 2005, durante los seis años siguientes suponiendo un valor de recuperación o
  rescate de 2.000. Realizar el análisis del problema, conociendo la fórmula de la depreciación anual constante D
  para cada año de vida útil.

  D = coste – valor de recuperación/vida útil

  D = (20,000 – 2,000)/6 = 18,000/6 = 3,000  
*/

    /**variables que almacenan los valores de los inputs */
    var idCostVehicle=0;        //Costo del vehiculo
    var idSalvageValue=0;       //Costo de recuperación
    var idUsefulLife=0;         //Vida util;
    var yearOfPurcharse=0;      //anho de compra
   
    /**Variables calculadas con los datos ingresados*/
    var depretiation=0;         //Depreciacion 
    var acumDepretiation=0;     //Depreciacion Acumulada
    
    /*Creando fila y la cabecera de la tabla*/
    var row1=document.createElement("tr");
    var heading1=document.createElement("th");
    var heading2=document.createElement("th");
    var heading3=document.createElement("th");
    var heading4=document.createElement("th");
    
    function calculate(){

        if(document.getElementById("idBtnCalculate").value=="Calcular"){
            /*Creo la tabla*/
            let tableDepretiation=document.createElement("table");

            /*Creo la cabecera de la tabla*/
            let tHead=document.createElement("thead");
            tHead.setAttribute("id", "idTHeadDepretiation");

            /**Creo el cuerpo de la tabla*/
            let tBody=document.createElement("tbody");
            tBody.setAttribute("id", "idTBodyDepretiation");
            
            /**Agrego la cabecera y el cuerpo a la tabla */
            tableDepretiation.appendChild(tHead);
            tableDepretiation.appendChild(tBody);
            tableDepretiation.setAttribute("id", "idTableDepretiation");
                        
            /*Obteniendo los valores de los inputs*/
            idYearOfPurcharse=parseInt(document.getElementById("idYearOfPurcharse").value);
            idCostVehicle=document.getElementById("idCostVehicle").value;
            idSalvageValue=document.getElementById("idSalvageValue").value;
            idUsefulLife=document.getElementById("idUsefulLife").value;
            
            /*relizando el calculo de la depreciacion*/
            depretiation=(idCostVehicle-idSalvageValue)/idUsefulLife;
            acumDepretiation = depretiation;

            /*Crendo los encabezados de la tabla*/
            heading1.innerHTML="Año";
            heading2.innerHTML="Depreciacion";
            heading3.innerHTML="Depreciacion Acumulada";
            heading4.innerHTML="Valor Anual";

            row1.appendChild(heading1);
            row1.appendChild(heading2);
            row1.appendChild(heading3);
            row1.appendChild(heading4);

            tHead.appendChild(row1);

            //pintando la tabla en el html
            document.getElementById("idSectionBody").appendChild(tableDepretiation);
        
            for(let i=1; i<=idUsefulLife; i++){
                let row=document.createElement("tr");
                let td1=document.createElement("td");
                let td2=document.createElement("td");
                let td3=document.createElement("td");
                let td4=document.createElement("td");

                td1.innerHTML=(idYearOfPurcharse+i);
                td2.innerHTML=depretiation;
                td3.innerHTML=(acumDepretiation);
                td4.innerHTML=(idCostVehicle-acumDepretiation);
            
                row.appendChild(td1);
                row.appendChild(td2);
                row.appendChild(td3);
                row.appendChild(td4);
            
                tBody.appendChild(row);
                acumDepretiation+=depretiation;  
            }
            document.getElementById("idBtnCalculate").value="Limpiar";
        }else{
            /*Limpiando los inputs*/
            document.getElementById("idYearOfPurcharse").value="";
            document.getElementById("idCostVehicle").value="";
            document.getElementById("idSalvageValue").value="";
            document.getElementById("idUsefulLife").value="";

            /*Limpiando Eliminando las filas de las tablas*/
            document.getElementById("idTHeadDepretiation").remove(0);
            document.getElementById("idTBodyDepretiation").remove(0);
            
            /*Asignando el nuevo valor al boton*/
            document.getElementById("idBtnCalculate").value="Calcular";
        }
    }