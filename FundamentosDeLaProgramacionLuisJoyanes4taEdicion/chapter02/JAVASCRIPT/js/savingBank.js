/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 30.Muchos bancos y cajas de ahorro calculan los intereses de las cantidades depositadas 
    por los clientes diariamente según las premisas siguientes. 
    
    Un capital de 1.000 euros, con una tasa de interés del 6 por 100, renta un interés en un día de 0,06 
    multiplicado por 1.000 y dividido por 365. Esta operación producirá 0,16 euros de interés y el capital 
    acumulado será 1.000,16. El interés para el segundo día se calculará multiplicando 0,06 por 1.000 y 
    dividiendo el resultado por 365. 

    Diseñar un algoritmo que reciba tres entradas: el capital a depositar, la tasa de interés y 
    la duración del depósito en semanas, y calcular el capital total acumulado al final del período de tiempo 
    especificado.
*/
    function calculate(){
        let capital=0;              //Dinero a invertir
        let interest=0;             //intres ganado
        let numberOfWeeks=0;        //Numero de Semanas
        let totalDays=0;            //Dias totales
        let interestPercentage=0; //Porcentaje del interes 
        let sumDayInterest=0;     //Suma de los interes diarios
        let acumTotal=0;          //capital + interes
        
        let paragrafg=document.createElement('p');
        paragrafg.setAttribute("id", "idParagrafg");

        
        if(document.getElementById("idBtnCalculate").value=="Calcular"){
            capital=document.getElementById("idCapital").value;
            
            interest=document.getElementById("idInterest").value;

            numberOfWeeks=document.getElementById("idNumberOfWeeks").value;
            
            interestPercentage=interest/100;
            totalDays=numberOfWeeks*7;

            for(let i=1; i<=totalDays; i++){
                sumDayInterest+=(capital*interestPercentage)/365;
            }
            acumTotal=capital+sumDayInterest;

            paragrafg.innerHTML+="<p></p>El interes ganado en "+sumDayInterest+"<p></p>Numero de Semanas de inversion: "+numberOfWeeks+"<p></p>Acumulado total: $ "+acumTotal;
              
            document.getElementById("idSection").appendChild(paragrafg);
            document.getElementById("idBtnCalculate").value="Limpiar"
        }else{
            document.getElementById("idCapital").value="";
            document.getElementById("idInterest").value="";
            document.getElementById("idNumberOfWeeks").value="";

            document.getElementById("idParagrafg").remove();
            document.getElementById("idBtnCalculate").value="Calcular";
        }
    }