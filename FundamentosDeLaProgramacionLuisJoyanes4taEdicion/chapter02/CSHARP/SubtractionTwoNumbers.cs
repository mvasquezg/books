/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 17. Restar dos numeros enteros.
*/
using System;
class SubtractionTwoNumbers{
    public static void Main(string[] args){
        int number1=0;   
        int number2=0;
        int subtraction=0;

        System.Console.Write("\nIngresa el primer numero: ");
        number1=int.Parse(System.Console.ReadLine());
        
        System.Console.Write("Ingresa el segundo numero: ");
        number2=int.Parse(System.Console.ReadLine());
        
        subtraction=number1-number2;
        System.Console.Write("\nLa diferencia es igual a: "+subtraction+"\n");
            
    }
}