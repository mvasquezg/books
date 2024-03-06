/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 04.-Convertir en expresiones aritméticas algorítmicas las siguientes expresiones algebraicas:
					
					1) 5 ∙ (x + y)
					
					2) x + y/ (u+ w/a)
					
					3) a^2 + b^2
					
					4) x/y * (z + w)   
*/  
import java.util.Scanner;
class Expressions03{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=0, b=0, u=0, w=0, x=0, y=0, z=0;

        System.out.print("Ingresa el valor de a: ");
        a=in.nextInt();

        System.out.print("Ingresa el valor de b: ");
        b=in.nextInt();

        System.out.print("Ingresa el valor de u: ");
        u=in.nextInt();    

        System.out.print("Ingresa el valor de w: ");
        w=in.nextInt();

        System.out.print("Ingresa el valor de x: ");
        x=in.nextInt();

        System.out.print("Ingresa el valor de y: ");
        y=in.nextInt();

        System.out.print("Ingresa el valor de z: ");
        z=in.nextInt();

        System.out.print("\n5 ∙ (x + y) = "+(5*(x+y))+"\n\n");
        System.out.print("a^2 + b^2 = "+(Math.pow(a, 2)+Math.pow(b, 2))+"\n\n");
        System.out.print("x + y / (u + w/a) = "+((x+y)/(u+(w/a))+"\n\n"));
        System.out.print("x/y * (z + w)  = "+((x/y)*(z+w))+"\n\n");
    }
}