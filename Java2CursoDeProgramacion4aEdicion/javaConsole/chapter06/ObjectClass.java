/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 01: Determinar la clase que pertence a un objeto
*/
import java.io.IOException;

public class ObjectClass{
    public static void main(String[] args){
        int n;

        try{    
            System.out.print("Dato: ");
            n=System.in.read();
            System.out.println((char)n);

            Class objectClass;
            objectClass=System.in.getClass();
            System.out.println("Clase de in: "+objectClass.getName());

            objectClass=System.out.getClass();
            System.out.println("Clase de out: "+objectClass.getName());

            objectClass=System.err.getClass();
            System.out.println("Clase de err: "+objectClass.getName());
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());

        }
    }
}