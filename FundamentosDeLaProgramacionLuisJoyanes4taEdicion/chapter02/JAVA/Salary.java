/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 02.Calcular la paga neta de un trabajador conociendo el número de horas trabajadas, 
    la tarifa horaria y la tasa de impuestos.

    salarioBruto=horasTrabajadas*pagoPorHora

    descuentoSalarial=(salarioBruto*impuesto)/100

    salarioNeto=salarioBruto-descuentoSalarial
*/
import java.util.Scanner;
class Salary{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int hoursWorked;    //Horas trabajadas
        int pricePerHour;   //Pago por Hora
        int tax;            //impuesto a decucir
        int grossSalary;    //Salario bruto
        int salaryDiscount; //descuento del salario
        int netSalary;      //salrio neto (salario despues de descuento de impuestos)

        System.out.print("Ingresa las horas trabajadas: ");
        hoursWorked=in.nextInt();
        System.out.print("Ingresa el precio de la hora trabajada: ");
        pricePerHour=in.nextInt();
        System.out.print("Ingresa el impuesto a descontar: ");
        tax=in.nextInt();
        
        grossSalary=hoursWorked*pricePerHour;
    
        salaryDiscount=(grossSalary*tax)/100;

        netSalary=grossSalary-salaryDiscount;
        
        System.out.print("Suedo neto $: "+netSalary+"\n");
    }  
}