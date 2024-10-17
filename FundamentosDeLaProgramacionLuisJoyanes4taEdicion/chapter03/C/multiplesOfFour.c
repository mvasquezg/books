/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 24.-Calcular los N primeros multiplos de 4(inclusive), donde N es un valor introducido por el teclado.
*/
#include<stdio.h>

void main(){
    int number=0;

    printf("Ingresa un numero, mayor i gual a 4: ");
    scanf("%d", &number);

    printf("\nLos multiplos de %d son: \n", number);
    for(int i=4; i<=number; i++){
        if(i%4==0){
            printf("%d ", i);
        }
    }
    printf("\n\n");
}