/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Determinar el precio de un boleto de ida y vuelta en un avion, conociendo la distancia
    a recorrery sabiendo que si el numero de dias de estancia es superior a 7 dias y la distancia es superior a 800 km
    el boleto tiene una reeduccion del 30 por 100. El precio por Km es de 2.5 euros.
    Actividades de programacion Resueltas
    4.2, Pagina 151
*/
import java.util.Scanner;

public class TicketPrice{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float PRICE_FOR_KM=2.5f;

        int km=0, days=0;
        float discount=0f, subtotal=0f;

        System.out.print("Programa que determina el precio de un boleto de ida y vuelta en un avion, conociendo la distancia a recorrer ");
        System.out.print("y sabiendo que si el numero de dias de estancia es\nsuperior a 7 dias y la distancia es superior a 800 km"); 
        System.out.print(" el boleto tiene una reduccion del 30 por 100. El precio por Km es de 2.5 euros");

        System.out.print("\n\nIngrese la distancia (KM) de recorrido del vuelo: ");
        km=in.nextInt();
        System.out.print("Ingrese los dias de estancia: ");
        days=in.nextInt();

        subtotal=km*PRICE_FOR_KM;

        if(km>800 && days>7){
            discount=(subtotal*30)/100;
        }

        System.out.print("\n\n******************* TOTAL A PAGAR *******************\n");
        System.out.print("\nKM Recorridos: "+km);
        System.out.print("\nDias de estancia: "+days);
        System.out.print("\nSubtotal a pagar $: "+subtotal);
        System.out.print("\nDescuento en caso de aplicar $: "+discount);
        System.out.print("\nTotal a pagar $: "+(subtotal-discount)+"\n\n");
    }
}