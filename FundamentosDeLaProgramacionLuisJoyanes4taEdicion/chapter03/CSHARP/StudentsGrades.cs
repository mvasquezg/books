/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 27.-Calcular la nota media de los alumnos de una clase considerando n-numero de alumnos
    y c-numero de calificaciones de cada alumno.
*/
using System;
class StudentsGrades{
    public static void Main(string[] args){
        int numStudents=0, numCal=0, sumCal=0, cal;
        float promCal=0;
        System.Console.Write("Ingrese la cantidad de alumnos: ");
        numStudents=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingrese el numero de calificaciones por alumno: ");
        numCal=int.Parse(System.Console.ReadLine());
        System.Console.Write("\n");

        for(int i=1; i<=numStudents; i++){
            sumCal=0;
            for(int j=1; j<=numCal; j++){
                System.Console.Write(j+".-Ingresa la calificacion del alumno "+i+": ");
                cal=int.Parse(System.Console.ReadLine());
                sumCal+=cal;
            }
            promCal=sumCal/numCal;    
            System.Console.Write("\nEl promedio del alumno "+i+" es: "+promCal+"\n"); 
            System.Console.Write("\n");
        }
        System.Console.Write("\n\n");
    }
}   