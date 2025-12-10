/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 03: Leer fecha entera mes y año y mostrar los dias del mes. 
*/
import java.util.Scanner;

public class MonthDay{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int day=0, month=0, year=0;

        System.out.print("Ingrese el mes del 1-12: ");
        month=in.nextInt();

        System.out.print("Ingrese el año: ");
        year=in.nextInt();

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day=31;
                break;
            case 4: case 6: case 9: case 11:
                day=30;
                break;
            case 2:
                //El año es boisiesto
                if( (year%4==0) && (year % 100 != 0 ) || (year % 400==0))
                    day=29;
                else
                    day=28;
                break;    
            default:
                System.out.print("El mes no es valido");
                break;                        
        }//end switch

        if(month>=1 && month<=12){
            System.out.println("\nEl Mes "+month+" del año "+year+" tiene "+day+" dias.");
        }
    }
}