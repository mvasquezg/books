
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 23.-Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo.

    Ejercicios
    4.1 (e) Pagina 155
*/
#include<stdio.h>
void main(){

    int distance=0, time=0;

    printf("programa Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo: ");

    printf("\n\nIngresa la distancia: ");
    scanf("%d", &distance);

    if(distance>20 && distance<35){
        printf("ingresa el tiempo: ");
        scanf("%d", &time);
    }

    printf("\nLos valores son:\nDistancia = %d\nTiempo = %d\n\n", distance, time);

}