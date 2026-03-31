/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 11.-Se trata de realizar el cálculo del área de un círculo y la longitud de la circunferencia en función del valor del radio
                 leído desde el teclado.
    
    Ejemplo 11
    Pagina 223-224
*/
#include<stdio.h>

float calArea(float radio){
    return 3.141592*radio*radio;
}

float calcCircun(float radio){
    return 3.141592*2*radio;
}

void main(){
    float radio=0.0;

    printf("Programa que calcula el area de un circulo y la longitud de la circunferencia\nIngrese el radio del circulo: ");
    scanf("%f", &radio);

    printf("\nArea: %.2f\nCircunferencia: %.2f\n\n", calArea(radio), calcCircun(radio));
}