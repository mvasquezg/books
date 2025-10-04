/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 01.-Calcular la superficie (área) de un rectángulo, usando funciones.
    
    Ejemplo1
    Pagina 202
*/
#include<stdio.h>

float calculateArea(float base, float altura){
    return base*altura;
}

void main(){
    float base=0, altura=0;

    printf("Programa que calcula el area de un rectangulo, usando una funcion:\n\nIngresa la base del rectangulo: ");
    scanf("%f", &base);
    printf("Ingresa la altura del rectangulo: ");
    scanf("%f", &altura);

    printf("El area del rectanglo es igual a: %2f\n", calculateArea(base, altura));    
}