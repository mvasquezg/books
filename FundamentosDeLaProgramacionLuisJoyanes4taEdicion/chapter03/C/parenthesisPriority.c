/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 05.-Resolver las operaciones de los parentesis primero.
					
					1) A * (B + 3)
					
					2) (A*B) + 3
					
					3) A + (B + C) + D

					4) (A+B/C) + D
					
					5) A*B/C * D   
*/
#include<stdio.h>
void main(){
    int a=0, b=0, c=0, d=0;

    printf("Ingresa el valor de A: ");
    scanf("%d", &a);

    printf("Ingresa el valor de B: ");
    scanf("%d", &b);

    printf("Ingresa el valor de C: ");
    scanf("%d", &c);

    printf("Ingresa el valor de D: ");
    scanf("%d", &d);

    printf("\nA * (B + 3) = %d\n\n", (a*(b+3)));
					
	printf("(A * B) + 3 = %d\n\n", ((a * b) + 3));
					
	printf("A + (B + C) + D = %d\n\n", (a + (b + c) + d)); 

	printf("(A+B/C) + D = %d\n\n", ((a+b/c) + d));
					
	printf("A*B/C*D = %d\n\n", (a*b/c*d));
}