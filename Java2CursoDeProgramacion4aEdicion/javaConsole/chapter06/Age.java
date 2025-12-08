/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 09: Programa que calcula la edad de una persona en el año 2030 dado el nombre y la fecha de nacimiento
*             
*/
import java.util.Scanner;

public class Age{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int age=0;
        String name="";

        System.out.print("Ingresa el nombre: ");
        name=in.next();

        System.out.print("Ingrese la fecha de nacimiento: ");
        age=in.nextInt();

        System.out.print("Hola "+name+" tu edad en el año 2030 es de "+(2030-age)+" años\n");


    }
}