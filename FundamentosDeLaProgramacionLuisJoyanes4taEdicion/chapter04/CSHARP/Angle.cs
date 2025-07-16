/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 31.-Un ángulo se considera agudo si es menor de 90 grados, obtuso si es mayor de 90 grados y 
    recto si es igual a 90 grados. Utilizando esta información, escribir un algoritmo que acepte un ángulo en grados 
    y visualice el tipo de ángulo correspondiente a los grados introducidos.

    Pagina 155
*/
using System;
class Angle{    
    public static void Main(string[] args){
        float angle=0;

        System.Console.Write("Programa que determina si el tipo de ángulo.\n\nMenor de 90 grados: Agudo.\nIgual a 90 grados: Recto.\nMayor de 90 grados: Obtuso\n");

        System.Console.Write("\nIngresa un angulo: ");
        angle=float.Parse(System.Console.ReadLine());

        if(angle>90){
            System.Console.Write("El angulo "+angle+" es Obtuso.");
        }else if(angle==90){
            System.Console.Write("El angulo "+angle+" es Recto.");
        }else{
            System.Console.Write("El angulo "+angle+" es Agudo.");
        }
        System.Console.Write("\n");
    }
}
