/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 21.Diseñar un algoritmo que lea y visualice una serie de números distintos de cero. 
    El algoritmo debe terminar con un valor cero que no se debe visualizar. 
    Visualizar el número de valores leídos.
*/
using System;
class CountNumbers{

    public static void Main(string[] args){
        int number=0;
        int countNumbers=0;

        do{
            System.Console.Write("Ingresa un numero: ");
            number=int.Parse(System.Console.ReadLine());

            if(number!=0){
                countNumbers++;
            }
        }while(number!=0);

        System.Console.Write("El total de numero capturados es: "+countNumbers+"\n\n");
    }
}