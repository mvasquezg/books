/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 26.Diseñar un algoritmo para determinar los números primos iguales o menores que N (leído del teclado).
    (Un número primo sólo puede ser divisible por él mismo y por la unidad.)
*/

function calculate(){
    let idNumber=document.getElementById("idNumber").value;
    let count=0; //cuenta las veces que el numero ha sido divido en las iteraciones

    let paragraf=document.createElement("p");
    paragraf.setAttribute("id", "idParagraf")

    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        
        for(let i=1; i<=idNumber; i++){

            for(let j=1; j<=i; j++){    
                if(i%j==0){
                    count++;
                }
            } 
            
            if(count==1){
                paragraf.innerHTML=+i; 
            }else if(count==2){
                paragraf.innerHTML+=", "+i;  
            }
            count=0;    
        }


        document.getElementById("idSection").appendChild(paragraf);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        document.getElementById("idParagraf").remove();
        document.getElementById("idNumber").value="";
        document.getElementById("idBtnCalculate").value="Calcular";
    }

}

/**int number=0; //numero ingresado
        int count=0; //cuenta las veces que el numero ha sido divido en las iteraciones

        System.Console.Write("Ingrese un numero: ");
        number=int.Parse(System.Console.ReadLine());

        for(int i=1; i<=number; i++){

            if(number%i==0){
                count++;
            }
        }

        if(number==1 || count==2){
            System.Console.Write("\n"+number+": Es primo\n");
        }else{
            System.Console.Write("\n"+number+": No es primo\n");
        }
    } */