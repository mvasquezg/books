/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 11.Cálculo de los salarios mensuales de los empleados de una empresa, sabiendo que éstos se calculan 
    en base a las horas semanales trabajadas y de acuerdo a un precio especificado por horas. Si se pasan de 
    cuarenta horas semanales, las horas extraordinarias se pagarán a razón de 1,5 veces la hora ordinaria.
*/
#include<stdio.h>
int main(){
    int monthlyHours=160;   //Horas constantes al mes
    int hoursWorked=0;      //Horas trabajadas
    int pricePerHour=0;     //Precio por horas
    int extraHours=0;       //Horas extras
    int salary=0;           //Salario
    int extraSalary=0;      //Salario extra
    int totalSalary=0;      //Salario total

    printf("\nPrograma que calula el salario mensual de un trabajador, el trabajador debe cumplir con 160 hrs mensuales.");
    printf("\nPuede haber horas de extras. las horas extras se pagan a 1.5 las horas ordinarias.");  
    
    printf("\n\nIngresa el total de horas trabajas en el mes: ");
    scanf("%d", &hoursWorked);

    printf("\nIngresa el precio por hora: ");
    scanf("%d", &pricePerHour);

    if(hoursWorked<=monthlyHours){
        totalSalary=hoursWorked*pricePerHour;
    }else{
        extraHours=hoursWorked-monthlyHours;
        salary=monthlyHours*pricePerHour;
        extraSalary=extraHours*(pricePerHour*1.5);
        totalSalary=salary+extraSalary;
    }
    printf("\nEl sueldo total mensual es igual a: %d\n", totalSalary);
}
