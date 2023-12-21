/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 14.Escribir un algoritmo que lea el nombre de un empleado, las horas trabajadas, 
    el precio por hora y calcule los impuestos a pagar (tasa = 25%) y el salario neto.
*/
#include<iostream>
using namespace std;
int main(){
    char nameWorker[120]; //arreglo que almacenara el nombre del trabajador
    int hoursWorked;    //Horas trabajadas
    int pricePerHour;   //Pago por Hora
    int tax=25;         //impuesto a decucir 25%
    int grossSalary;    //Salario bruto
    int netSalary;      //salrio neto (salario despues de descuento de impuestos)
    int salaryDiscount; //Impuesto a descontar

    cout<<"Ingrese el nombre del trabajador: ";
    cin>>nameWorker;

    cout<<"Ingresa las horas trabajadas: ";
    cin>>hoursWorked;

    cout<<"Ingresa el precio de la hora trabajada $: ";
    cin>>pricePerHour;

    grossSalary=hoursWorked*pricePerHour;
    
    salaryDiscount=(grossSalary*tax)/100;

    netSalary=grossSalary-salaryDiscount;

    cout<<"\nEmpleado: "<<nameWorker<<"\nSueldo neto $: "<<netSalary<<"\n";

    return 0;
}  