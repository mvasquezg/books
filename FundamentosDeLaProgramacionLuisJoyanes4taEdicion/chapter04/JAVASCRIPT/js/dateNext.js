/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 28.-Diseñar un programa en el que a partir de una fecha introducida por teclado con el formato DIA, MES,
    AÑO se obtenga la fecha del día siguiente.

    Ejercicios:
    4.6  página 155 
*/
        
function calculate(){
    var year=0, month=0, day=0;

    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
             
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        var dateNow=new Date(document.getElementById("idDate").value);
        
        year=dateNow.getFullYear();
        console.log("Año: "+year);

        month=dateNow.getMonth()+1; //el mes empeiza en cero, por eso se suma +1
        console.log("mes: "+month);
        day=dateNow.getDate()+1; // el mes empieza en 0, por eso se suma 1
        console.log("dia: "+day);
                 
        if( ( month==2 && day==29)  && ((year%4==0) || (year%100==4 && year%400==0))  ){
                month++;
                day=1;
        }else if(month==2 && day==28 && !((year%4==0) || (year%100==4 && year%400==0))){
                month++;
                day=1;
        }else if(month==2){
            day++;
        }else if((month==1 || month==3 || month == 5 || month==7 || month == 8 || month==10)){

                if(day!=31){
                    day++;
                }else{
                    month++;
                    day=1;
                }            
        }else if(month==12){
                if(day!=31){
                    day++;
                }else{
                    month=1;
                    day=1;
                    year++;
                }
        }else if((month==4 || month==6 || month == 9 || month==11)){
            if(day!=30){
                day++;
            }else{
                month++;
                day=1;
            }    
        }

        const monthN=String(month).padStart(2, '0');
        const dayN=String(day).padStart(2, '0');
        const yearN=year;
        var fechaNueva=`${yearN}-${monthN}-${dayN}`;
        document.getElementById("idNextDate").value=fechaNueva;

        document.getElementById("idSection").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idDate").value="";
        document.getElementById("idNextDate").value="";
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}