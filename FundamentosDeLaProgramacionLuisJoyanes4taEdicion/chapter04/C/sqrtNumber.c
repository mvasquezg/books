/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 26.-Calcular la raíz cuadrada de un número y escribir su resultado. Considerando el caso en que el número sea negativo.

    Ejercicios:
    4.4  página 155 
*/
#include<stdio.h>
#include<math.h>

void main(){
    float num=0;
    printf("programa que calcula la raíz cuadrada de un número y escribir su resultado. Considerando el caso en que el número sea negativo.");
    printf("\n\nIngresa un numero: ");
    scanf("%f", &num);

    printf("\n");
    if(num<=0){
        printf("El numero ingresado no tiene raiz cuadrada.");
    }else{
        printf("La raiz cuadrada de %f es igual a: %f", num, sqrt(num));
    }

    printf("\n\n");
}