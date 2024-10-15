/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 22.-Sumar 10 numeros introducidos por el teclado,
*/
#include<stdio.h>

void main(){
    int sum=0, number=0;
    
    for(int i=1; i<=10; i++){
        printf("%d.-Ingresa un numero: ", i);
        scanf("%d", &number);
        sum+=number;
    }
    printf("\nSuma Total: %d\n", sum);
}