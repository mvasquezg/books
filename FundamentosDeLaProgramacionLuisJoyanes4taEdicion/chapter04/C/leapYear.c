/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 05.-Estructura selectiva para para averiguar si un año es o no bisiesto.
    Regla para obtener el año bisiesto:
    1.-Todos los año son divisibles entre 4.
    2.-Aquellos años que son divisibles entre 4, pero no entre 100, son bisiestos.
    3.-Los años que son divisibles entre 100, pero no entre 400, no son bisiestos.
    4.-Sin embargo, los años divisibles entre 100 y entre 400 sí que son bisiestos.
    ejemplo 4.7, pagina 136-137
*/
#include<stdio.h>
void main(){
    int year=0;
    printf("Programa que determina si un año es bisiesto.\n\n");
    printf("Ingrese el anho: ");
    scanf("%d", &year);
    
    if(year%4==0){
         printf("\n%d es un anho Bisiesto.\n", year);
    }else if(year%100==0){
        if(year%400==0){
            printf("\n%d es un anho Bisiesto.\n", year);
        }else{
             printf("\n%d es un anho no Bisiesto.\n", year);
        }
    }else{
         printf("\n%d es un anho no Bisiesto.\n", year);
    }
    printf("\n\n");
    
}