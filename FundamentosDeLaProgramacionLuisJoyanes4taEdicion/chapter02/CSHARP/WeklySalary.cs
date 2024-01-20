/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 29.-Escribir un algoritmo que encuentre el salario semanal de un trabajador, 
    dada la tarifa horaria y el número de horas trabajadas diariamente.
*/
using System;

class WeklySalary{

    public static void Main(string[] args){
        int pricePerHour=0;
        int hoursWorked=0;
        int sumHours=0;
        int salary=0;

        System.Console.Write("Ingresa el precio por hora: ");
        pricePerHour=int.Parse(System.Console.ReadLine());

        for(int i=1; i<=7; i++){
            System.Console.Write("Ingresa horas trabajdas del dia "+i+": " );
            hoursWorked=int.Parse(System.Console.ReadLine());

            sumHours+=hoursWorked;
        }

        salary=sumHours*pricePerHour;

        System.Console.Write("\nHoras trabajadas en la semana: "+sumHours+"\nSalario semanal del trabajador: $ "+salary+"\n");
    }
}