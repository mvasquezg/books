/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 3: Fundamentos de Java 
 *Programa 11: Uso de la clase Scanner y sus metodos
 */

import java.util.Scanner;

public class PrintPurchaseOrderQuantity{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        double price;
        int quantity;

        System.out.print("Precio de compra del articulo: ");
        price=in.nextDouble();

        System.out.print("Cantidad de articulos: ");
        quantity=in.nextInt();

        System.out.println("Total de la orden la compra: $ " +(price*quantity));
    }
}