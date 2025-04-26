/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 17.-Los empleados de una fabrica trabajan en dos turnos. Se desea calcular el jornal diario de acuerdo con los siguiente puntos:
        1.-La tarifa de las horas diurnas es de 5 euros.
        2.-La tarifa de las horas nocturnas es de 8 euros.
        3.-Caso de ser domingo, la tarifa se incrementara en 2 euros el turno diurno y 3 horas el turno nocturno.
    Actividades de programacion Resueltas
    4.3, Pagina 151
*/
using System;
class WorkTwoShift{
    public static void Main(string[] args){
        float DAY_SHIFT_PRICE=5f;
        float NIGHT_SHIFT_PRICE=8f;
        float SUNDAY_DAY_SHIFT_PRICE=2f;
        float SUNDAY_NIGHT_SHIFT_PRICE=3f;
        float salary=0f, salarySunday=0f, total=0f; 
        int shift=0, hoursWorked=0, hoursWorkedSunday=0;
        System.Console.Write("Programa que calcula el jornal diario de un trabajador de acuerdo a lo siguiente: ");
        System.Console.Write("\n1.-La tarifa de las horas diurnas es de 5 euros");
        System.Console.Write("\n2.-La tarifa de las horas nocturnas es de 8 euros");
        System.Console.Write("\n3.-En caso de ser domingo, la tarifa se incrementara en 2 euros el turno diurno y 3 horas el turno nocturno.");
        System.Console.Write("\n\nIngresa el turno del trabajador:\n1.-Diurno\n2.-Nocturno\nOpcion: ");
        shift=int.Parse(System.Console.ReadLine());
        System.Console.Write("\nIngresa las horas trabajadas: ");
        hoursWorked=int.Parse(System.Console.ReadLine());;
        System.Console.Write("Ingresa horas trabajadas en domingo: ");
        hoursWorkedSunday=int.Parse(System.Console.ReadLine());;
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
        System.Console.Write("\n\nEl trabajador acumulo "+hoursWorked+" horas trabajadas\n");
        System.Console.Write("El trabajador acumulo "+hoursWorkedSunday+" horas trabajadas en domingo\n");
        System.Console.Write("Salario Normal:  $ "+salary+"\n");
        System.Console.Write("Salario domimgo:  $ "+salarySunday+"\n");
        System.Console.Write("Total de Salario:  $ "+total+"\n");
    }
}
