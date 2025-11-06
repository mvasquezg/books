/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 06.-Algoritmo que contiene y utiliza unas funciones (seno y coseno) a las que les podemos pasar el ángulo en grados.
    
    Ejemplo 6
    Pagina 208
*/

using System;

class FuncSinCosine{    
    static double calculateSin(double degree){
        return Math.Sin(degree*2*3.1416/360);
    }

    static double calculateCosine(double degree){
        return Math.Cos(degree*2*3.1416/360);
    }


    public static void Main(string[] args){
        double degree;

        System.Console.Write("Programa que calcula el seno y el coseno de un angulo en grados:\n");
        System.Console.Write("Ingresa el angulo en grado: ");
        degree=double.Parse(System.Console.ReadLine());

        System.Console.Write("\nEl seno de "+degree +" es igual a: "+calculateSin(degree)+"\n");
        System.Console.Write("\nEl coseno de "+degree +" es igual a: "+calculateCosine(degree)+"\n");
    }
}