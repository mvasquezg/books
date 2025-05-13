/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 20.-Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima del punto de ebullición del agua”
     sino visualizar el mensaje “por debajo del punto de ebullición del agua”

    Ejercicios
    4.1 (b) Pagina 155
*/
using System;
class Temperature{    
    public static void Main(string[] args){
        float temperature=0f;

        System.Console.Write("Programa que muestra en pantalla el siguiente mensaje\n--por encima del punto de ebullición del agua--");
        System.Console.Write(" si la temperatura es mayor a 100 grados, en caso contrario imprime --por debajo del punto de ebullición del agua--.");
        System.Console.Write("\n\nIngrese La temperatura: ");
        temperature=float.Parse(System.Console.ReadLine());

        System.Console.Write("\n");
        if(temperature>100){
            System.Console.Write("La temperatura esta por encima del punto de ebullición del agua");
        }else{
            System.Console.Write("La temperatura esta por debajo del punto de ebullición del agua");
        }
        System.Console.Write("\n");
    }
}