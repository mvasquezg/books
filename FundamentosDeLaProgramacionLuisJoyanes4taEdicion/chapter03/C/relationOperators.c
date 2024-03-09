/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 07.-Programa que aplica operadores relacionales.

    < Menor que.
    > mayor que.
    == Igual que.
    <= menor o igual que
    >= mayor o igual que 
    != distinto que
*/
#include<stdio.h>
void main(){
    int a=4, b=3;
    printf("Programa que muestra los operadores relacionales con los numeros A=%d, B=%d\n\n", a, b);
    if(a<b){
        printf("%d < %d = Verdadero\n", a, b);
    }else{
        printf("%d < %d = Falso\n", a, b);
    }

    if(a>b){
        printf("%d > %d = Verdadero\n", a, b);
    }else{
        printf("%d > %d = Falso\n", a, b);
    }
    
    if(a==b){
        printf("%d == %d = Verdadero\n", a, b);
    }else{
        printf("%d == %d = Falso\n", a, b);
    }
    
    if(a<=b){
        printf("%d <= %d = Verdadero\n", a, b);
    }else{
        printf("%d <= %d = Falso\n", a, b);
    }
    
    if(a>=b){
        printf("%d >= %d = Verdadero\n", a, b);
    }else{
        printf("%d >= %d = Falso\n", a, b);
    }
    
    if(a!=b){
        printf("%d != %d = Verdadero\n", a, b);
    }else{
        printf("%d != %d = Falso\n", a, b);
    }

    printf("\n\n");
}