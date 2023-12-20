/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 10.Suma de los números pares comprendidos entre 2 y 100.
*/

#include<stdio.h>
int main(){
    int sum;

    for(int i=2; i<=100; i+=2){
        sum+=i;
    }

    printf("La suma de los numeros pares del 2 al 100 es igual a: %d\n", sum);
}