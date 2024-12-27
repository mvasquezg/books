/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 01.-Calcula la suma y el producto de dos numeros.
    ejemplo 4.1, pagina 129
*/
#include<stdio.h>
void main(){
    int num1=0, num2=0, sum=0, product=0;

    printf("Programa que calcula la suma y el producto de dos numeros. \n\nIngrese el primer numero: ");
    scanf("%d", &num1);

    printf("Ingrese el segundo numero: ");
    scanf("%d", &num2);

    sum=num1+num2;
    product=num1*num2;

    printf("\nSuma:\n%d + %d = %d\n\n", num1, num2, sum);
    printf("\nProducto:\n%d * %d = %d\n\n", num1, num2, product);
}
