/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 11: Programa que calcula el siguiiente polinomio 
                ax^5 - bx^3 + cx - d
*/
import java.util.Scanner;

public class PolynomialWithVariables{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float x=0F, a=0F, b=0F, c=0F, d=0F;
        float result=0F;

        System.out.print("Ingresa el valor de a: ");
        a=in.nextFloat();
        
        System.out.print("Ingresa el valor de b: ");
        b=in.nextFloat();

        System.out.print("Ingresa el valor de c: ");
        c=in.nextFloat();

        System.out.print("Ingresa el valor de d: ");
        d=in.nextFloat();

        System.out.print("Ingresa el valor de x: ");
        x=in.nextFloat();

        result=(float)((a*(Math.pow(x, 5))) - (b*Math.pow(x, 3)) + (c*x) - d);

        System.out.println("Resultado: "+result);
    }
}