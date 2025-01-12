/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 06.-Programa que nos calcule el area de un triangulo conociendo sus lados. 
    La estructura selectiva se utiliza para el control de entrada de datos del programa.

    Nota: 
    Area = sqrt(P * (P-a) * (P-b) * (P-c))
    P = (a + b + c)/2

    donde P>a y P>b y P>c, sino se cumple la condicion entonces no es un triangulo.

    ejemplo 4.8, Pagina 138
*/
using System;
class AreaTriangle{    
    public static void Main(string[] args){
        double Area=0, P=0, a=0, b=0, c=0;
        System.Console.Write("Programa que nos calcule el area de un triangulo conociendo sus lados.\n"); 
        //System.Console.Write("La estructura selectiva se utiliza para el control de entrada de datos del programa.");
        System.Console.Write("\n\nNota: Area = sqrt(P * (P-a) * (P-b) * (P-c))\nP = (a + b + c)/2\n");
        System.Console.Write("\n\nDonde P>a y P>b y P>c, sino se cumple la condicion entonces no es un triangulo.");
        System.Console.Write("\nIngresa el valor de a: ");
        a=float.Parse(System.Console.ReadLine());;
        System.Console.Write("Ingresa el valor de b: ");
        b=float.Parse(System.Console.ReadLine());
        System.Console.Write("Ingresa el valor de c: ");
        c=float.Parse(System.Console.ReadLine());;
        P=(a+b+c)/2;
        if(P>a && P>b && P>c){
            Area=Math.Sqrt(P * (P-a) * (P-b) * (P-c));
        }
        if(Area!=0){
            System.Console.Write("\nEl area es igual a: "+Area);
        }else{
            System.Console.Write("No es un triangulo.");
        }
        System.Console.Write("\n\n");
    }
}