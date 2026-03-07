import java.util.Scanner;

public class MenuInterativo{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        var option=0;
        
        do{

            System.out.print("*** Menu ***\n\n1.-Crear Cuenta\n2.-Eliminar Cuenta\n3.-Salir\nOpcion: ");
            option=in.nextInt();

            switch(option){
                case 1:
                    System.out.println("\nCreando tu cuenta.\n");
                    break;
                case 2:
                    System.out.println("\nEliminado tu cuenta.\n");
                    break;
                default:
                    System.out.println("\nSaliendo del Sistema. ¡Hasta Pronto!\n");        
            }
        }while(option<3);

        System.out.println("\nSaliendo Sistema Administracion de Cuentas\n\n");
    }
}