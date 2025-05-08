/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 18.-Construir un algoritmo que escriba los nombres de los días de la semana, en función de la entrada correspondiente
a la variable DIA.
        1. LUNES
        2. MARTES
        3. MIERCOLES
        4. JUEVES
        5. VIERNES
        6. SABADO
        7. DOMINGO
    
        Actividades de programacion Resueltas
        4.4, Pagina 152-153

*/
using System;
class DaysWeek{

    public static void Main(string[] args){
        int day=0;
        System.Console.Write("Ingresa un numero del 1 al 7, para indicar el dia del semana\nIngresa un numero: ");
        day=int.Parse(System.Console.ReadLine());
        System.Console.Write("\n");
        switch(day){
            case 1:
                System.Console.Write("Dia "+day+" es: Lunes");
                break;
            case 2:
                System.Console.Write("Dia "+day+" es: Martes");
                break; 
            case 3:
                System.Console.Write("Dia "+day+" es: Miercoles");
                break;
            case 4:
                System.Console.Write("Dia "+day+" es: Jueves");
                break;
            case 5:
                System.Console.Write("Dia "+day+" es: Viernes");
                break;
            case 6:
                System.Console.Write("Dia "+day+" es: Sabado");
                break;
            case 7:
                System.Console.Write("Dia "+day+" es: Domingo");
                break;
            default:
                System.Console.Write("El valor ingresado no pertenece a algun dia de la semana.");
                break;                            
        }
        System.Console.Write("\n\n");
    }   
}