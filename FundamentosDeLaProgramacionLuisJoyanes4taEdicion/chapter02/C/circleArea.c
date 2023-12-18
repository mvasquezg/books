/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 07.Encontrar el area y el perimetro de un círculo.

    A=PI*r*r
    P = 2*PI*r
*/

#include<stdio.h>
int main(){ 
    float r=0;          //Variable radio      
    float PI=3.1416;    //Variable PI
    float A=0;          //Variable Area
    float P=0;          //Variable Perimetro

    printf("Ingrese el radio de la circunferencia: ");
    scanf("%f", &r);

    A=PI*r*r;
    P=2*PI*r;

    printf("\nRadio: %f\nArea: %f\nPerimetro: %f\n\n", r, A, P);
}