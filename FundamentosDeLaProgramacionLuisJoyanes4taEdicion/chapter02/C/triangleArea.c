/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 27.Escribir un algoritmo que calcule la superficie de un triángulo en función de la base y la altura 
    (S = 1/2Base × Altura)
*/

#include<stdio.h>
int main(){
    float b=0; //base
    float h=0; //altura
    float area=0; //area del triagulo

    printf("Ingrese la base del triangulo: ");
    scanf("%f", &b);

    printf("Ingrese la altura del triangulo: ");
    scanf("%f", &h); 

    area=(b*h)/2;

    printf("El area del tiangulo es igual a: %.2f\n", area);   
}