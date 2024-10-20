/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 27.-Calcular la nota media de los alumnos de una clase considerando n-numero de alumnos
    y c-numero de calificaciones de cada alumno.
*/
import java.util.Scanner;
public class StudentsGrades{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int numStudents=0, numCal=0, sumCal=0, cal=0;
        float promCal=0;
        System.out.print("Ingrese la cantidad de alumnos: ");
        numStudents=in.nextInt();
        System.out.print("Ingrese el numero de calificaciones por alumno: ");
        numCal=in.nextInt();
        System.out.print("\n");

        for(int i=1; i<=numStudents; i++){
            sumCal=0;
            for(int j=1; j<=numCal; j++){
                System.out.print(j+".-Ingresa la calificacion del alumno "+i+": ");
                cal=in.nextInt();
                sumCal+=cal;
            }
            promCal=sumCal/numCal;    
            System.out.print("\nEl promedio del alumno "+i+" es: "+promCal+"\n"); 
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
}   