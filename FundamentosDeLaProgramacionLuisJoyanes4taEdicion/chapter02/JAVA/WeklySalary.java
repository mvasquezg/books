/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 29.-Escribir un algoritmo que encuentre el salario semanal de un trabajador, 
    dada la tarifa horaria y el número de horas trabajadas diariamente.
*/
import java.util.Scanner;

public class WeklySalary{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int pricePerHour=0;
        int hoursWorked=0;
        int sumHours=0;
        int salary=0;

        System.out.print("Ingresa el precio por hora: ");
        pricePerHour=in.nextInt();

        for(int i=1; i<=7; i++){
            System.out.print("Ingresa horas trabajdas del dia "+i+": " );
            hoursWorked=in.nextInt();

            sumHours+=hoursWorked;
        }

        salary=sumHours*pricePerHour;

        System.out.print("\nHoras trabajadas en la semana: "+sumHours+"\nSalario semanal del trabajador: $ "+salary+"\n");
    }
}