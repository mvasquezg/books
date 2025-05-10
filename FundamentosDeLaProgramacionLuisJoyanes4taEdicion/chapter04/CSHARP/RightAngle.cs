/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 19.-Si un ángulo es igual a 90 grados, imprimir el mensaje "El ángulo es un ángulo recto" sino imprimir el mensaje 
    "El ángulo no es un ángulo recto.

    Ejercicios
    4.1 (a) Pagina 155
*/
using System;

class RightAngle{
    public static void Main(string[] args){
       float angle=0;

       System.Console.Write("Programa que determina si un angulo es Recto o no.\nIngrese el valor del angulo: ");
       angle=float.Parse(System.Console.ReadLine());

       System.Console.Write("\n");
       if(angle!=90){
           System.Console.Write("El angulo "+angle+" no es recto");
       }else{
           System.Console.Write("El angulo "+angle+" es recto");
       }
       System.Console.Write("\n");
    }
}