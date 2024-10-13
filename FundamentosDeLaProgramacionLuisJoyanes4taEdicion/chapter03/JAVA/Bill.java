/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 19.-Se trata de escribir el algoritmo que permita emitir la factura correspondiente a una compra de un articulo determinado, 
    del que se adquieren una o varia unidades. El iva a aplicar es el del 15 por 100 y si el precio bruto 
    (precio de venta mas iva) es mayor a 1000 euros, se debe realizar un descuento del 5 por 100.
*/
import java.util.Scanner;
public class Bill{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int amount=0, idProduct=0;
        double price=0, subTotal=0, total=0, iva=0, discount=0;

        System.out.print("Ingresa la clave del producto: ");
        idProduct=in.nextInt();;

        System.out.print("\nIngresa el precio del producto: ");
        price=in.nextDouble();;

        System.out.print("Ingresa la cantidad de productos aquiridos: ");
        amount=in.nextInt();;

        subTotal=price*amount;

        iva=subTotal*0.15;

        total=subTotal+iva;

        if(total>1000){
            discount=(total*0.05);
        }

        System.out.print("\nId del producto: "+idProduct+"\n");
        System.out.print("precio del producto: "+price+"\n");
        System.out.print("Cantidad del producto: "+amount+"\n");
        System.out.print("Subtotal: $ "+subTotal+"\n");
        System.out.print("IVA: $ "+iva+"\n");
        System.out.print("Total a pagar: $ "+total+"\n");
        System.out.print("\nEl descuento del 5 por cien aplica en la compra mayor a 1000.\nTotal a pagar con descuento: $ "+(total-discount)+"\n");
    }
}