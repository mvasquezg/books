/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 13.-Pseudocodigo que nos permita calcular las soluciones de una ecuacion de segundo grado, incluyendo
    los valores imaginarios.
    ejemplo 4.17, Pagina 147
*/
import java.util.Scanner;
public class SolutionsOfSecondDegreeEquation{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double a=0, b=0, c=0, d=0, x1=0, x2=0, r=0, i=0;

        System.out.print("Programa que nos permita calcular las soluciones de una ecuacion de segundo grado, incluyendo los valores imaginarios.");
        System.out.print("\n\nIngrese los coeficientes: ");
        System.out.print("\nIngrese el valor de A: ");
        a=in.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        b=in.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        c=in.nextDouble();

        if(a==0){
            System.out.print("La ecuacion no es de segundo grado.\n");
        }else{
            d=b*b-4*a*c;

            if(d==0){
                x1= -b/(2+a);
                x2=x1;
                System.out.print("\nLos valores son para:\nx1="+x1+"\nx2="+x2);

            }else if(d>0){
                x1=(-b +Math.sqrt(d)) / (2*a);
                x2=(-b -Math.sqrt(d)) / (2*a);
                System.out.print("\nLos valores son para:\nx1="+x1+"\nx2="+x2);
            }else{
                r=(-b)/(2*a);
                int dAbs=(int)(d);
                int absNum=Math.abs(dAbs);
                i=Math.sqrt(absNum) /(2*a);
                System.out.print("\n\nLos valores son para:\nr="+r+" + "+i+"i");
                System.out.print("\nLos valores son para:\nr="+r+" - "+i+"i");
            }
        }
        System.out.print("\n\n");

    }
}