/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 21.-Sumar los numeros pares del 2 al 100 e imprimir su valor.
*/
using System;

class SumOfPairs{
     
    public static void Main(string[] args){

        int sum=0;
        System.Console.Write(2);
        sum=2;
        for(int i=4; i<=100; i+=2){
            System.Console.Write(", "+i);
            sum+=i;
        }
        System.Console.Write("\nSuma Total: "+sum+"\n");
    }

}   