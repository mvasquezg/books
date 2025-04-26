/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 17.-Los empleados de una fabrica trabajan en dos turnos. Se desea calcular el jornal diario de acuerdo con los siguiente puntos:
        1.-La tarifa de las horas diurnas es de 5 euros.
        2.-La tarifa de las horas nocturnas es de 8 euros.
        3.-Caso de ser domingo, la tarifa se incrementara en 2 euros el turno diurno y 3 horas el turno nocturno.
    Actividades de programacion Resueltas
    4.3, Pagina 151
*/
import java.util.Scanner;
public class WorkTwoShift{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float DAY_SHIFT_PRICE=5f;
        float NIGHT_SHIFT_PRICE=8f;
        float SUNDAY_DAY_SHIFT_PRICE=2f;
        float SUNDAY_NIGHT_SHIFT_PRICE=3f;
        float salary=0f, salarySunday=0f, total=0f; 
        int shift=0, hoursWorked=0, hoursWorkedSunday=0;
        System.out.print("Programa que calcula el jornal diario de un trabajador de acuerdo a lo siguiente: ");
        System.out.print("\n1.-La tarifa de las horas diurnas es de 5 euros");
        System.out.print("\n2.-La tarifa de las horas nocturnas es de 8 euros");
        System.out.print("\n3.-En caso de ser domingo, la tarifa se incrementara en 2 euros el turno diurno y 3 horas el turno nocturno.");
        System.out.print("\n\nIngresa el turno del trabajador:\n1.-Diurno\n2.-Nocturno\nOpcion: ");
        shift=in.nextInt();
        System.out.print("\nIngresa las horas trabajadas: ");
        hoursWorked=in.nextInt();
        System.out.print("Ingresa horas trabajadas en domingo: ");
        hoursWorkedSunday=in.nextInt();
        if(shift==1){
            salary=hoursWorked*DAY_SHIFT_PRICE;
        }else if(shift==2){
            salary=hoursWorked*NIGHT_SHIFT_PRICE;
        }
        if(hoursWorkedSunday!=0){
            if(shift==1){
                salarySunday=hoursWorkedSunday*SUNDAY_DAY_SHIFT_PRICE;
            }else{
                salarySunday=hoursWorkedSunday*SUNDAY_NIGHT_SHIFT_PRICE;
            }
        }
        total=salary+salarySunday;    
        System.out.print("\n\nEl trabajador acumulo "+hoursWorked+" horas trabajadas\n");
        System.out.print("El trabajador acumulo "+hoursWorkedSunday+" horas trabajadas en domingo\n");
        System.out.print("Salario Normal:  $ "+salary+"\n");
        System.out.print("Salario domimgo:  $ "+salarySunday+"\n");
        System.out.print("Total de Salario:  $ "+total+"\n");
    }
}
