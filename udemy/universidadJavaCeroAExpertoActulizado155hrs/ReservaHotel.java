public class ReservaHotel{
    public static void main(String[] args){
        String customerName="Miguel Vasquez";
        int stayDays=5;
        double priceForDay=250;
        boolean isViewSea=true;

        System.out.println("Cliente: "+customerName);
        System.out.println("Dias de estancia: "+stayDays);
        System.out.println("Precio por noche: "+priceForDay);
        System.out.println("Vista al mar: "+(isViewSea?"Si":"No"));

        customerName="Pedro Rodriguez";
        stayDays=7;
        priceForDay=200;
        isViewSea=false;

        System.out.println("\nCliente: "+customerName);
        System.out.println("Dias de estancia: "+stayDays);
        System.out.println("Precio por noche: "+priceForDay);
        System.out.println("Vista al mar: "+(isViewSea?"Si":"No"));
    
    
    }
}