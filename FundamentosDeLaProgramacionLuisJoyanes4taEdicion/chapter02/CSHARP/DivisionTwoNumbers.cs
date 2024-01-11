/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 19. Dividir dos numeros enteros.
*/
using System;
class DivisionTwoNumbers{
    public static void Main(string[] args){
        int number1=0;   
        int number2=0;
        int division=0;

        System.Console.Write("\nIngresa el primer numero: ");
        number1=int.Parse(System.Console.ReadLine());
        
        System.Console.Write("Ingresa el segundo numero: ");
        number2=int.Parse(System.Console.ReadLine());
        
        if(number1!=0 && number2!=0){
            division=number1/number2;
            System.Console.Write("\nLa Division es igual a: "+division+"\n");    
        }else{
            System.Console.Write("\nNo se pueden dividir ceros\n");    
        }

        
    }
}