/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 05.-Resolver las operaciones de los parentesis primero.
					
					1) A * (B + 3)
					
					2) (A*B) + 3
					
					3) A + (B + C) + D

					4) (A+B/C) + D
					
					5) A*B/C * D   
*/
import java.util.Scanner;
public class ParenthesisPriority{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=0, b=0, c=0, d=0;

        System.out.print("Ingresa el valor de A: ");
        a=in.nextInt();

        System.out.print("Ingresa el valor de B: ");
        b=in.nextInt();

        System.out.print("Ingresa el valor de C: ");
        c=in.nextInt();

        System.out.print("Ingresa el valor de D: ");
        d=in.nextInt();

        System.out.print("\nA * (B + 3) = "+(a*(b+3))+"\n\n");
					
	    System.out.print("(A * B) + 3 = "+((a * b) + 3)+"\n\n");
					
	    System.out.print("A + (B + C) + D = "+(a + (b + c) + d)+"\n\n"); 

	    System.out.print("(A+B/C) + D = "+((a+b/c) + d)+"\n\n");
					
	    System.out.print("A*B/C*D = "+(a*b/c*d)+"\n\n");
    }
}