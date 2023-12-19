/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 08.Formula cuadratica
    
    x1 = –b + √((bb – 4ac)/2a)
    x2 = –b – √((bb – 4ac)/2a)
*/
using System;

class QuadraticFormula{
    public static void Main(string[] args){
        double a=0;
        double b=0;
        double c=0;
        double x1=0;
        double x2=0;

        System.Console.Write("Ingresa el valor de A: ");
        a=float.Parse(Console.ReadLine());

        System.Console.Write("Ingresa el valor de B: ");
        b=float.Parse(Console.ReadLine());

        System.Console.Write("Ingresa el valor de C: ");
        c=float.Parse(Console.ReadLine());

        x1=-(b + Math.Sqrt (b*b - (4*a*c))) / (2*a);
        x2=-(b - Math.Sqrt (b*b - (4*a*c))) / (2*a);

        System.Console.Write("\n\nx1: "+x1+"\nx2: "+x2+"\n\n");
    }
}
