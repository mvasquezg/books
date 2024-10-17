/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 24.-Calcular los N primeros multiplos de 4(inclusive), donde N es un valor introducido por el teclado.
*/
using System;

class MultiplesOfFour{
    public static void Main(String[] args){
        int number=0;

        System.Console.Write("Ingresa un numero, mayor i gual a 4: ");
        number=int.Parse(System.Console.ReadLine());

        System.Console.WriteLine("\nLos multiplos de "+number+" son: \n");
        for(int i=4; i<=number; i++){
            if(i%4==0){
                System.Console.Write(i+" ");
            }
        }
        System.Console.WriteLine("\n\n");
    }
}