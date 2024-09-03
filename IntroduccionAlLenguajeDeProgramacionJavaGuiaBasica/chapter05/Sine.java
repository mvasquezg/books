/** 
 *Libro: Introducción al lenguaje de programación Java. Una guía básica.
 *Capitulo 5: Clases en Java
 *Programa 3: Paso por referencia seno
 */
import java.util.Scanner;

public class Sine{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double angle=0;

        System.out.print("Ingrese el angulo para calcular el seno: ");
        angle=in.nextDouble();

        System.out.println("El seno del angulo: "+angle+" es igual a: "+calculateSin(angle));
    }

    public static double calculateSin(double angle){
        return Math.sin(Math.PI*angle/180);
    }

}
