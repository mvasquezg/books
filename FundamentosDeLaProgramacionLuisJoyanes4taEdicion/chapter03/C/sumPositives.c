/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 29.-Escribir un algoritmo que lea los datos de entrada de un archivo que solo contien numeros y sume los numeros positivos.
*/
#include<stdio.h>
void main(){
    int sum=0, num=0;
    printf("Programa que calcula la suma de los numeros positivos, presione -99 para salir:\n");
    do{
        printf("\nIngrese un numero: ");
        scanf("%d", &num);

        if(num>0){
            sum+=num;
        }

    }while(num!=-99);

    printf("La suma de todos o numeros positivos es: %d\n\n", sum);
}   