/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
Capitulo 02.-Metodología de la programación y desarrollo de software.
Problema 02.Calcular la paga neta de un trabajador conociendo el número de horas trabajadas, 
la tarifa horaria y la tasa de impuestos.

salarioBruto=horasTrabajadas*pagoPorHora

descuentoSalarial=(salarioBruto*impuesto)/100

salarioNeto=salarioBruto-descuentoSalarial
*/

using System;
class Salary{
    public static void Main(string[] args){
        int hoursWorked;    //Horas trabajadas
        int pricePerHour;   //Pago por Hora
        int tax;            //impuesto a decucir
        int grossSalary;    //Salario bruto
        int salaryDiscount; //descuento del salario
        int netSalary;      //salrio neto (salario despues de descuento de impuestos)

        System.Console.Write("Ingresa las horas trabajadas: ");
        hoursWorked=int.Parse(Console.ReadLine());

        System.Console.Write("Ingresa el precio de la hora trabajada $: ");
        pricePerHour=int.Parse(Console.ReadLine());

        System.Console.Write("Ingresa el impuesto a descontar: ");
        tax=int.Parse(Console.ReadLine());

        grossSalary=hoursWorked*pricePerHour;
    
        salaryDiscount=(grossSalary*tax)/100;

        netSalary=grossSalary-salaryDiscount;

        System.Console.Write("Suedo neto $: "+netSalary+"\n");       
    }  
}