/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 02.Calcular la paga neta de un trabajador conociendo el número de horas trabajadas, 
    la tarifa horaria y la tasa de impuestos.

    salarioBruto=horasTrabajadas*pagoPorHora

    descuentoSalarial=(salarioBruto*impuesto)/100

    salarioNeto=salarioBruto-descuentoSalarial
*/
#include<stdio.h>
int main(){
    int hoursWorked;    //Horas trabajadas
    int pricePerHour;   //Pago por Hora
    int tax;            //impuesto a decucir
    int grossSalary;    //Salario bruto
    int salaryDiscount; //descuento del salario
    int netSalary;      //salrio neto (salario despues de descuento de impuestos)

    printf("Ingresa las horas trabajadas: ");
    scanf("%d", &hoursWorked);

    printf("Ingresa el precio de la hora trabajada $: ");
    scanf("%d", &pricePerHour);

    printf("Ingresa el impuesto a descontar: ");
    scanf("%d", &tax);

    grossSalary=hoursWorked*pricePerHour;
    
    salaryDiscount=(grossSalary*tax)/100;

    netSalary=grossSalary-salaryDiscount;
    
    printf("Suedo neto $: %d\n", netSalary);
}