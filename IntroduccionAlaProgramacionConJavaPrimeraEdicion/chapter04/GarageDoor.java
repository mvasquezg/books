/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 11: Uso de variable tipo boolean
 */
import java.util.Scanner;

public class GarageDoor{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String capture;
        boolean directionUp=true;
        boolean moving=false;

        System.out.println("SIMULACION DE APERTURA DE PUERTA DE COCHERA");

        do{
            System.out.print("Presione Enter, o intruduzca 's' para salir: ");
            capture=in.nextLine();

            if(capture.equals("")){
                moving=!moving;

                if(moving){
                    if(directionUp){
                        System.out.println("Moviendo hacia arriba");
                    }else{
                        System.out.println("Moviendo hacia abajo");
                    }
                }else{
                    System.out.println("Detenida");
                    directionUp=!directionUp;
                }
            }

        }while(capture.equals(""));
    }
}