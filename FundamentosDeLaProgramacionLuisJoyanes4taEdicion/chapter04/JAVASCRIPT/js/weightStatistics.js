/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 29.-Se desea realizar una estadística de los pesos de los alumnos de un colegio de acuerdo a la siguiente tabla:
                    
                    Alumnos de menos de 40 kg.
                    Alumnos entre 40 y 50 kg.
                    Alumnos de más de 50 kg y menos de 60 kg.
                    Alumnos de más o igual a 60 kg.
    Pagina 155
*/
function calculate(){
    let weigth=0, weigth1=0, weigth2=0, weigth3=0, weigth4=0,  answer;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        do{
            weigth=parseInt(prompt("Ingresa el peso del alumno: "));
            
            if(weigth<40){
                weigth1++;
            }else if(weigth>=40 && weigth<=50){
                weigth2++;
            }else if(weigth>50 && weigth<60){
                weigth3++;
            }else if(weigth>=60){
                weigth4++;
            }

            answer=prompt("Presione N para salir, presiones S para continuar\nDesea agregar el peso de otro estudiante?: ");

        }while(answer!='N' && answer!='n');
       

        varSpan.innerHTML+="<br><br>Estadisticas de peso: "+
                            "<br>Alumnos con peso menos de 40 kG: "+weigth1+"<br>"+
                            "<br>Alumnos con peso de 40 kG-50KG: "+weigth2+"<br>"+
                            "<br>Alumnos con peso mayor de 50 kG y menos de 60 KG: "+weigth3+"<br>"+
                            "<br>Alumnos con peso igual o mayor a 60: "+weigth4+"<br>";
        document.getElementById("idMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
