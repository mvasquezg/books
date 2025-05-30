/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 06.-Programa que nos calcule el area de un triangulo conociendo sus lados. 
    La estructura selectiva se utiliza para el control de entrada de datos del programa.

    Nota: 
    Area = sqrt(P * (P-a) * (P-b) * (P-c))
    P = (a + b + c)/2

    donde P>a y P>b y P>c, sino se cumple la condicion entonces no es un triangulo.

    ejemplo 4.8, Pagina 138
*/
#include<stdio.h>
#include<math.h>
void main(){
    float Area=0, P=0, a=0, b=0, c=0;
    printf("Programa que nos calcule el area de un triangulo conociendo sus lados.\n"); 
    //printf("La estructura selectiva se utiliza para el control de entrada de datos del programa.");
    printf("\n\nNota: Area = sqrt(P * (P-a) * (P-b) * (P-c))\nP = (a + b + c)/2\n");
    printf("\n\nDonde P>a y P>b y P>c, sino se cumple la condicion entonces no es un triangulo.");
    printf("\nIngresa el valor de a: ");
    scanf("%f", &a);
    printf("Ingresa el valor de b: ");
    scanf("%f", &b);
    printf("Ingresa el valor de c: ");
    scanf("%f", &c);
    P=(a+b+c)/2;
    if(P>a && P>b && P>c){
        Area= sqrt(P * (P-a) * (P-b) * (P-c));
    }
    if(Area!=0){
        printf("\nEl area es igual a: %f", Area);
    }else{
        printf("No es un triangulo.");
    }
    printf("\n\n");
}