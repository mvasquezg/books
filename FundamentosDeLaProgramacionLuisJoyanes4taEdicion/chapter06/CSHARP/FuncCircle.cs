/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 11.-Se trata de realizar el cálculo del área de un círculo y la longitud de la circunferencia en función del valor del radio
                 leído desde el teclado.
    
    Ejemplo 11
    Pagina 223-224
*/
using System;

class FuncCircle{
    static double calArea(float radio){
        return Math.PI*radio*radio;
    }

    static double calcCircun(float radio){
        return Math.PI*2*radio;
    }

    public static void Main(string[] args){
        float radio=0.0F;

        System.Console.Write("Programa que calcula el area de un circulo y la longitud de la circunferencia\nIngrese el radio del circulo: ");
        radio=float.Parse(System.Console.ReadLine());

        System.Console.Write("\nArea: "+calArea(radio)+"\nCircunferencia: "+calcCircun(radio)+"\n\n");
    }
}