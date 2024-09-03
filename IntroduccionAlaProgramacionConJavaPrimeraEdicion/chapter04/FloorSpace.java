/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 8: Uso del bucle do-while.
 */
import java.util.Scanner;

public class FloorSpace{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double largo=0, ancho=0;
        double  floorSpace=0;

        char answer;

        do{
            System.out.print("Introduzca la longitud: ");
            largo=in.nextDouble();

            System.out.print("Introduzca el ancho: ");
            ancho=in.nextDouble();

            floorSpace+= largo*ancho;

            System.out.print("¿Otra Recamara?: ");
            answer=in.next().charAt(0);
        }while(answer=='s' || answer=='S');

        System.out.println("El espacio total del piso es "+ floorSpace);
    }
}