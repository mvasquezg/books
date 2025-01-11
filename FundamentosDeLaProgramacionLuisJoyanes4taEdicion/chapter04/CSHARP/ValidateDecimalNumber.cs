/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 04.-Empleo de estructura selectiva para detectar si un numero tiene o no parte fraccionaria.
    ejemplo 4.6, pagina 136
*/
using System;

class ValidateDecimalNumbers{
 
    public static void Main(string[] args){

        float num=0;
        System.Console.Write("\nPrograma que emplea de estructura selectiva para detectar si un numero tiene o no parte fraccionaria.");

        System.Console.Write("\n\nIngresa un numero con decimales: ");
        num=float.Parse(System.Console.ReadLine());

        if(num==Math.Truncate(num)){
            System.Console.Write(num+" No tiene parte fraccionaria\n");
        }else{
            System.Console.Write(num+" Tiene parte fraccionaria\n\n");
        }
    }
}   