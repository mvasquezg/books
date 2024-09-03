/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 2: Algoritmos y diseños 
 *Programa 5: Imprimir ¡No Hay Clases!, si la temperatura es menor a 0.
*/
import java.util.Scanner;

public class ThereIsNotClasses{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double temp=0;

        System.out.print("Ingresa la temperatura actual: ");
        temp=in.nextDouble();

        if(temp<0){
            System.out.println("No hay Clases!");
        }

    }
}
