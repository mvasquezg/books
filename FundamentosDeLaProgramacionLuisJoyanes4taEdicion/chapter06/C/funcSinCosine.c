/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 06.-Algoritmo que contiene y utiliza unas funciones (seno y coseno) a las que les podemos pasar el ángulo en grados.
    
    Ejemplo 6
    Pagina 208
*/
#include<stdio.h>
#include<math.h>

float calculateSin(float degree){
    return sin(degree*2*3.1416/360);
}

float calculateCosine(float degree){
    return cos(degree*2*3.1416/360);
}


void main(){
    float degree;

    printf("Programa que calcula el seno y el coseno de un angulo en grados:\n");
    printf("Ingresa el angulo en grado: ");
    scanf("%f", &degree);

    printf("\nEl seno de %f es igual a: %f\n", degree, calculateSin(degree));
    printf("\nEl coseno de %f es igual a: %f\n", degree, calculateCosine(degree));


}