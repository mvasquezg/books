/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 2: Algoritmos y diseños 
 *Programa 2: Elegir Figura utilizando la setencia iF para calcular el area de la misma.
*/
import java.util.Scanner;

public class ChooseFigure{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double area=0, radio=0, base=0, altura=0;
        int option=0;
        
        System.out.print("Ingrese un 1 o un 2.\n1.-Calcula el area del circulo\n2.-Calcula el area del rectangulo\nOpcion: ");
        option=in.nextInt();

        if(option==1){
            System.out.print("\nIngresa el radio del circulo: ");
            radio=in.nextDouble();

            area=3.1416*radio*radio;

            System.out.println("El area del circulo es: "+area);
        }else if(option==2){
            System.out.print("\nIngrese la base del rectangulo: ");
            base=in.nextInt();

            System.out.print("Ingrese la altura del rectangulo: ");
            altura=in.nextInt();

            area=base*altura;

            System.out.println("El area del Rectangulo es igual a: "+area);
        }else{
            System.out.println("\nHa elegido una opcion incorrecta.");
        }
    }
}