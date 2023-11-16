/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 03.Calcular el valor de la suma 1+2+3+...+100..
*/

#include<stdio.h>
int main(){
    int sum;

    for(int i=1; i<=100; i++){
        sum+=i;
    }

    printf("La suma del 1 al 100 es igual a: %d\n", sum);
}