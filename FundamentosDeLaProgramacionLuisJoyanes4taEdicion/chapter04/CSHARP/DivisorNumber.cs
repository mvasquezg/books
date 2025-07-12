/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 30.-Realizar un programa que averigüe si dados dos números introducidos por teclado uno es divisor del otro.
    Pagina 155
*/
using System;
class DivisorNumber{   
    public static void Main(string[] args){
        int num1=0, num2=0;

        System.Console.Write("Programa que averigüe si dados dos números introducidos por teclado uno es divisor del otro.\n");
        System.Console.Write("\nIngresa el primer numero: ");
        num1=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingresa el segundo numero: ");
        num2=int.Parse(System.Console.ReadLine());

        System.Console.Write("\n");
        if(num1%num2==0){
            System.Console.Write(num2+" es divisor de "+num1);
        }else if(num2%num1==0){
            System.Console.Write(num1+" es divisor de "+num2);
        }else{
            System.Console.Write("Los numeros "+num1+", "+num2+" no son divisibles uno del otro.");
        }
        System.Console.Write("\n\n");
    }
}    