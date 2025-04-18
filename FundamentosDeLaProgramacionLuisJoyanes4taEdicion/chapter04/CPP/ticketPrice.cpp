/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Determinar el precio de un boleto de ida y vuelta en un avion, conociendo la distancia
    a recorrery sabiendo que si el numero de dias de estancia es superior a 7 dias y la distancia es superior a 800 km
    el boleto tiene una reeduccion del 30 por 100. El precio por Km es de 2.5 euros.
    Actividades de programacion Resueltas
    4.2, Pagina 151
*/
#include<iostream>
using namespace std;
#define PRICE_FOR_KM 2.5

int main(){
    int km=0, days=0;
    float discount=0, subtotal=0, total=0;

    cout<<"Programa que determina el precio de un boleto de ida y vuelta en un avion, conociendo la distancia a recorrer ";
    cout<<"y sabiendo que si el numero de dias de estancia es\nsuperior a 7 dias y la distancia es superior a 800 km"; 
    cout<<" el boleto tiene una reduccion del 30 por 100. El precio por Km es de 2.5 euros";

    cout<<"\n\nIngrese la distancia (KM) de recorrido del vuelo: ";
    cin>>km;
    cout<<"Ingrese los dias de estancia: ";
    cin>>days;

    subtotal=km*PRICE_FOR_KM;

    if(km>800 && days>7){
        discount=(subtotal*30)/100;
    }

    cout<<"\n\n******************* TOTAL A PAGAR *******************\n";
    cout<<"\nKM Recorridos: "<<km;
    cout<<"\nDias de estancia: "<<days;
    cout<<"\nSubtotal a pagar $: "<<subtotal;
    cout<<"\nDescuento en caso de aplicar $: "<<discount;
    cout<<"\nTotal a pagar $: "<<(subtotal-discount)<<"\n\n";
}