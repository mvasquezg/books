/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 07.-Se desea diseñar un algoritmo que escriba los nombres de los dias en función del valor de una variable
    DIA introducida por el teclado.

    Los días de la semana son 7: por consiguiente, el rango de los valores será 1 .. 7, y el caso que el día tome un valor 
    fuera de este rango se deberá producir un mensaje de error advirtiendo la situación anómala.  
    
    ejemplo 4.9, Pagina 141
*/
using System;
class DaysOfWeek{    
    public static void Main(string[] args){
        int day=0;
        System.Console.Write("Ingresa un numero del 1 al 7, para indicar el dia del semana\nIngresa un numero: ");
        day=int.Parse(System.Console.ReadLine());
        System.Console.Write("\n");
        switch(day){
            case 1:
                System.Console.Write("Lunes");
                break;
            case 2:
                System.Console.Write("Martes");
                break;
            case 3:
                System.Console.Write("Miercoles");
                break;
            case 4:
                System.Console.Write("Jueves");
                break;
            case 5:
                System.Console.Write("Viernes");
                break;
            case 6:
                System.Console.Write("Sabado");
                break;
            case 7:
                System.Console.Write("Domingo");
                break;
            default:
                System.Console.Write("El numero ingresado no pertenece a algun dia de la semana.");
                break;                            
        }
        System.Console.Write("\n\n");
    }   
}    