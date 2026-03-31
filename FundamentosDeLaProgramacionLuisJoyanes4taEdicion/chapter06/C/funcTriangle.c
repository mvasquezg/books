/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 12.-La función triángulo calcula el área de un triángulo en C++
    
    Ejemplo 6.15
    Pagina 232-233
*/
#include<stdio.h>

float calcArea(float base, float heigth){
    return (base*heigth)/2;
}

void main(){
    float base=0.0, heigth=0.0;

    printf("**** Programa que calcula el area de un triangulo ***");
    printf("\n\nIngresa el valor de la base: ");
    scanf("%f", &base);
    printf("Ingresa el valor de la altura: ");
    scanf("%f", &heigth);

    printf("\nArea: %.2f\n\n", calcArea(base, heigth));
}