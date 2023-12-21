/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 14.Escribir un algoritmo que lea el nombre de un empleado, las horas trabajadas, 
    el precio por hora y calcule los impuestos a pagar (tasa = 25%) y el salario neto.
.
*/
#include<stdio.h>
int main(){
    char nameWorker[120]; //arreglo que almacenara el nombre del trabajador
    int hoursWorked;    //Horas trabajadas
    int pricePerHour;   //Pago por Hora
    int tax=25;         //impuesto a decucir 25%
    int grossSalary;    //Salario bruto
    int netSalary;      //salrio neto (salario despues de descuento de impuestos)
    int salaryDiscount; //Impuesto a descontar

    printf("Ingrese el nombre del trabajador: ");
    fgets(nameWorker, 120, stdin);
    
    printf("Ingresa las horas trabajadas: ");
    scanf("%d", &hoursWorked);

    printf("Ingresa el precio de la hora trabajada $: ");
    scanf("%d", &pricePerHour);

    grossSalary=hoursWorked*pricePerHour;
    
    salaryDiscount=(grossSalary*tax)/100;

    netSalary=grossSalary-salaryDiscount;
    
    printf("\nEmpleado: %s\nSueldo neto $: %d\n", nameWorker, netSalary);
}