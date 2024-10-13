/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 19.-Se trata de escribir el algoritmo que permita emitir la factura correspondiente a una compra de un articulo determinado, 
    del que se adquieren una o varia unidades. El iva a aplicar es el del 15 por 100 y si el precio bruto 
    (precio de venta mas iva) es mayor a 1000 euros, se debe realizar un descuento del 5 por 100.
*/
using System;
class Bill{
    public static void Main(string[] args){
        int amount=0, idProduct=0;
        double price=0, subTotal=0, total=0, iva=0, discount=0;

        System.Console.Write("Ingresa la clave del producto: ");
        idProduct=int.Parse(System.Console.ReadLine());

        System.Console.Write("\nIngresa el precio del producto: ");
        price=float.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa la cantidad de productos aquiridos: ");
        amount=int.Parse(System.Console.ReadLine());

        subTotal=price*amount;

        iva=subTotal*0.15;

        total=subTotal+iva;

        if(total>1000){
            discount=(total*0.05);
        }

        System.Console.Write("\nId del producto: "+idProduct+"\n");
        System.Console.Write("precio del producto: "+price+"\n");
        System.Console.Write("Cantidad del producto: "+amount+"\n");
        System.Console.Write("Subtotal: $ "+subTotal+"\n");
        System.Console.Write("IVA: $ "+iva+"\n");
        System.Console.Write("Total a pagar: $ "+total+"\n");
        System.Console.Write("\nEl descuento del 5 por cien aplica en la compra mayor a 1000.\nTotal a pagar con descuento: $ "+(total-discount)+"\n");
    }
}