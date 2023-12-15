/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 04.Un cliente ejecuta un pedido a una fábrica. La fábrica examina en su banco de datos la ficha del cliente, 
    si el cliente es solvente entonces la empresa acepta el pedido; en caso contrario, rechazará el pedido.
*/

#include<iostream>
using namespace std;

int main(){
    
    int statusCustomer=0; //Cliente status 1= solvente

    cout<<"Pedido leido\n";

    if(statusCustomer==1){
        cout<<"Pedido aprobado\n";
    }else{
        cout<<"Pedido rechazado\n";
    }   
}