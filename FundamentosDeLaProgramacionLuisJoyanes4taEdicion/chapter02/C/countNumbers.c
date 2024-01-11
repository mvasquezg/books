/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 21.Diseñar un algoritmo que lea y visualice una serie de números distintos de cero. 
    El algoritmo debe terminar con un valor cero que no se debe visualizar. 
    Visualizar el número de valores leídos.
*/
#include<stdio.h>
int main(){
    int number=0;
    int countNumbers=0;

    do{
        printf("Ingresa un numero: ");
        scanf("%d", &number);

        if(number!=0){
            countNumbers++;
        }
        
    }while(number!=0);

    printf("El total de numeros capturados es: %d\n\n", countNumbers);
}