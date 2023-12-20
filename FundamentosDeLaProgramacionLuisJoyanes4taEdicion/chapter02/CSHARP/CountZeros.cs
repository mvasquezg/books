/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 12.Supongamos que se proporciona una secuencia de números, tales como
        5 3 0 2 4 4 0 0 2 3 6 0 2
    y desea contar e imprimir el número de ceros de la secuencia.
*/
using System;
class CountZeros{

    public static void Main(string[] args){
        int number=0;
        int countZeros=0;

        do{
            System.Console.Write("Ingresa un numero: ");
            number=int.Parse(System.Console.ReadLine());

            if(number==0){
                countZeros++;
            }
        }while(number>=0);

        System.Console.Write("El total de ceros capturados es: "+countZeros+"\n\n");
    }
}