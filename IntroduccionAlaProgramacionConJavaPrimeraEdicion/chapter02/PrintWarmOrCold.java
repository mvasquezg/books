/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 2: Algoritmos y diseños 
 *Programa 6: Imprimir calido, si la temperatura esta por arriba de los 10 grados, caso contrario imprima frio.
*/
import java.util.Scanner;

public class PrintWarmOrCold{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double temp=0;

        System.out.print("Ingresa la temperatura actual: ");
        temp=in.nextDouble();

        if(temp>10){
            System.out.println("El clima es calido");
        }else{
            System.out.println("El clima es frio");
        }

    }
}
