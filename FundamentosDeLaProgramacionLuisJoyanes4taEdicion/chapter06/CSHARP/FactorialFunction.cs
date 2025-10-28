/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 04.-Diseñar un algoritmo que contenga un subprograma de cálculo del factorial de un número y una llamada al
                mismo.
    
    Ejemplo4
    Pagina 207
*/
using System;

class FactorialFunction{
    static int showFactorial(int x){
        if(x<=1){
            return 1;
        }else{
            return x*showFactorial(x-1);
        }

    }

    public static void Main(string[] args){
        int x=0;
        System.Console.Write("Programa que calcula un factorial:\nIngrese un numero: ");
        x=int.Parse(System.Console.ReadLine());

        System.Console.Write("\nResultado del factorial:\n"+x+"! = "+showFactorial(x)+"\n\n");
    }
}