/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 28.-Escribir la suma de los primeros diez numeros pares.
*/
#include<stdio.h>
void main(){
    int sum=0;

    printf("\n2");
    sum=2;
    for(int i=2; i<=10; i++){
        sum+=i*2;
        printf(" + %d", (i*2));
    }

    printf(" = %d\n\n", sum);

}