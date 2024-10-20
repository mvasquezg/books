/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 27.-Calcular la nota media de los alumnos de una clase considerando n-numero de alumnos
    y c-numero de calificaciones de cada alumno.
*/
#include<stdio.h>
void main(){
    int numStudents=0, numCal=0, sumCal=0, cal;
    float promCal=0;

    printf("Ingrese la cantidad de alumnos: ");
    scanf("%d", &numStudents);

    printf("Ingrese el numero de calificaciones por alumno: ");
    scanf("%d", &numCal);
    printf("\n");

    for(int i=1; i<=numStudents; i++){
        sumCal=0;
        for(int j=1; j<=numCal; j++){
            printf("%d.-Ingresa la calificacion del alumno %d: ", j, i);
            scanf("%d", &cal);
            sumCal+=cal;
        }
        promCal=sumCal/numCal;    
        printf("\nEl promedio del alumno %d es: %f\n", i, promCal);
        printf("\n");
    }
    printf("\n\n");
}

