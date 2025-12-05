/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 06: Intereses producidos 
*/

/***
 * Variables
 * I = Total de Intereses producidos
 * c = Capital
 * r = Tasa de Interes nominal en tanto por ciento
 * t = Periodo de calculo en dias   
 */
import java.util.Scanner;

public class Interest{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double c, interest, capital, t;
        float r=0.0F;

        System.out.print("Capital Invertido: ");
        c = in.nextDouble();

        System.out.print("A un % anual de: ");
        r=in.nextFloat();

        System.out.print("Durante cuantos dias: ");
        t=in.nextDouble();

        interest=c*r*t/(360*100);

        capital=c+interest;

        System.out.println("Intereses producidos... "+interest);
        System.out.println("Capital acumulado..."+capital);

    }

}