/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 08.-Programa que aplica operadores relacionales con distintos valores.

Numero1     Numero2     Expresion Logica    Resultado
3             6             3<6             Verdadero
0             1             0>1             Falso
4             2             4=2             Falso
8             5             8<=5            Falso
9             9             9>=9            Verdadero
5             5             5<>5            Falso
*/
#include<stdio.h>
void main(){
    int a=3, b=6;
    printf("Programa que muestra los operadores relacionales con los numeros aplicados a la siguiente tabla\n\n");
    printf("Numero 1\t\tnumero 2\t\tExpresion Logica\t\tResultado\t\t\n");
    if(a<b){
        printf("  %d\t\t\t %d\t\t\t %d < %d \t\t\t\t Verdadero\n", a, b, a, b);
    }else{
        printf("  %d\t\t\t %d\t\t\t %d < %d \t\t\t\t Falso\n", a, b, a , b);
    }
    a=0; b=1;
    if(a>b){
        printf("  %d\t\t\t %d\t\t\t %d > %d \t\t\t\t Verdadero\n", a, b, a, b);
    }else{
        printf("  %d\t\t\t %d\t\t\t %d > %d \t\t\t\t Falso\n", a, b, a, b);
    }
    a=4; b=2;
    if(a==b){
        printf("  %d\t\t\t %d\t\t\t %d == %d \t\t\t Verdadero\n", a, b, a, b);
    }else{
        printf("  %d\t\t\t %d\t\t\t %d == %d \t\t\t Falso\n", a, b, a, b);
    }
    a=8; b=5;
    if(a<=b){
        printf("  %d\t\t\t %d\t\t\t %d <= %d \t\t\t Verdadero\n", a, b, a, b);
    }else{
        printf("  %d\t\t\t %d\t\t\t %d <= %d \t\t\t Falso\n", a, b, a, b);
    }
    a=9; b=9;
    if(a>=b){
        printf("  %d\t\t\t %d\t\t\t %d >= %d \t\t\t Verdadero\n", a, b, a, b);
    }else{
        printf("  %d\t\t\t %d\t\t\t %d >= %d \t\t\t Falso\n", a, b, a, b);
    }
    a=5; b=5;
    if(a!=b){
        printf("  %d\t\t\t %d\t\t\t %d != %d \t\t\t Verdadero\n", a, b, a, b);
    }else{
        printf("  %d\t\t\t %d\t\t\t %d != %d \t\t\t Falso\n", a, b, a, b);
    }

    printf("\n\n");
}