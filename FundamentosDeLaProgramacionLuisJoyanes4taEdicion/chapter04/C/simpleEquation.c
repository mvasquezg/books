/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 02.-Resolucion de una ecuacion de primer grado.
    Si la ecuacion es ax+b=0, a y b son los datos, y las posibles soluciones son:
    ** a <> 0               x= -b/a
    ** a = 0  b <> 0   entonces "Solucion imposible"
    ** a = 0 b = 0     entonces "Solucion indeterminada"
    ejemplo 4.3, pagina 133
*/
#include<stdio.h>

void main(){
    int a=0, b=0, x=0;
    printf("Resolucion de una ecuacion de primer grado.\n\nSi la ecuacion es ax+b=0, a y b son los datos, y las posibles soluciones son:\n");
    printf("\na <> 0               x= -b/a\na = 0  b <> 0   entonces Solucion imposible\na = 0 b = 0     entonces Solucion indeterminada");

    printf("\n\ningresa el valor de a: ");
    scanf("%d", &a);

    printf("ingresa el valor de b: ");
    scanf("%d", &b);

    if(a!=0){
        printf("x=-b/a\n");
    }else if(a==0 && b!=0){
        printf("Solucion imposible");
    }else if(a==0 && b==0){
        printf("Solucion indeterminada  ");
    }

    printf("\n\n");
}