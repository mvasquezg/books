/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 04.-Convertir en expresiones aritméticas algorítmicas las siguientes expresiones algebraicas:
					
					1) 5 ∙ (x + y)
					
					2) x + y/ (u+ w/a)
					
					3) a^2 + b^2
					
					4) x/y * (z + w)   
*/  
#include<math.h>
#include<stdio.h>
void main(){
    int a=0, b=0, u=0, w=0, x=0, y=0, z=0;

    printf("Ingresa el valor de a: ");
    scanf("%d", &a);

    printf("Ingresa el valor de b: ");
    scanf("%d", &b);

    printf("Ingresa el valor de u: ");
    scanf("%d", &u);    

    printf("Ingresa el valor de w: ");
    scanf("%d", &w);

    printf("Ingresa el valor de x: ");
    scanf("%d", &x);

    printf("Ingresa el valor de y: ");
    scanf("%d", &y);

    printf("Ingresa el valor de z: ");
    scanf("%d", &z);

    printf("\n5 ∙ (x + y) = %d\n\n", 5*(x+y));
    printf("a^2 + b^2 = %f\n\n", (pow(a, 2)+pow(b, 2)));
    printf("x + y / (u + w/a) = %d\n\n", ((x+y)/(u+(w/a))));  
    printf("x/y * (z + w)  = %d\n\n", ((x/y)*(z+w)));
}
