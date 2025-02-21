/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 13.-Pseudocodigo que nos permita calcular las soluciones de una ecuacion de segundo grado, incluyendo
    los valores imaginarios.
    ejemplo 4.17, Pagina 147
*/
#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void main(){
    float a=0, b=0, c=0, d=0, x1=0, x2=0, r=0, i=0;
    printf("Programa que nos permita calcular las soluciones de una ecuacion de segundo grado, incluyendo los valores imaginarios.");

    printf("\n\nIngrese los coeficientes: ");
    printf("\nIngrese el valor de A: ");
    scanf("%f", &a);
    printf("Ingrese el valor de B: ");
    scanf("%f", &b);
    printf("Ingrese el valor de C: ");
    scanf("%f", &c);

    if(a==0){
        printf("La ecuacion no es de segundo grado.\n");
    }else{
        d=b*b-4*a*c;

        if(d==0){
            x1= -b/(2+a);
            x2=x1;
            printf("Los valores son para:\nx1=%1.2f\nx2=%1.2f", x1, x2);

        }else if(d>0){
            x1=(-b +sqrt(d)) / (2*a);
            x2=(-b -sqrt(d)) / (2*a);
            printf("\nLos valores son para:\nx1=%1.2f\nx2=%1.2f", x1, x2);
        }else{
            r=(-b)/(2*a);
            int dAbs=(int)(d);
            int absNum=abs(dAbs);
            i=sqrt(absNum) /(2*a);
            printf("\n\nLos valores son para:\nr=%1.2f + %1.2fi", r, i);
            printf("\nLos valores son para:\nr=%1.2f - %1.2fi", r, i);
        }
    }
    printf("\n\n");
}
