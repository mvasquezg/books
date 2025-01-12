/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 06.-Programa que nos calcule el area de un triangulo conociendo sus lados. 
    La estructura selectiva se utiliza para el control de entrada de datos del programa.

    Nota: 
    Area = sqrt(P * (P-a) * (P-b) * (P-c))
    P = (a + b + c)/2

    donde P>a y P>b y P>c, sino se cumple la condicion entonces no es un triangulo.

    ejemplo 4.8, Pagina 138
*/
import java.util.Scanner;
public class AreaTriangle{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double Area=0, P=0, a=0, b=0, c=0;
        System.out.print("Programa que nos calcule el area de un triangulo conociendo sus lados.\n"); 
        //System.out.print("La estructura selectiva se utiliza para el control de entrada de datos del programa.");
        System.out.print("\n\nNota: Area = sqrt(P * (P-a) * (P-b) * (P-c))\nP = (a + b + c)/2\n");
        System.out.print("\n\nDonde P>a y P>b y P>c, sino se cumple la condicion entonces no es un triangulo.");
        System.out.print("\nIngresa el valor de a: ");
        a=in.nextFloat();
        System.out.print("Ingresa el valor de b: ");
        b=in.nextFloat();
        System.out.print("Ingresa el valor de c: ");
        c=in.nextFloat();
        P=(a+b+c)/2;
        if(P>a && P>b && P>c){
            Area=Math.sqrt(P * (P-a) * (P-b) * (P-c));
        }
        if(Area!=0){
            System.out.print("\nEl area es igual a: "+Area);
        }else{
            System.out.print("No es un triangulo.");
        }
        System.out.print("\n\n");
    }
}