/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 20.-Calcular la suma de los cuadrados de los cien primeros numeros naturales.
*/
using System;

class SqrSum{

    public static void Main(string[] arg){
        double sum=0;
        for(int i=1; i<=100; i++){
          System.Console.Write(i+" * "+i+" = "+Math.Pow(i, 2)+"\n");
            sum+=Math.Pow(i, 2);
        }
        System.Console.Write("Suma Total: "+sum+"\n");
    }
}