/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Determinar el precio de un boleto de ida y vuelta en un avion, conociendo la distancia
    a recorrery sabiendo que si el numero de dias de estancia es superior a 7 dias y la distancia es superior a 800 km
    el boleto tiene una reeduccion del 30 por 100. El precio por Km es de 2.5 euros.
    Actividades de programacion Resueltas
    4.2, Pagina 151
*/
using System;

public class TicketPrice{

    public static void Main(string[] args){
        float PRICE_FOR_KM=2.5f;

        int km=0, days=0;
        float discount=0f, subtotal=0f;

        System.Console.Write("Programa que determina el precio de un boleto de ida y vuelta en un avion, conociendo la distancia a recorrer ");
        System.Console.Write("y sabiendo que si el numero de dias de estancia es\nsuperior a 7 dias y la distancia es superior a 800 km"); 
        System.Console.Write(" el boleto tiene una reduccion del 30 por 100. El precio por Km es de 2.5 euros");

        System.Console.Write("\n\nIngrese la distancia (KM) de recorrido del vuelo: ");
        km=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingrese los dias de estancia: ");
        days=int.Parse(System.Console.ReadLine());

        subtotal=km*PRICE_FOR_KM;

        if(km>800 && days>7){
            discount=(subtotal*30)/100;
        }

        System.Console.Write("\n\n******************* TOTAL A PAGAR *******************\n");
        System.Console.Write("\nKM Recorridos: "+km);
        System.Console.Write("\nDias de estancia: "+days);
        System.Console.Write("\nSubtotal a pagar $: "+subtotal);
        System.Console.Write("\nDescuento en caso de aplicar $: "+discount);
        System.Console.Write("\nTotal a pagar $: "+(subtotal-discount)+"\n\n");
    }
}