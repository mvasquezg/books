/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 05.-Resolver las operaciones de los parentesis primero.
					
					1) A * (B + 3)
					
					2) (A*B) + 3
					
					3) A + (B + C) + D

					4) (A+B/C) + D
					
					5) A*B/C * D   
*/
using System;
class ParenthesisPriority{

    public static void Main(string[] args){
        int a=0, b=0, c=0, d=0;

        System.Console.Write("Ingresa el valor de A: ");
        a=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el valor de B: ");
        b=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el valor de C: ");
        c=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el valor de D: ");
        d=int.Parse(System.Console.ReadLine());

        System.Console.Write("\nA * (B + 3) = "+(a*(b+3))+"\n\n");
					
	    System.Console.Write("(A * B) + 3 = "+((a * b) + 3)+"\n\n");
					
	    System.Console.Write("A + (B + C) + D = "+(a + (b + c) + d)+"\n\n"); 

	    System.Console.Write("(A+B/C) + D = "+((a+b/c) + d)+"\n\n");
					
	    System.Console.Write("A*B/C*D = "+(a*b/c*d)+"\n\n");
    }
}