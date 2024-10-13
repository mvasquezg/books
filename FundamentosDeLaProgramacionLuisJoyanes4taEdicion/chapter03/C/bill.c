/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 19.-Se trata de escribir el algoritmo que permita emitir la factura correspondiente a una compra de un articulo determinado, 
    del que se adquieren una o varia unidades. El iva a aplicar es el del 15 por 100 y si el precio bruto 
    (precio de venta mas iva) es mayor a 1000 euros, se debe realizar un descuento del 5 por 100.
*/

#include<stdio.h>
void main(){
    int amount=0, idProduct=0;
    float price=0, subTotal=0, total=0, iva=0, discount=0;

    printf("Ingresa la clave del producto: ");
    scanf("%d", &idProduct);

    printf("\nIngresa el precio del producto: ");
    scanf("%f", &price);

    printf("Ingresa la cantidad de productos aquiridos: ");
    scanf("%d", &amount);

    subTotal=price*amount;

    iva=subTotal*0.15;
    
    total=subTotal+iva;

    if(total>1000){
        discount=(total*0.05);
    }

    printf("\nId del producto: %d\n", idProduct);
    printf("precio del producto: %f\n", price);
    printf("Cantidad del producto: %d\n", amount);
    printf("Subtotal: $ %f\n", subTotal);
    printf("IVA: $ %f\n", iva);
    printf("Total a pagar: $ %f\n", total);
    printf("\nEl descuento del 5 por cien aplica en la compra mayor a 1000.\nTotal a pagar con descuento: $ %f\n", (total-discount));
}
