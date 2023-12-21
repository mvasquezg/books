/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 14.Escribir un algoritmo que lea el nombre de un empleado, las horas trabajadas, 
    el precio por hora y calcule los impuestos a pagar (tasa = 25%) y el salario neto.
*/
import java.util.Scanner;
public class TotalSalary{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String nameWorked="";  //nombre del trabajador
        int hoursWorked=0;    //Horas trabajadas
        int pricePerHour=0;   //Pago por Hora
        int tax=25;         //impuesto a decucir 25%
        int grossSalary=0;    //Salario bruto
        int netSalary=0;      //salrio neto (salario despues de descuento de impuestos)
        int salaryDiscount=0; //Impuesto a descontar

        System.out.print("Ingrese el nombre del trabajador: ");
        nameWorked=in.nextLine();
        System.out.print("Ingresa las horas trabajadas: ");
        hoursWorked=in.nextInt();
               
        System.out.print("\nEmpleado: "+nameWorked+" Sueldo neto $: "+netSalary+"\n");
    }  
}