/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 3: Ejemplo operador and (&&).
 */
import java.util.Scanner;

public class ExampleAnd{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int homePoints=0;
        int visitingPoints=0;
        
        System.out.print("Introduzca los puntos del equipo local: ");
        homePoints=in.nextInt();

        System.out.print("Introduzca los puntos del equipo visitante: ");
        visitingPoints=in.nextInt();

        if(homePoints>visitingPoints && homePoints>100){
            System.out.println("Aficionado, cambia tu boleto usado por una orden de papas fritas en Yummy Burgers.");
        }
    }   
}