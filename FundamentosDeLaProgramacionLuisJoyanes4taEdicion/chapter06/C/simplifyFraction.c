/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 06.-Algoritmo que simplifique un quebrado, dividiendo numerador y denominador por su máximo común divisor.
    
    Ejemplo 7
    Pagina 208-209
*/
#include<stdio.h>

int showMcd(int numerator, int denominator){
    int dividendo=0, divisor=0;

    if(numerator%denominator==0){
        return denominator;
    }else{
        dividendo=denominator;
        divisor=numerator%denominator;
        return showMcd(dividendo, divisor);
    }   
    
}

void main(){
    int numerator=0, denominator=0, mcd=0;
    
    printf("Ingresa el numerador: ");
    scanf("%d", &numerator);

    printf("Ingresa el denominador: ");
    scanf("%d", &denominator);

    mcd=showMcd(numerator, denominator);
    
    printf("\nFraccion: %d / %d\nMCD: %d\n", numerator, denominator, mcd);

    printf("\nFraccion simplificada: %d / %d\n", (numerator/mcd), (denominator/mcd));    
}

