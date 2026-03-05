import java.util.Scanner;
public class ReservaHotelV1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        final var VISTA_AL_MAR=190.50;
        final var NO_VISTA_AL_MAR=150.50;

        System.out.print("*** Sistema Reserva de Hotel***\n\nCliente: ");
        var customerName=in.nextLine();
        System.out.print("Dias de estancia: ");
        var stayDays=in.nextInt();
        System.out.print("Vista al mar (true/false): ");
        var isViewSea=in.nextBoolean();

        var total=isViewSea?(VISTA_AL_MAR*stayDays):(NO_VISTA_AL_MAR*stayDays);
        
        System.out.println("\n\n------------- Detalles de la Reservacion -------------\nCliente: "+customerName);
        System.out.println("Dias de estancia: "+stayDays);
        System.out.println("Vista al mar: "+(isViewSea?"Si :)":"No :("));
        System.out.println("Precio por noche: "+(isViewSea?VISTA_AL_MAR:NO_VISTA_AL_MAR));
        System.out.println("Total a Pagar: "+total);
        
    
    
    }
}