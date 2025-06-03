/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 24.-Escribir un programa que solicite al usuario introducir dos números. Si el primer número introducido es mayor que el segundo número, 
    el programa debe imprimir el mensaje El primer número es el mayor, en caso contrario el programa debe imprimir el mensaje El primer número es el más 
    pequeño. Considerar el caso de que ambos números sean iguales e imprimir el correspondiente mensaje.
    
    Pagina 155
*/
#include<stdio.h>
void main(){
    int num1=0, num2=0;

    printf("Programa que solicita al usuario introducir dos números. Si el primer número introducido es mayor que el segundo número,"); 
    printf(" el programa debe imprimir el mensaje\nEl primer número es el mayor, en caso contrario el programa debe imprimir el mensaje ");
    printf("El primer número es el más pequeño. Considerar el caso de que ambos números sean iguales\ne imprimir el correspondiente mensaje.\n\n");

    printf("Ingresa el primer numero: ");
    scanf("%d", &num1);

    printf("Ingresa el segundo numero: ");
    scanf("%d", &num2);

    printf("\n");
    if(num1==num2){
        printf("El numero 1 y el numero 2 son iguales.");
    }else if(num1>num2){
        printf("El primer numero es el mayor");
    }else{
        printf("El primer numero es el mas pequeño");
    }
    printf("\n\n");
}

