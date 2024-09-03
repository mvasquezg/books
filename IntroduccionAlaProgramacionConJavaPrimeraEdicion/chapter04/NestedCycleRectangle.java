/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 10: Uso del bucle anidados, rectangulo ciclo anidado.
 */
import java.util.Scanner;

public class NestedCycleRectangle{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int alto, ancho;
        char carPrint;

        System.out.print("Introduzca la altura: ");
        alto=in.nextInt();

        System.out.print("Introduzca el ancho: ");
        ancho=in.nextInt();

        System.out.print("Introduzco el caracter: ");
        carPrint=in.next().charAt(0);
        
        System.out.println();
        
        for(int i=1; i<=alto; i++){
            for(int j=1; j<=ancho; j++){
                System.out.print(carPrint);
            }
            System.out.println();
        }
    }

}
