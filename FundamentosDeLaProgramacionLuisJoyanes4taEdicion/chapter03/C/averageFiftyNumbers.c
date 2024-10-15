/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 23.-Calcular la media de 50 numeros e imprimir el resultado
*/
#include<stdio.h>

//constante
#define maxValue 50

void main(){
    int number=0, sum=0;
    float average=0;

    for(int i=1; i<=maxValue; i++){
        printf("%d.-Ingresa un numero: ", i);
        scanf("%d", &number);
        sum+=number;
    }

    average=sum/maxValue;

    printf("Suma: %d\nPromedio: %f\n", sum, average);
}