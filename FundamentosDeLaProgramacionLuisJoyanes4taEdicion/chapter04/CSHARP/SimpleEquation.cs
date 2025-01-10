/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 02.-Resolucion de una ecuacion de primer grado.
    Si la ecuacion es ax+b=0, a y b son los datos, y las posibles soluciones son:
    ** a <> 0               x= -b/a
    ** a = 0  b <> 0   entonces "Solucion imposible"
    ** a = 0 b = 0     entonces "Solucion indeterminada"
    ejemplo 4.3, pagina 133
*/

using System;

class SimpleEquation{
    public static void Main(string[] args){
        int a=0, b=0, x=0;
        System.Console.Write("Resolucion de una ecuacion de primer grado.\n\nSi la ecuacion es ax+b=0, a y b son los datos, y las posibles soluciones son:\n");
        System.Console.Write("\na <> 0               x= -b/a\na = 0  b <> 0   entonces Solucion imposible\na = 0 b = 0     entonces Solucion indeterminada");

        System.Console.Write("\n\ningresa el valor de a: ");
        a=int.Parse(System.Console.ReadLine());

        System.Console.Write("ingresa el valor de b: ");
        b=int.Parse(System.Console.ReadLine());

        if(a!=0){
            x=-b/a;
            System.Console.Write("x=-b/a\nx="+x+"\n");

        }else if(a==0 && b!=0){
            System.Console.Write("Solucion imposible");
        }else if(a==0 && b==0){
            System.Console.Write("Solucion indeterminada  ");
        }

        System.Console.Write("\n\n");
    }
}    