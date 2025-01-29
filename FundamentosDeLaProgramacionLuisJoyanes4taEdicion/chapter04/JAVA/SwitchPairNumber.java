/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 09.-Se desea leer por teclado un numero comprendido entre 1 y 10 (inclusive) y se desea visualizar si el numero es par o impar.

    En primer lugar, se debera detectar si el numero esta comprendido en el rango valido (1 al 10) y a continuacion
    si el numero es 1, 3, 5, 7, 9, escribir mensaje "impar"); si es 2, 4, 6, 8 ,10, escribir un mensaje de "par" 
    
    ejemplo 4.11, Pagina 142
*/
import java.util.Scanner;
public class SwitchPairNumber{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;

        System.out.print("Se desea leer por teclado un numero comprendido entre 1 y 10 (inclusive) y se desea visualizar si el numero es par o impar.\n\n");
        System.out.print("Ingresa un numero: ");
        number=in.nextInt();

        switch(number){
            case 1: case 3: case 5: case 7: case 9:
                System.out.print("Numero "+number+" es impar.");
                break;
            case 2: case 4: case 6: case 8: case 10:    
                System.out.print("Numero "+number+" es par.");
                break;
            default:
                System.out.print("El numero "+number+" no esta en le rango permitido.");
                break;
        }
        System.out.print("\n\n");           
    }
}