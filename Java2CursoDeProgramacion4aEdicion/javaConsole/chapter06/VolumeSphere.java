/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 08: Programa que culcula el volumen de uan esfera
*             V=4/3(PI)(r^3)   
*/
import java.util.Scanner;

public class VolumeSphere{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        float radio=0.0F, volume=0.0F;

        System.out.printf("Ingrese el valor del radio: ");
        radio=in.nextFloat();

        volume=(float) ((4*Math.PI*Math.pow(radio, 3))/3);
        System.out.println("El volumen de la esfera es igual a: "+volume);

    }

}