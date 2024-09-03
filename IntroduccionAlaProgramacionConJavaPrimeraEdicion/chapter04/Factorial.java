/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 9: Uso del bucle for, con el emeplo del factorial de un numero.
 */
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;
        double factorial=1.0;

        System.out.print("Introduzca un numero entero: ");
        number=in.nextInt();

        for(int i=2; i<=number; i++){
            factorial*=i;
        }

        System.out.println(number+"! = "+factorial);
        


    }
}