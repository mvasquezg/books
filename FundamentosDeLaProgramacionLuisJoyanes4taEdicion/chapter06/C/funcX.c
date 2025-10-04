/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 02.-Calcular la siguiente funcion
		
				f(x)=x/1+(x*x)
    Ejemplo2
    Pagina 205
*/
#include<stdio.h>

float functionX(float x){
    return x/(1+(x*x));
} 

void main(){
    float x=0;

    printf("Programa que calcula la f(x)=x/(1+x^2)\nIngresa el valor x: ");
    scanf("%f", &x);

    printf("f(x)=x/(1+x^2):\n\nf(%.0f)=%.0f/1+%.0f^2 = %.2f\n\n", x, x, x,functionX(x));
}