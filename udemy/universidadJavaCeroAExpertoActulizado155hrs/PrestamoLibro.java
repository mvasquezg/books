import java.util.Scanner;

public class PrestamoLibro{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        final int DISTANCIA_BIBLIOTECA=3;

        System.out.println("*** Sistema de Prestamos de Libros***");
        
        System.out.print("Cuentas con credencial de estudiante? (true/false): ");
        var tienesCredencial=in.nextBoolean();

        System.out.print("A Cuantos kilometros vives de la biblioteca: ");
        var distancia=in.nextInt();

        var elegibleParaPrestamo= tienesCredencial  || distancia<=DISTANCIA_BIBLIOTECA;

        System.out.println("Eres para prestamo de libro?: "+elegibleParaPrestamo);


    }
}