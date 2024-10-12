/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
  Capitulo 03.-Estructura general de un programa.
  Problema 18.-Leer 500 numeros enteros y obtener cuantos son positivos.
*/

using System;
    
class CountingPositiveNumbers{    
    public static void Main(string[] args){
        int countPositive=0, num=0, maxValue=15;

        System.Console.Write("Leer 500 numeros enteros y obtener cuantos son positivos.\n\n");

        for(int i=1; i<=maxValue; i++){
            System.Console.Write(i+".-Ingresa un numero: ");
            num=int.Parse(System.Console.ReadLine());

            if(num>0){
                countPositive++;
            }
        }
        System.Console.Write("\nDe "+maxValue+" valores, hay "+countPositive+" numeros positivos\n\n");
    }
}   