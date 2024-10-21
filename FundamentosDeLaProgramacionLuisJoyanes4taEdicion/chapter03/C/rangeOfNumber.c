/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 30.-Desarrollar un algoritmo que determine en un conjunto de cien numeros naturales:
    ¿Cuantos son menores de 15?
    ¿Cuantos con mayores a 50?
    ¿Cuantos estan comprendidos entre 25 y 45?
*/
#include<stdio.h>
void main(){
    int count15=0, countBetween2545=0, count50=0;

    for(int i=1; i<=100; i++){
        if(i<15){
            count15++;
        }

        if(i>25 && i<45){
            countBetween2545++;
        }

        if(i>50){
            count50++;
        }
    } 
    printf("Numero mayores a 15: %d\nNumeros entre 25 y 45: %d\nNumero mayor a 50: %d\n\n", count15, countBetween2545, count50);
}