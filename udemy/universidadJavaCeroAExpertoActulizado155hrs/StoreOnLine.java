public class StoreOnLine{
    public static void main(String[] args){
        String productName="Coca cola";
        double price=25.50;
        int stock=50;
        boolean isStock=true;

        System.out.println("Producto: "+productName);
        System.out.println("Precio: "+price);
        System.out.println("Cantidad Disponible: "+stock);
        System.out.println("Disponible para venta: "+(isStock?"Si":"No"));

        productName="Doritos Nachos";
        price=20;
        stock=0;
        isStock=false;

        System.out.println();

        System.out.println("Producto: "+productName);
        System.out.println("Precio: "+price);
        System.out.println("Cantidad Disponible: "+stock);
        System.out.println("Disponible para venta: "+(isStock?"Si":"No"));

    }
}