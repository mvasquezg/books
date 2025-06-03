/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 24.-Escribir un programa que solicite al usuario introducir dos números. Si el primer número introducido es mayor que el segundo número, 
    el programa debe imprimir el mensaje El primer número es el mayor, en caso contrario el programa debe imprimir el mensaje El primer número es el más 
    pequeño. Considerar el caso de que ambos números sean iguales e imprimir el correspondiente mensaje.
    
    Pagina 155
*/
using System;
class CompareTwoNumbers{    
    public static void Main(string[] args){
        int num1=0, num2=0;

        System.Console.Write("Programa que solicita al usuario introducir dos números. Si el primer número introducido es mayor que el segundo número,"); 
        System.Console.Write(" el programa debe imprimir el mensaje\nEl primer número es el mayor, en caso contrario el programa debe imprimir el mensaje ");
        System.Console.Write("El primer número es el más pequeño. Considerar el caso de que ambos números sean iguales\ne imprimir el correspondiente mensaje.\n\n");

        System.Console.Write("Ingresa el primer numero: ");
        num1=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el segundo numero: ");
        num2=int.Parse(System.Console.ReadLine());;

        System.Console.Write("\n");
        if(num1==num2){
            System.Console.Write("El numero 1 y el numero 2 son iguales.");
        }else if(num1>num2){
            System.Console.Write("El primer numero es el mayor");
        }else{
            System.Console.Write("El primer numero es el mas pequeño");
        }
        System.Console.Write("\n\n");
    }
}