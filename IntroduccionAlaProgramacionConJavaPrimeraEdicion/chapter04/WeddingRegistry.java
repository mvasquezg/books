/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 7: Uso del bucle while.
 */
import java.util.Scanner;

public class WeddingRegistry{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String registry="";
        char mas;

        System.out.print("Desea crear una lista de registro de bodas? (s/n): ");
        mas=in.nextLine().charAt(0);

        while(mas=='s'){
            System.out.print("Ingrese el nombre del articulo: ");
            registry+=in.nextLine() + " - ";

            System.out.print("Ingrese la tienda: ");
            registry+=in.nextLine() + "\n";

            System.out.print("\n¿Algun otro articulo?: ");
            mas=in.nextLine().charAt(0);
        }

        if( !registry.equals("")){
            System.out.println("\nRegistro de Bodas:\n" + registry);
        }
    }
}
