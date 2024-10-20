/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 29.-Escribir un algoritmo que lea los datos de entrada de un archivo que solo contien numeros y sume los numeros positivos.
*/

using System;

class SumPositives{    
    public static void Main(string[] args){
        int sum=0, num=0;
        System.Console.Write("Programa que calcula la suma de los numeros positivos, presione -99 para salir:\n");
        do{
            System.Console.Write("\nIngrese un numero: ");
            num=int.Parse(System.Console.ReadLine());

            if(num>0){
                sum+=num;
            }

        }while(num!=-99);

        System.Console.Write("\nLa suma de todos o numeros positivos es: "+sum+"\n\n");
    }   
}