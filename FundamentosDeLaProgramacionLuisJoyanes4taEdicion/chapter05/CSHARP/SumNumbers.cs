/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 01.-Leer por teclado un número que represente una cantidad de números que a su vez se leerán también por teclado.
                 Calcular la suma de todos esos números.
    Pagina 156
*/
using System;
class SumNumbers{    
    public static void Main(string[] args){
        int totalNumbers=0;
        float num=0, sum=0;
    
        System.Console.Write("Programa que lee por teclado un número que representa una cantidad de números que a su vez se leerán también por teclado.\n Calcular la suma de todos esos números.");
        System.Console.Write("\nIngrese la cantidad de numeros a sumar:  ");
        totalNumbers=int.Parse(System.Console.ReadLine());
    
        System.Console.Write("\n");
        while(totalNumbers>0){
            System.Console.Write("Ingresa un numero: ");
            num=float.Parse(System.Console.ReadLine());
            sum+=num;
            totalNumbers--;
        }
        System.Console.Write("\nEl total de la suma: "+sum+"\n");
    }
}