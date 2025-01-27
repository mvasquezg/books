/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 07.-Se desea diseñar un algoritmo que escriba los nombres de los dias en función del valor de una variable
    DIA introducida por el teclado.
    Los días de la semana son 7: por consiguiente, el rango de los valores será 1 .. 7, y el caso que el día tome un valor 
    fuera de este rango se deberá producir un mensaje de error advirtiendo la situación anómala.  
    ejemplo 4.9, Pagina 141
*/
import java.util.Scanner;
public class DaysOfWeek{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int day=0;
        System.out.print("Ingresa un numero del 1 al 7, para indicar el dia del semana\nIngresa un numero: ");
        day=in.nextInt();
        System.out.print("\n");
        switch(day){
            case 1:
                System.out.print("Lunes");
                break;
            case 2:
                System.out.print("Martes");
                break;
            case 3:
                System.out.print("Miercoles");
                break;
            case 4:
                System.out.print("Jueves");
                break;
            case 5:
                System.out.print("Viernes");
                break;
            case 6:
                System.out.print("Sabado");
                break;
            case 7:
                System.out.print("Domingo");
                break;
            default:
                System.out.print("El numero ingresado no pertenece a algun dia de la semana.");
                break;                            
        }
        System.out.print("\n\n");
    }   
}    