/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 22.-Sumar 10 numeros introducidos por el teclado,
*/
using System;

class SumTenNumbers{
    public static void Main(string[] args){

        int sum=0, number=0;

        for(int i=1; i<=10; i++){
            System.Console.Write(i+".-Ingres un numero: ");
            number=int.Parse(System.Console.ReadLine());
            sum+=number;
        }
        System.Console.Write("\nSuma Total: "+sum+"\n");
    }
}
