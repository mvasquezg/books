import java.util.Scanner;

public class DescuentoVip{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        final int NUM_ITEM_DISCOUNT=10;
        int numItem=0;
        boolean membresia=false;
        System.out.println("*** Descuento VIP ***");

        System.out.print("Cuantos productos compraste hoy: ");
        numItem=in.nextInt();

        System.out.print("¿Tienes la membresia de la tienda? (true/false): ");
        membresia=in.nextBoolean();

        var esElegibleVIP= numItem>=NUM_ITEM_DISCOUNT && membresia;

        System.out.println("¿Tienes acceso al descuento VIP?: "+esElegibleVIP);

    }
}