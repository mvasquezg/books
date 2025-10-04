/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 01.-Calcular la superficie (área) de un rectángulo, usando funciones.
    
    Ejemplo1
    Pagina 202
*/
using System;

class FuncAreaRectangulo{
    static float calculateArea(float b, float a){
        return b*a;
    }

    public static void Main(string[] args){
        float b=0, a=0;

       System.Console.Write("Programa que calcula el area de un rectangulo, usando una funcion:\n\nIngresa la base del rectangulo: ");
       b=float.Parse(System.Console.ReadLine());
       System.Console.Write("Ingresa la altura del rectangulo: ");
       a=float.Parse(System.Console.ReadLine());

       System.Console.Write("El area del rectanglo es igual a: "+calculateArea(b, a)+"\n\n");    
    }
}