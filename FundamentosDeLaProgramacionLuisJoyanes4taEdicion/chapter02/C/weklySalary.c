/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 29.-Escribir un algoritmo que encuentre el salario semanal de un trabajador, 
    dada la tarifa horaria y el número de horas trabajadas diariamente.
*/
#include<stdio.h>
void main(){
    int pricePerHour=0;
    int hoursWorked=0;
    int sumHours=0;
    int salary=0;

    printf("Ingresa el precio por hora: ");
    scanf("%d", &pricePerHour);

    for(int i=1; i<=7; i++){
        printf("Ingresa horas trabajdas del dia %d: ", i);
        scanf("%d", &hoursWorked);

        sumHours+=hoursWorked;

    }

    salary=sumHours*pricePerHour;

    printf("\nHoras trabajadas en la semana: %d\nSalario semanal del trabajador: $ %d\n", sumHours,salary);
}