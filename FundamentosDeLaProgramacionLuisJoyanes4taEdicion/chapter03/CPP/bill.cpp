/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 19.-Se trata de escribir el algoritmo que permita emitir la factura correspondiente a una compra de un articulo determinado, 
    del que se adquieren una o varia unidades. El iva a aplicar es el del 15 por 100 y si el precio bruto 
    (precio de venta mas iva) es mayor a 1000 euros, se debe realizar un descuento del 5 por 100.
*/

#include<iostream>
using namespace std;

int main(){
    int amount=0, idProduct=0;
    float price=0, subTotal=0, total=0, iva=0, discount=0;

    cout<<"Ingresa la clave del producto: ";
    cin>>idProduct;

    cout<<"\nIngresa el precio del producto: ";
    cin>>price;

    cout<<"Ingresa la cantidad de productos aquiridos: ";
    cin>>amount;

    subTotal=price*amount;

    iva=subTotal*0.15;
    
    total=subTotal+iva;

    if(total>1000){
        discount=(total*0.05);
    }

    cout<<"\nId del producto: "<<idProduct<<"\n";
    cout<<"precio del producto: "<<price<<"\n";
    cout<<"Cantidad del producto: "<<amount<<"\n";
    cout<<"Subtotal: $ "<<subTotal<<"\n";
    cout<<"IVA: $ "<<iva<<"\n";
    cout<<"Total a pagar: $ "<<total<<"\n";
    cout<<"\nEl descuento del 5 por cien aplica en la compra mayor a 1000.\nTotal a pagar con descuento: $ "<<(total-discount)<<"\n";
}
