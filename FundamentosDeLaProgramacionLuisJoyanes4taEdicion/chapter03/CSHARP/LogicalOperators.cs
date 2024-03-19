/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 09.-Operadores Logicos.

    Operador Logico     Expresion Logica    Significado
    no (not), !         no p (not p)        Negacion de p
    y (and), &&         p y q               Conjuncion de p y q
    o (or), ||           p o q               Disyuncion de p y q

*/
using System;
class LogicalOperators{

    public static void Main(string[] args){
        System.Console.Write("   Operador logico\t\tExpresion logica\t\tSignificado\n");
        System.Console.Write("   no (not), !\t\t\tno p (not p)\t\t\tNegacion de p\n");
        System.Console.Write("   y (and), &&\t\t\tp y q\t\t\t\tConjuncion de p y q\n");
        System.Console.Write("   o (or), &&\t\t\tp o q\t\t\t\tDisyuncion de p y q\n");
    }
}