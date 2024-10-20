/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 28.-Escribir la suma de los primeros diez numeros pares.
*/
using System;

class SumPairs{    
    public static void Main(string[] arg){
        int sum=0;
 
        System.Console.Write("\n2");
        sum=2;
        for(int i=2; i<=10; i++){
            sum+=i*2;
            System.Console.Write(" + "+(i*2));
        }
 
        System.Console.Write(" = "+sum+"\n\n");
 
    }
} 