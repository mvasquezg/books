/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
Capitulo 02.-Metodología de la programación y desarrollo de software.
Problema 02.Calcular la paga neta de un trabajador conociendo el número de horas trabajadas, 
la tarifa horaria y la tasa de impuestos.

salarioBruto=horasTrabajadas*pagoPorHora

descuentoSalarial=(salarioBruto*impuesto)/100

salarioNeto=salarioBruto-descuentoSalarial
*/

#include<iostream>
using namespace std;
int main(){
    int hoursWorked;    //Horas trabajadas
    int pricePerHour;   //Pago por Hora
    int tax;            //impuesto a decucir
    int grossSalary;    //Salario bruto
    int salaryDiscount; //descuento del salario
    int netSalary;      //salrio neto (salario despues de descuento de impuestos)

    cout<<"Ingresa las horas trabajadas: ";
    cin>>hoursWorked;

    cout<<"Ingresa el precio de la hora trabajada $: ";
    cin>>pricePerHour;

    cout<<"Ingresa el impuesto a descontar: ";
    cin>>tax;

    grossSalary=hoursWorked*pricePerHour;
    
    salaryDiscount=(grossSalary*tax)/100;

    netSalary=grossSalary-salaryDiscount;

    cout<<"Suedo neto $: "<<netSalary<<"\n";

    return 0;
}  