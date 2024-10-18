/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 26.-Dado 10 numeros enteros, visualizar los numeros pares de la lista, 
    cuantos numeros pares existen y cual es la media aritmetica de los numeros impares.
*/
#include<stdio.h>
void main(){
    int num=0, sumPairs=0, sumOfOdd=0, countPairs=0, countOdd=0;
    float averageOdd;

    for(int i=1; i<=10; i++){
        printf("%d.-Ingresa un numero: ", i);
        scanf("%d", &num);

        if(num%2==0){
            countPairs++;
            sumPairs+=num;
            printf("%d es numero par.\n", num);
        }else{
            countOdd++;
            sumOfOdd+=num;
        }
    }

    averageOdd=sumOfOdd/countOdd;
    printf("\nEn total se capturaron: %d numero pares.\nEl promedio de los numeros impares es: %f\n", countPairs, averageOdd);
}