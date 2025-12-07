/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 07: Programa que culcula las raices de la ecuación
*             ax^2 + bx + c = 0   
*/

import java.util.Scanner;

public class Quadratic{
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        double a, b, c; //Coeficientes de la ecuacion
        double d;       //discriminante
        double re, im;  //parte real e imaginaria de la raiz

        System.out.print("Ingrese el valor de a: ");
        a=in.nextInt();

        System.out.print("Ingrese el valor de b: ");
        b=in.nextInt();

        System.out.print("Ingrese el valor de c: ");
        c=in.nextInt();

        if(a==0 && b==0){
            System.out.println("La ecuacion es degenerada.");
        }else if(a==0){
            System.out.println("La única raíz es: "+(-c/b));
        }else{
            //Evaluar la fórmula. Calculo de d. re e im
            re = -b/(2*a);
            d=b*b-4*a*c;
            im=Math.sqrt(Math.abs(d))/(2*a);

            if(d>=0){
                System.out.println("Raíces reales");
                System.out.println((re+im)+", "+(re-im));
            }else{
                System.out.println("Raíces complejas");
                System.out.println(re+" + "+Math.abs(im)+" j");
                System.out.println(re+" - "+Math.abs(im)+" j");
            }
        }
    }

}