/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 6: Uso de la setencia Switch.
 */
import java.util.Scanner;

public class UseSwitch{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String cp;
        
        System.out.print("Ingre el codigo postal: ");
        cp=in.nextLine();

        switch(cp.charAt(0)){
            case '0': case '2': case '3':
                System.out.println(cp+" esta en la costa Este");
                break;
            case '4': case '5': case '6':
                System.out.println(cp+" esta en el area del Plano Central");
                break;
            case '7':
                System.out.println(cp+" esta en el Sur");
                break;
            case '8': case '9':
                System.out.println(cp+" esta en el Oeste");
                break;
            default:
                System.out.println("Codigo postal invalido");                  
        }

    }   
}