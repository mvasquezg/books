/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 12.-Algoritmo que nos indique si un numero entero leido de teclado tiene 1, 2, 3 o mas digitos. Considerar los negativos.
    ejemplo 4.14, Pagina 144
*/
import java.util.Scanner;
public class ThreeDigits{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;
        System.out.print("Programa que nos indica si un numero entero leido de teclado tiene 1, 2, 3 o mas digitos. Considera los negativos.\n\n");
        
        System.out.print("Ingrese un numero: ");
        number=in.nextInt();

        if((number>=0 && number<10) || (number>-10 && number<=0)){
            System.out.print("El numero "+number+" tiene una cifra");
        }else if((number>=10 && number<100) || (number<=-10 && number>-100)){
            System.out.print("El numero "+number+" tiene dos cifras");
        }else if((number>=100 && number<1000) || (number<=-100 && number>-1000)){
            System.out.print("El numero "+number+" tiene tres cifras");
        }else{
            System.out.print("El numero "+number+" tiene mas de tres cifras");
        }
        System.out.print("\n\n");
    }
}