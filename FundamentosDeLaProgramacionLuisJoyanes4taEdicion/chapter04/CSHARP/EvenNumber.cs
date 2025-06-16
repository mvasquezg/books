/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 27.-Escribir los diferentes métodos para deducir si una variable o expresión numérica es par.

    Ejercicios:
    4.5  página 155 
*/
using System;

class EvenNumber{    
    public static void Main(string[] args){
        int num=0;

        System.Console.Write("Escribir los diferentes métodos para deducir si una variable o expresión numérica es par.");
        System.Console.Write("\n\nIngresa un numero: ");
        num=int.Parse(System.Console.ReadLine());

        if(num%2==0){
            System.Console.Write("El numero: "+num+" es par");
        }else{
            System.Console.Write("El numero: "+num+" es impar");
        }
        System.Console.Write("\n\n");
    }
}