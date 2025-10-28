/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 05.-Realizar el diseño de la función y = x3 (cálculo del cubo de un número)..
    
    Ejemplo5
    Pagina 207
*/
#include<stdio.h>

int calculateCube(int x){
    return x*x*x;
}

void main(){
    int num=0;
    printf("programa que calcula el cubo de un numero\nIngresa un numero: ");
    scanf("%d", &num);

    printf("El cubo de %d es igual a: %d\n\n", num, calculateCube(num));
}