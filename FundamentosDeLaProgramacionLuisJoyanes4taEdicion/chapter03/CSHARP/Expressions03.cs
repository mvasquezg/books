/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 04.-Convertir en expresiones aritméticas algorítmicas las siguientes expresiones algebraicas:
					
					1) 5 ∙ (x + y)
					
					2) x + y/ (u+ w/a)
					
					3) a^2 + b^2
					
					4) x/y * (z + w)   
*/  
using System;
class Expressions{
    public static void Main(string[] args){
        int a=0, b=0, u=0, w=0, x=0, y=0, z=0;

        System.Console.Write("Ingresa el valor de a: ");
        a=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el valor de b: ");
        b=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el valor de u: ");
        u=int.Parse(System.Console.ReadLine());    

        System.Console.Write("Ingresa el valor de w: ");
        w=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el valor de x: ");
        x=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el valor de y: ");
        y=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el valor de z: ");
        z=int.Parse(System.Console.ReadLine());

        System.Console.Write("\n5 ∙ (x + y) = "+(5*(x+y))+"\n\n");
        System.Console.Write("a^2 + b^2 = "+(Math.Pow(a, 2)+Math.Pow(b, 2))+"\n\n");
        System.Console.Write("x + y / (u + w/a) = "+((x+y)/(u+(w/a))+"\n\n"));
        
        System.Console.Write("x/y * (z + w)  = "+((x/y)*(z+w))+"\n\n");
    }
}