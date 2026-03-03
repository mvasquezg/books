import java.util.Scanner;

public class Autenticacion{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        final var USER="Admin";
        final var PASS=123456;

        System.out.println("*** Sistema de Autenticacion ***");

        System.out.print("Ingrese su usuario: ");
        var user=in.nextLine();

        System.out.print("Ingrese su contraseña: ");
        var pass=in.nextInt();

        System.out.println("¿Los datos son correctos?: "+(user.equalsIgnoreCase(USER) && (pass==PASS)));
        


    }
}