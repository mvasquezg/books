/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 04.-Diseñar un algoritmo que contenga un subprograma de cálculo del factorial de un número y una llamada al
                mismo.
    
    Ejemplo4
    Pagina 207
*/
#include<stdio.h>

int showFactorial(int x){
    if(x<=1){
        return 1;
    }else{
        return x*showFactorial(x-1);
    }
    
}

void main(){
    int x=0;
    printf("Programa que calcula un factorial:\nIngrese un numero: ");
    scanf("%d", &x);

    printf("\nResultado del factorial:\n%d! = %d\n\n", x, showFactorial(x));
}
