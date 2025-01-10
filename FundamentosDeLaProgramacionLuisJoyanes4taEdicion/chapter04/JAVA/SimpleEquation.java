/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 02.-Resolucion de una ecuacion de primer grado.
    Si la ecuacion es ax+b=0, a y b son los datos, y las posibles soluciones son:
    ** a <> 0               x= -b/a
    ** a = 0  b <> 0   entonces "Solucion imposible"
    ** a = 0 b = 0     entonces "Solucion indeterminada"
    ejemplo 4.3, pagina 133
*/
import java.util.Scanner;

public class SimpleEquation{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=0, b=0, x=0;
        System.out.print("Resolucion de una ecuacion de primer grado.\n\nSi la ecuacion es ax+b=0, a y b son los datos, y las posibles soluciones son:\n");
        System.out.print("\na <> 0               x= -b/a\na = 0  b <> 0   entonces Solucion imposible\na = 0 b = 0     entonces Solucion indeterminada");

        System.out.print("\n\ningresa el valor de a: ");
        a=in.nextInt();;

        System.out.print("ingresa el valor de b: ");
        b=in.nextInt();;

        if(a!=0){
            x=-b/a;
            System.out.print("x=-b/a\nx="+x+"\n");

        }else if(a==0 && b!=0){
            System.out.print("Solucion imposible");
        }else if(a==0 && b==0){
            System.out.print("Solucion indeterminada  ");
        }

        System.out.print("\n\n");
    }
}    