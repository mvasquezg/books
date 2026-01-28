import java.util.Scanner;

public class ClassScanner{
    public static void main(String[] args){
        //Introducir valores por consola
        var in=new Scanner(System.in);

        
        System.out.print("Ingresa tu nombre: ");
        var name=in.nextLine();

        System.out.println("Hola: "+name);

    }
}