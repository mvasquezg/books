/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 14.Escribir un algoritmo que lea el nombre de un empleado, las horas trabajadas, 
    el precio por hora y calcule los impuestos a pagar (tasa = 25%) y el salario neto.
*/
using System;
class TotalSalary{
    public static void Main(string[] args){
        String nameWorked;  //nombre del trabajador
        int hoursWorked;    //Horas trabajadas
        int pricePerHour;   //Pago por Hora
        int tax=25;         //impuesto a decucir 25%
        int grossSalary;    //Salario bruto
        int netSalary;      //salrio neto (salario despues de descuento de impuestos)
        int salaryDiscount; //Impuesto a descontar
        
        System.Console.Write("Ingrese el nombre del trabajador: ");
        nameWorked=Console.ReadLine();

        System.Console.Write("Ingresa las horas trabajadas: ");
        hoursWorked=int.Parse(Console.ReadLine());

        System.Console.Write("Ingresa el precio de la hora trabajada $: ");
        pricePerHour=int.Parse(Console.ReadLine());

        grossSalary=hoursWorked*pricePerHour;
    
        salaryDiscount=(grossSalary*tax)/100;

        netSalary=grossSalary-salaryDiscount;

        System.Console.Write("\nEmpleado: "+nameWorked+" Sueldo neto $: "+netSalary+"\n");       
    }  
}