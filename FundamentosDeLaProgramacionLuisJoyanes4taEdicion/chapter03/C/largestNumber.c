    /*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 15.-Elabora un programa que permita leer una serie de numeros distintos de cero (el ultimo numero de la serie es -99) y obtener el numero mayor. Como resultado se debe visualizar el numero mayor y un mensaje de indicacion de numero negativo, caso que se haya leido un numero negativo
*/
#include<stdio.h>
void main(){
    int largestNumber=0, number=0;

    printf("Programa que determina el numero mayor de una serie de numeros.\n\nPresione -99 para salir.\n\n");
    do{
        printf("Ingresa un numero: ");
        scanf("%d", &number);

        if(number>largestNumber){
            largestNumber=number;
        }

        if(number<0 && number!=-99){
            printf("%d numero negativo.\n", number);
        }

    }while(number!=-99);

    if(largestNumber!=0){
        printf("El numero mayor de la serie es: %d\n", largestNumber);
    }   
}