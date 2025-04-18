/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Determinar el precio de un boleto de ida y vuelta en un avion, conociendo la distancia
    a recorrery sabiendo que si el numero de dias de estancia es superior a 7 dias y la distancia es superior a 800 km
    el boleto tiene una reeduccion del 30 por 100. El precio por Km es de 2.5 euros.
    Actividades de programacion Resueltas
    4.2, Pagina 151
*/
#include<stdio.h>
#define PRICE_FOR_KM 2.5

void main(){
    int km=0, days=0;
    float discount=0, subtotal=0, total=0;

    printf("Programa que determina el precio de un boleto de ida y vuelta en un avion, conociendo la distancia a recorrer ");
    printf("y sabiendo que si el numero de dias de estancia es\nsuperior a 7 dias y la distancia es superior a 800 km"); 
    printf(" el boleto tiene una reduccion del 30 por 100. El precio por Km es de 2.5 euros");

    printf("\n\nIngrese la distancia (KM) de recorrido del vuelo: ");
    scanf("%d", &km);
    printf("Ingrese los dias de estancia: ");
    scanf("%d", &days);

    subtotal=km*PRICE_FOR_KM;

    if(km>800 && days>7){
        discount=(subtotal*30)/100;
    }

    printf("\n\n******************* TOTAL A PAGAR *******************\n");
    printf("\nKM Recorridos: %d", km);
    printf("\nDias de estancia: %d", days);
    printf("\nSubtotal a pagar $: %1.2f", subtotal);
    printf("\nDescuento en caso de aplicar $: %1.2f", discount);
    printf("\nTotal a pagar $: %1.2f\n\n", (subtotal-discount));
}