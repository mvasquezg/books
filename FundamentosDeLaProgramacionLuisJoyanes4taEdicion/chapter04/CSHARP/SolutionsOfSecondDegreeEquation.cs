/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 13.-Pseudocodigo que nos permita calcular las soluciones de una ecuacion de segundo grado, incluyendo
    los valores imaginarios.
    ejemplo 4.17, Pagina 147
*/
using System;
class SolutionsOfSecondDegreeEquation{    
    public static void Main(string[] args){
        double a=0, b=0, c=0, d=0, x1=0, x2=0, r=0, i=0;

        System.Console.Write("Programa que nos permita calcular las soluciones de una ecuacion de segundo grado, incluyendo los valores imaginarios.");
        System.Console.Write("\n\nIngrese los coeficientes: ");
        System.Console.Write("\nIngrese el valor de A: ");
        a=double.Parse(System.Console.ReadLine());
        System.Console.Write("Ingrese el valor de B: ");
        b=double.Parse(System.Console.ReadLine());
        System.Console.Write("Ingrese el valor de C: ");
        c=double.Parse(System.Console.ReadLine());

        if(a==0){
            System.Console.Write("La ecuacion no es de segundo grado.\n");
        }else{
            d=b*b-4*a*c;

            if(d==0){
                x1= -b/(2+a);
                x2=x1;
                System.Console.Write("\nLos valores son para:\nx1="+x1+"\nx2="+x2);

            }else if(d>0){
                x1=(-b +Math.Sqrt(d)) / (2*a);
                x2=(-b -Math.Sqrt(d)) / (2*a);
                System.Console.Write("\nLos valores son para:\nx1="+x1+"\nx2="+x2);
            }else{
                r=(-b)/(2*a);
                int dAbs=(int)(d);
                int absNum=Math.Abs(dAbs);
                i=Math.Sqrt(absNum) /(2*a);
                System.Console.Write("\n\nLos valores son para:\nr="+r+" + "+i+"i");
                System.Console.Write("\nLos valores son para:\nr="+r+" - "+i+"i");
            }
        }
        System.Console.Write("\n\n");

    }
}