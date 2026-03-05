import java.util.Scanner; 

public class EstacionAnhoSwitch{
    public static void main(String[] args){ 
        Scanner in=new Scanner(System.in);
        byte month=0;
        var message="\nLa estacion del año es ";
        
        System.out.print("*** Estaciones del año ***\n\nIngresa un mes con numero del 1-12: ");
        month=in.nextByte();
         
        var estacion=switch(month) { 
            case 1, 2, 12 -> "Invierno.";
            case 3, 4,  5  -> "Primavera.";
            case 6, 7,  8  -> "Verano.";
            case 9, 10, 11 -> "Otoño.";
            default -> "Estacion desconocida.";
        };

        message+=estacion;
        System.out.println(message);
    }
}