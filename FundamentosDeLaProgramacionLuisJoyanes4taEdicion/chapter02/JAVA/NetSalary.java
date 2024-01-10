/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 15. Se desea calcular el salario neto semanal de un trabajador en función del número de horas
    trabajadas y la tasa de impuestos:

    • las primeras 35 horas se pagan a tarifa normal,
    • las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal,
    • las tasas de impuestos son:
        a) los primeros 1.000 dólares son libres de impuestos,
        b) los siguientes 400 dólares tienen un 25 por 100 de impuestos,
        c) los restantes, un 45 por 100 de impuestos,
    • la tarifa horaria es $ 15.00.
    También se desea escribir el nombre, salario bruto, tasas y salario neto.
*/
import java.util.Scanner;
public class NetSalary{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
         //Constantes
        int BASEHOURS=35;                   //Horas base = 35
        int COSTPERHOUR=15;                  //Costo por hora = 15
        int PRICEEXTRAHOUR=(int) (COSTPERHOUR*1.5); //Precio por hora extra
        String nameWorked="";  //nombre del trabajador
        int hoursWorked=0;      //Horas trabajadas
        int tax=0;              //impuesto
        int grossSalary;        //Salario bruto
        int netSalary=0;        //salrio neto (salario despues de descuento de impuestos)
        int extraHours=0;       //Horas extras
        int baseSalary=0;       //Salario base
        int extraSalary=0;      //salario extra

        System.out.print("Ingrese el nombre del trabajador: ");
        nameWorked=in.nextLine();
        System.out.print("Ingresa las horas trabajadas: ");
        hoursWorked=in.nextInt();
        
        if(hoursWorked>35){
            extraHours=hoursWorked-BASEHOURS;
        }
        
        baseSalary=BASEHOURS*COSTPERHOUR;
        extraSalary=extraHours*PRICEEXTRAHOUR;
        grossSalary=baseSalary+extraSalary;
        if(grossSalary<=1000){
            netSalary=grossSalary;
        }else if(grossSalary<=1400){
            netSalary=grossSalary-((grossSalary*25)/100);
            tax=25;
        }else{
            netSalary=grossSalary-((grossSalary*45)/100);
            tax=45;
        }

        
        System.out.print("\nEmpleado: "+nameWorked+"\nSueldo bruto $: "+grossSalary+"\nImpuesto : "+tax+" por ciento\nSueldo neto $: "+netSalary+"\n");
    }  
}