/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 09.Calcular el promedio de una serie de números positivos. 
    Un valor de cero indicará que se ha alcanzado el final de la serie de números positivos
*/
using System;

class AveragePositiveNumber{

    public static void Main(string[] args){
        int number=0;
        int average=0;
        int count=0;
        int sum=0;
          
        do{
            System.Console.Write("Ingresa un numero: ");
            number=int.Parse(System.Console.ReadLine());
            
            if(number>0){
                sum+=number;
                count++;
            }

        }while(number>0 || number<0);
    
        average=sum/count;

        System.Console.Write("\n\nSuma: "+sum+"\nNumeros positvos ingresados: "+count+"\nPromedio: "+average+"\n\n");
    }
}