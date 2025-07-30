/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 06.-Desarrollar el algoritmo necesario para calcular el factorial de un número N que responda a la fórmula:
                N! = N * (N – 1) * (N – 2), ..., 3 * 2 * 1
    Pagina 169
*/
using System;
class Factorial{    
    public static void Main(string[] args){
        int factorial=1, num=0;
    
        System.Console.Write("Programa que calcula el factorial de un numero.\nIngresa un numero: ");
        num=int.Parse(System.Console.ReadLine());
    
        System.Console.Write("\nEl factorial de "+num+" es igual a: ");
        for(int i=num; i>0; i--){
            factorial*=i;
        }
    
        System.Console.Write(factorial+"\n\n");
    }
}    