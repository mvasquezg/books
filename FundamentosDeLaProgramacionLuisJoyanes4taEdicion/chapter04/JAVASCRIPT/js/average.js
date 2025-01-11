/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 03.-Calcula la media aritmetica de un seria de numeros positivos. La media arimetica  de n numeros es:
			x1+x2+x3+ ...+xn
				n
                En el problema se supondra un entrada de datos por el teclado hasta que se introduzca el ultimo numero, en nuestro caso -99. para calcular la media aritmetica se necesita saber cuantos numeros se han introducido hasta llegar a -99.		
    ejemplo 4.4, pagina 133
*/
function calculate(){
    let num=0, sum=0, countPositves=0, average=0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");           
    if(document.getElementById("idBtnCalculate").value=="Calcular"){                     
        
        varSpan.innerHTML+="<br>Numeros Positivos de la serie: <br>";
        do{
            num=parseInt(prompt("Ingrese un numero: "));
            if(num>0){
                sum+=num;
                countPositves++;
                varSpan.innerHTML+=num+" ";
            }
        }while(num!=-99);
        average=sum/countPositves;

        varSpan.innerHTML+="<br><br>La suma de la serie de los numeros positivos es igual a: "+sum+
                            "<br>Cantidad de numeros positivos: "+countPositves+"<br>"+
                            "<br>El promedio es igual a: "+average+"<br><br>";
        document.getElementById("idMessage").appendChild(varSpan);    
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idSpan").remove();

        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
