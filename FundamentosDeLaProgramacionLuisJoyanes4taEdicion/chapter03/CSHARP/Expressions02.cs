/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 03.-Obtener los resultados de las expresiones:
                –4 * 7 + 2 ^ 3 / 4 – 5
*/  
using System;
class Expressions02{
    
    public static void Main(string[] args){
        System.Console.Write("–4 * 7 + 2 ^ 3 / 4 – 5 = "+(-4*7+Math.Pow(2, 3)/4-5)+"\n\n");
    }

}