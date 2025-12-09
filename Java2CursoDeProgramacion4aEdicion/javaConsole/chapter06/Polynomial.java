/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 10: Programa que calcula el siguiiente polinomio 
                3x^5 - 5x^3 +2x -7
*/
import java.util.Scanner;

public class Polynomial{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float x=0F;
        float result=0F;

        System.out.print("Ingresa el valor de X: ");
        x=in.nextFloat();

        result=(float)((3*(Math.pow(x, 5))) - (5*Math.pow(x, 3)) + (2*x) -7);

        System.out.println("Resultado: "+result);
    }
}