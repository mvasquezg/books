/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 10.-Leida una fecha, decir el dia de la semana, suponiendo que el dia 1 de dicho mes fue lunes.
    ejemplo 4.12, Pagina 142
*/
using System;
class ChooseDay{
    public static void Main(string[] args){
       int day=0, month=0, year=0, d=0;
        System.Console.Write("\nLeida una fecha, decir el dia de la semana, suponiendo que el dia 1 de dicho mes fue lunes.\nConsidere que todos los meses tengan 31 dias\n");

        System.Console.Write("\nIngrese la fecha\nDia: ");
        day=int.Parse(System.Console.ReadLine());

        System.Console.Write("Mes: ");
        month=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingrese anho: ");
        year=int.Parse(System.Console.ReadLine());

        d=day%7;
        System.Console.Write("\n");
        switch(d){
            case 1:
                System.Console.Write("La fecha "+day+"-"+month+"-"+year+", el dia fue: Lunes");
                break;
            case 2:
                System.Console.Write("La fecha "+day+"-"+month+"-"+year+", el dia fue: Martes");
                break;
            case 3:
                System.Console.Write("La fecha "+day+"-"+month+"-"+year+", el dia fue: Miercoles");
                break;
            case 4:
                System.Console.Write("La fecha "+day+"-"+month+"-"+year+", el dia fue: Jueves");
                break;        
            case 5:
                System.Console.Write("La fecha "+day+"-"+month+"-"+year+", el dia fue: Viernes");
                break;
            case 6:
                System.Console.Write("La fecha "+day+"-"+month+"-"+year+", el dia fue: Sabado");
                break;
            case 0:
                System.Console.Write("La fecha "+day+"-"+month+"-"+year+", el dia fue: Domingo");
                break;            
        }
        System.Console.Write("\n\n");
    }
}