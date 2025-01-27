/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 07.-Se desea diseñar un algoritmo que escriba los nombres de los dias en función del valor de una variable
    DIA introducida por el teclado.

    Los días de la semana son 7: por consiguiente, el rango de los valores será 1 .. 7, y el caso que el día tome un valor 
    fuera de este rango se deberá producir un mensaje de error advirtiendo la situación anómala.  
    ejemplo 4.9, Pagina 141
*/
#include<stdio.h>
void main(){
    int day=0;
    printf("Ingresa un numero del 1 al 7, para indicar el dia del semana\nIngresa un numero: ");
    scanf("%d", &day);
    printf("\n");
    switch(day){
        case 1:
            printf("Lunes");
            break;
        case 2:
            printf("Martes");
            break;
        case 3:
            printf("Miercoles");
            break;
        case 4:
            printf("Jueves");
            break;
        case 5:
            printf("Viernes");
            break;
        case 6:
            printf("Sabado");
            break;
        case 7:
            printf("Domingo");
            break;
        default:
            printf("El numero ingresado no pertenece a algun dia de la semana.");
            break;                            
    }
    printf("\n\n");
}   