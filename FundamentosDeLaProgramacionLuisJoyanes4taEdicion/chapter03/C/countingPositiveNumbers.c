/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
  Capitulo 03.-Estructura general de un programa.
  Problema 18.-Leer 500 numeros enteros y obtener cuantos son positivos.
*/

#include<stdio.h>
void main(){
    int countPositive=0, num=0, maxValue=15;

    printf("Leer 500 numeros enteros y obtener cuantos son positivos.\n\n");

    for(int i=1; i<=maxValue; i++){
        printf("%d.-Ingresa un numero: ", i);
        scanf("%d", &num);

        if(num>0){
            countPositive++;
        }
    }

    printf("\nDe %d valores, hay %d numeros positivos\n\n", maxValue, countPositive);
}   