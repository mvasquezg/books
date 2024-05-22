/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 3: Fundamentos de Java 
 *Programa 10: Uso de la clase Scanner
 */

import java.util.Scanner;

public class ScannerClass{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String name;

        System.out.print("Ingresa tu nombre: ");
        name=in.nextLine();

        System.out.println("Hola ¡ " +name+" ! ");
    }
}
