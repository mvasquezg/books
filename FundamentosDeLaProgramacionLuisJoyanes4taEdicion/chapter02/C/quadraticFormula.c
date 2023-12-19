/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 08.Formula cuadratica
    
    x1 = –b + √((bb – 4ac)/2a)
    x2 = –b – √((bb – 4ac)/2a)
*/
#include<math.h>
#include<stdio.h>
int main(){
    float a=0;
    float b=0;
    float c=0;
    float x1=0;
    float x2=0;

    printf("Ingresa el valor de A: ");
    scanf("%f", &a);

    printf("Ingresa el valor de B: ");
    scanf("%f", &b);

    printf("Ingresa el valor de C: ");
    scanf("%f", &c);

    x1=-(b + sqrt (b*b - (4*a*c))) / (2*a);
    x2=-(b - sqrt (b*b - (4*a*c))) / (2*a);

    printf("\n\nx1: %f\nx2: %f\n\n", x1, x2);
}