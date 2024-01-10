/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 16. Sumar dos numeros enteros.
*/
using System;
class SumTwoNumbers{
    public static void Main(string[] args){
        int number1=0;   
        int number2=0;
        int sum=0;

        System.Console.Write("\nIngresa el primer numero: ");
        number1=int.Parse(System.Console.ReadLine());
        
        System.Console.Write("Ingresa el segundo numero: ");
        number2=int.Parse(System.Console.ReadLine());
        
        sum=number1+number2;
 
        System.Console.Write("\nLa suma es igual a: "+sum+"\n");           
    }
}