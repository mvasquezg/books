import java.util.Scanner;

public class StoreOnline{
    public static void main(String[] args) {
        final int LIMIT_AMOUNT=1000;
        Scanner in=new Scanner(System.in);

        double amount;
        boolean member;
        double discount;

        System.out.println("*** Tienda en Linea con Descuento ***");
        System.out.print("¿Cual fue el monto de compra: ");
        amount=in.nextInt();
        System.out.print("¿Eres miembro de la tienda?: ");
        member=in.nextBoolean();

        if(amount>=LIMIT_AMOUNT && member){
            discount=10;
        }else if(amount<LIMIT_AMOUNT && member){
            discount=5;
        }else{
            discount=0;
        }

        double subototal=(amount*(discount/100));

        if(discount>0){
            System.out.println("\nFelicidades, ha obtenido un descuento del "+discount+"%");
            System.out.println("Monto de la compra: $ "+amount);
            System.out.println("Descuento de la compra: $ "+subototal);
            System.out.println("Monto final de la compra con descuento: $ "+(amount-subototal));
        } else{
            System.out.println("\nNo obtuvistes ningun tipo de descuento ");
            System.out.println("Te invitamos a hacerte miembor de la tienda");
            System.out.println("Monto final de la compra: $ "+amount);
        }   
    }
}