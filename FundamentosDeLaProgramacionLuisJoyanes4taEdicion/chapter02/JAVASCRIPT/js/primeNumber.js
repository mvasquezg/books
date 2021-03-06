/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 05.Se desea diseñar un algoritmo para saber si un número es primo o no.
    Un número es primo si sólo puede dividirse por sí mismo y por la unidad (es decir, no tiene más divisores 
    que él mismo y la unidad).
    Por ejemplo, 9, 8, 6, 4, 12, 16, 20, etc., no son primos, ya que son divisibles por números distintos a ellos mismos y a la unidad. Así, 9 es divisible por 3, 8 lo es por 2, etc.
*/

function calculate(){
    let idNumber=document.getElementById("idNumber").value;
    let count=0; //cuenta las veces que el numero ha sido divido en las iteraciones

    let paragraf=document.createElement("p");
    paragraf.setAttribute("id", "idParagraf")

    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        for(let i=1; i<=idNumber; i++){

            if(idNumber%i==0){
                count++;
            }
        }

        if(idNumber==1 || count==2){
            paragraf.innerHTML="Numero primo";
        }else{
            paragraf.innerHTML="Numero no primo";
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