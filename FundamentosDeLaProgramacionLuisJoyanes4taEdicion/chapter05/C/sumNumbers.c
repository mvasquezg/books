/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 01.-Leer por teclado un número que represente una cantidad de números que a su vez se leerán también por teclado.
                 Calcular la suma de todos esos números.
    Pagina 156
*/

#include<stdio.h>
void main(){
    int totalNumbers=0;
    float num=0, sum=0;

    printf("Programa que lee por teclado un número que representa una cantidad de números que a su vez se leerán también por teclado.\n Calcular la suma de todos esos números.");
    printf("\nIngrese la cantidad de numeros a sumar:  ");
    scanf("%d", &totalNumbers);

    printf("\n");
    while(totalNumbers>0){
        printf("Ingresa un numero: ");
        scanf("%f", &num);

        sum+=num;
        totalNumbers--;
    }
    printf("\nEl total de la suma: %f\n", sum);
}
