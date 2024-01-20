/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 27.Escribir un algoritmo que calcule la superficie de un triángulo en función de la base y la altura 
    (S = 1/2Base × Altura)
*/

using System;
class TraingleArea{
    
    public static void Main(string[] args){
        float b=0; //base
        float h=0; //altura
        float area=0; //area del triagulo

        System.Console.Write("Ingrese la base del triangulo: ");
        b=float.Parse(System.Console.ReadLine());

        System.Console.Write("Ingrese la altura del triangulo: ");
        h=float.Parse(System.Console.ReadLine()); 

        area=(b*h)/2;

        System.Console.Write("El area del tiangulo es igual a: "+area+"\n");   
    }
}