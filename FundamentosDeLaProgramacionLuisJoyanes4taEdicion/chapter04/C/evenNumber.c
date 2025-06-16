/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 27.-Escribir los diferentes métodos para deducir si una variable o expresión numérica es par.

    Ejercicios:
    4.5  página 155 
*/
#include<stdio.h>
void main(){
    int num=0;

    printf("Escribir los diferentes métodos para deducir si una variable o expresión numérica es par.");
    printf("\n\nIngresa un numero: ");
    scanf("%d", &num);

    if(num%2==0){
        printf("El numero: %d es par", num);
    }else{
        printf("El numero: %d es impar", num);
    }
    printf("\n\n");
}