/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 3: Fundamentos de Java 
 *Programa 12: Uso de los metodos de la clase Scanner y el metodo charAt.
 */
import java.util.Scanner;

public class ScannerCharAt{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String name;
        String lastName;

        System.out.print("Ingresa tu nombre: ");
        name=in.nextLine();

        System.out.print("Ingresa tu apellido: ");
        lastName=in.nextLine();

        System.out.println("Sus iniciales son: "+name.charAt(0)+" "+lastName.charAt(0));

        
    }
}