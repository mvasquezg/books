/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 24.-Calcular los N primeros multiplos de 4(inclusive), donde N es un valor introducido por el teclado.
*/
import java.util.Scanner;

public class MultiplesOfFour{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;

        System.out.print("Ingresa un numero, mayor i gual a 4: ");
        number=in.nextInt();

        System.out.print("\nLos multiplos de "+number+" son: \n");
        for(int i=4; i<=number; i++){
            if(i%4==0){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n\n");
    }
}