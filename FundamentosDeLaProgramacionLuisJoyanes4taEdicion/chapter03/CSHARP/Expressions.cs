/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 02.-¿Cuál es el resultado de las siguientes expresiones?
                    a) 3 + 6 * 14
                    b) 8 + 7 * 3 + 4 * 6
*/  
using System;
class Expressions{

    public static void Main(string[] args){
        System.Console.Write("3 + 6 * 14 = "+ (3 + 6 * 14));
        System.Console.Write("\n8 + 7 * 3 + 4 * 6 = "+(8 + 7 * 3 + 4 * 6)+"\n");
    }
}