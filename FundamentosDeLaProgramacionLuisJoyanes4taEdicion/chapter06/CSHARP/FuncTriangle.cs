/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 12.-La función triángulo calcula el área de un triángulo en C++
    
    Ejemplo 6.15
    Pagina 232-233
*/
using System;

class FuncTriangle{
    static float calcArea(float baseT, float heigth){
        return (baseT*heigth)/2;
    }

    public static void Main(string[] args){
        float baseT=0.0F, heigth=0.0F;

        System.Console.Write("**** Programa que calcula el area de un triangulo ***");
        System.Console.Write("\n\nIngresa el valor de la base: ");
        baseT=float.Parse(System.Console.ReadLine());
        System.Console.Write("Ingresa el valor de la altura: ");
        heigth=float.Parse(System.Console.ReadLine());

        System.Console.Write("\nArea: "+calcArea(baseT, heigth)+"\n\n");
    }
}