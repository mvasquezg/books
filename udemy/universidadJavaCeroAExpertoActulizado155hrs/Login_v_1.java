import java.util.Scanner;

public class Login_v_1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        final var USER="Pedro";
        final var PASS="123";

        System.out.println("**** LOGIN ****");

        System.out.print("Usuario: ");
        var user=in.nextLine();

        System.out.print("Password: ");
        var pass=in.nextLine();

        System.out.println();
        var message=switch(user){
            case USER ->{
                if(PASS.equals(pass))
                    yield "Bienvenido al Sistema";
                else
                    yield "Password icncorrecto, favor de corregirlo";
            
            }

            default ->{
                if(PASS.equals(pass))
                    yield "Usuario Incorrecto, favor de corregirlo";
                else
                    yield "Usuario y Password incorrectos, favor de corregirlos";
            }
       };

       System.out.println(message);

    }
}