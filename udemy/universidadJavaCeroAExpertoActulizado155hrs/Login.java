import java.util.Scanner;

public class Login{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        final var USER="Miguel";
        final var PASS="123456";

        System.out.println("**** LOGIN ****");

        System.out.print("Usuario: ");
        var user=in.nextLine();

        System.out.print("Password: ");
        var pass=in.nextLine();

        System.out.println();
        if(user.equals(USER) && pass.equals(PASS)){
            System.out.println("Bienvenido al sistema: "+user);
        }else{
            
            if(user.equals(USER)){
                System.out.println("Contraseña Invalida. Ingresar la Contraseña Correcta.");   
            }else if(pass.equals(PASS)){
               System.out.println("Usuario Invalido. Ingresar el Usuario Correcto");    
            }else{
                System.out.println("Usuario y Contraseña Incorrectos. Ingresar los valores correctos.");
            }
        }
    }
}