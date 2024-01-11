/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 17. Restar dos numeros enteros.
*/

#include<stdio.h>
int main(){
    int number1=0;
    int number2=0;
    int subtraction=0;

    printf("Ingrese un numero: ");
    scanf("%d", &number1);

    printf("Ingrese otro numero: ");
    scanf("%d", &number2);

    subtraction=number1-number2;

    printf("La diferencia es igual a: %d\n\n", subtraction);
}