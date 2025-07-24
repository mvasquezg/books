/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 32.-Escriba un programa que simule el funcionamiento normal de un ascensor (elevador) moderno 
                con 25 pisos (niveles) y que posee dos botones de SUBIR y BAJAR, 
                excepto en el piso (nivel) inferior, que sólo existe botón de llamada para SUBIR 
                y en el último piso (nivel) que sólo existe botón de BAJAR.

    Pagina 156
*/

#include<stdio.h>
void main(){
    int floor=1, option;

    do{
        if(floor==1){
            option=2;
            printf("\nSe encuentra en el piso: %d\nIngresa el numero de piso 2-25. 0 para salir: ", floor);
            scanf("%d", &floor);
        }
        
        
        if(floor==25){
            option=1;
            printf("\nSe encuentra en el piso: %d\nIngresa un numero de piso 1-24. 0 para salir: ", floor);
            scanf("%d", &floor);
        }
        
        if (floor>1 && floor<25){
            printf("\nSe encuentra en el piso: %d\n0.Salir\n1.-Bajar\n2.-Subir\nPresione alguna opcion: ", floor);
            scanf("%d", &option);
        }

        if(option!=0){
            printf("\nIngresa el numero de piso al que desa ir:");
            scanf("%d", &floor);
        }   
    }while(option!=0);
}