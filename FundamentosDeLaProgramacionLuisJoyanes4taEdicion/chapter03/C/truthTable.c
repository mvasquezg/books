/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 10.-Tablas de verdad.

    A               No a
    Verdadero       Falso           No (6>10) es verdadera
    Falso           Verdadero       Ya que (6>10) es falsa

    A               B               A Y B
    Verdadero       Verdadero       Verdadero
    Verdadero       Falso           Falso           A y B son verdadera solo
    Falso           Verdadero       Falso           Si A y B son verdaderas
    Falso           Falso           Falso           

    A               B               A o B           
    Verdadero       Verdadero       Verdadero       
    Verdadero       Falso           Verdadero       A o B es verdadera cuando
    Falso           Verdadero       Verdadero       A, B o ambas son verdaderas
    Falso           Falso           Falso
*/
#include<stdio.h>
void main(){
    printf("\n\n\t\t\t   TABLAS DE VERDAD\n\n");
    printf("   A\t\t\tNO A\t\t\n");
    printf("   Verdadero\t\tFalso\t\tNo (6>10) es verdadera\n");
    printf("   Falso\t\tVerdadero\tya que (6>10) es falsa\n\n");

    printf("   A\t\t\tB\t\t\tA Y B\n");
    printf("   Verdadero\t\tVerdadero\t\tVerdadero\n");
    printf("   Verdadero\t\tFalso    \t\tFalso\t\tA y B son verdadera solo\n");
    printf("   Falso    \t\tVerdadero\t\tFalso\t\tSi A y B son verdaderas\n");
    printf("   Falso    \t\tFalso    \t\tFalso\n\n");
    
    printf("   A\t\t\tB\t\t\tA O B\n");
    printf("   Verdadero\t\tVerdadero\t\tVerdadero\t\t\n");
    printf("   Verdadero\t\tFalso    \t\tVerdadero\tA o B es verdadera cuando\n");
    printf("   Falso    \t\tVerdadero\t\tVerdadero\tA, B o ambas son verdaderas\n");
    printf("   Falso    \t\tFalso    \t\tFalso\n\n");
}
