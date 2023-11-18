/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 03.Calcular el valor de la suma 1+2+3+...+100..
*/

using System;
class SumUpToOneHundred{
    public static void Main(string[] args){
        int sum=0;

        for(int i=1; i<=100; i++){
            sum+=i;
        }
        System.Console.Write("La suma del 1 al 100 es igual a: "+sum+"\n");
    }
}    