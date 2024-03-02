/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 01.-Mostra funcionamiento operadores de incremento.
*/  
using System;
class CheckIncrease{
    public static void Main(string[] args){
        int n=5;
    
        System.Console.Write("Valor inicial de n: "+n);
        System.Console.Write("\nEscribir el valor de la n cuando se ejecuta: n++: "+(n++));
        System.Console.Write("\nImprimir el valor de n cuando ya se ejecuto n++: "+(n));

        n=5;
        System.Console.Write("\n\nAsignando valor inicial de n, nuevamente: "+(n));
        System.Console.Write("\nEscribir el valor de la n cuando se ejecuta: ++n: "+(++n));
        System.Console.Write("\nImprimir el valor de n cuando ya se ejecuto ++n: \n\n"+(n));
    }
}
