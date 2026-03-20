import java.util.Scanner;

public class ValidatePassword{
    public static void main(String[] arsg){
        Scanner in=new Scanner(System.in);
        String pass;
        System.out.println("*** Programa que valida la creacion de una contraseña de lamenos 6 caracteres ***");
        
        do{
            System.out.print("Ingresa una contraseña de al menos 6 caractres: ");
            pass=in.nextLine();
        }while(pass.length()<6);
        
        System.out.println("Contraseña valida.\n");
    }
}