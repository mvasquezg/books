/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 07.Encontrar el area y el perimetro de un círculo.

    A=PI*r*r
    P = 2*PI*r
*/

using System;

class CircleArea{

    public static void Main(string[] args){ 
        float r=0F;          //Variable radio      
        float PI=3.1416F;    //Variable PI
        float A=0F;          //Variable Area
        float P=0F;          //Variable Perimetro

        System.Console.Write("Ingrese el radio de la circunferencia: ");
        r=float.Parse(Console.ReadLine());

        A=PI*r*r;
        P=2*PI*r;
        
        System.Console.Write("\nRadio: "+r+"\nArea: "+A+"\nPerimetro: "+P+"\n\n");
    }
}