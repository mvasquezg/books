/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 2: Algoritmos y diseños 
 *Programa 1: Area de un Rectangulo
*/
import java.util.Scanner;

public class RectangleArea{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int base=0, altura=0, area=0;

        System.out.print("Ingrese la base del rectangulo: ");
        base=in.nextInt();

        System.out.print("Ingrese la altura del rectangulo: ");
        altura=in.nextInt();

        area=base*altura;

        System.out.println("El area del Rectangulo es igual a: "+area);
    }
}