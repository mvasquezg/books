
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 23.-Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo.

    Ejercicios
    4.1 (e) Pagina 155
*/
using System;

class Distance{

    public static void Main(string[] args){
    
        int distance=0, time=0;
    
        System.Console.Write("programa Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo: ");
    
        System.Console.Write("\n\nIngresa la distancia: ");
        distance=int.Parse(System.Console.ReadLine());
    
        if(distance>20 && distance<35){
            System.Console.Write("ingresa el tiempo: ");
            time=int.Parse(System.Console.ReadLine());
        }
    
        System.Console.Write("\nLos valores son:\nDistancia = "+distance+"\nTiempo = "+time+"\n\n");
    
    }
}