/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 10.-Leida una fecha, decir el dia de la semana, suponiendo que el dia 1 de dicho mes fue lunes.
    ejemplo 4.12, Pagina 142
*/
import java.util.Scanner;
class ChooseDay{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in); 
       int day=0, month=0, year=0, d=0;
        System.out.print("\nLeida una fecha, decir el dia de la semana, suponiendo que el dia 1 de dicho mes fue lunes.\nConsidere que todos los meses tengan 31 dias\n");
        System.out.print("\nIngrese la fecha\nDia: ");
        day=in.nextInt();
        System.out.print("Mes: ");
        month=in.nextInt();
        System.out.print("Ingrese anho: ");
        year=in.nextInt();
        d=day%7;
        System.out.println();
        switch(d){
            case 1:
                System.out.print("La fecha "+day+"-"+month+"-"+year+", el dia fue: Lunes");
                break;
            case 2:
                System.out.print("La fecha "+day+"-"+month+"-"+year+", el dia fue: Martes");
                break;
            case 3:
                System.out.print("La fecha "+day+"-"+month+"-"+year+", el dia fue: Miercoles");
                break;
            case 4:
                System.out.print("La fecha "+day+"-"+month+"-"+year+", el dia fue: Jueves");
                break;        
            case 5:
                System.out.print("La fecha "+day+"-"+month+"-"+year+", el dia fue: Viernes");
                break;
            case 6:
                System.out.print("La fecha "+day+"-"+month+"-"+year+", el dia fue: Sabado");
                break;
            case 0:
                System.out.print("La fecha "+day+"-"+month+"-"+year+", el dia fue: Domingo");
                break;            
        }
        System.out.print("\n\n");
    }
}