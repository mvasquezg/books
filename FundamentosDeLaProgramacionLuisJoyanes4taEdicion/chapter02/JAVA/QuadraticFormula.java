/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 08.Formula cuadratica
    
    x1 = –b + √((bb – 4ac)/2a)
    x2 = –b – √((bb – 4ac)/2a)
*/
import java.util.Scanner;

class QuadraticFormula{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double a=0;
        double b=0;
        double c=0;
        double x1=0;
        double x2=0;

        System.out.print("Ingresa el valor de A: ");
        a=in.nextDouble();

        System.out.print("Ingresa el valor de B: ");
        b=in.nextDouble();

        System.out.print("Ingresa el valor de C: ");
        c=in.nextDouble();

        x1=-(b + Math.sqrt (b*b - (4*a*c))) / (2*a);
        x2=-(b - Math.sqrt (b*b - (4*a*c))) / (2*a);

        System.out.print("\n\nx1: "+x1+"\nx2: "+x2+"\n\n");
    }
}
