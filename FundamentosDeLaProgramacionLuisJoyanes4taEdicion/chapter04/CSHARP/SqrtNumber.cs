/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 26.-Calcular la raíz cuadrada de un número y escribir su resultado. Considerando el caso en que el número sea negativo.

    Ejercicios:
    4.4  página 155 
*/
using System;

class SqrtNumber{
        
    public static void Main(string[] args){
        float num=0;
        System.Console.Write("programa que calcula la raíz cuadrada de un número y escribir su resultado. Considerando el caso en que el número sea negativo.");
        System.Console.Write("\n\nIngresa un numero: ");
        num=int.Parse(System.Console.ReadLine());
        System.Console.Write("\n");
        if(num<=0){
            System.Console.Write("El numero ingresado no tiene raiz cuadrada.");
        }else{
            System.Console.Write("La raiz cuadrada de "+num+" es igual a: "+Math.Sqrt(num));
        }
        System.Console.Write("\n\n");
    }
}