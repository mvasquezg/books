/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 06.Realizar la suma de todos los números pares entre 2 y 1 000.
*/

#include<stdio.h>
int main(){
    int sum=0;

    for(int i=2; i<=1000; i+=2){
        sum+=i;
    }

    printf("La suma del 1 al 1000 es igual a: %d\n", sum);
}