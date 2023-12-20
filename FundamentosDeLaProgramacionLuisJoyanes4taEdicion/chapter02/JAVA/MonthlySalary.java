/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 11.Cálculo de los salarios mensuales de los empleados de una empresa, sabiendo que éstos se calculan 
    en base a las horas semanales trabajadas y de acuerdo a un precio especificado por horas. Si se pasan de 
    cuarenta horas semanales, las horas extraordinarias se pagarán a razón de 1,5 veces la hora ordinaria.
*/
import java.util.Scanner;
public class MonthlySalary{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int monthlyHours=160;   //Horas constantes al mes
        int hoursWorked=0;      //Horas trabajadas
        int pricePerHour=0;     //Precio por horas
        int extraHours=0;       //Horas extras
        int salary=0;           //Salario
        int extraSalary=0;      //Salario extra
        int totalSalary=0;      //Salario total

        System.out.print("\nPrograma que calula el salario mensual de un trabajador, el trabajador debe cumplir con 160 hrs mensuales.");
        System.out.print("\nPuede haber horas de extras. las horas extras se pagan a 1.5 las horas ordinarias.");  
        System.out.print("\n\nIngresa el total de horas trabajas en el mes: ");
        hoursWorked=in.nextInt();

        System.out.print("\nIngresa el precio por hora: ");
        pricePerHour=in.nextInt();

        if(hoursWorked<=monthlyHours){
            totalSalary=hoursWorked*pricePerHour;
        }else{
            extraHours=hoursWorked-monthlyHours;
            salary=monthlyHours*pricePerHour;
            extraSalary=(int)(extraHours*(pricePerHour*1.5));
            totalSalary=salary+extraSalary;
        }
        System.out.print("\nEl sueldo total mensual es igual a: "+totalSalary+"\n");
    }
}