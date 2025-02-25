/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 15.-Leer dos numeros y deducir si estan en orden creciente. 
    Actividades de programacion Rsueltas
    4.1, Pagina 151
*/
#include<stdio.h>
void main(){
    int num1=0, num2=0;

    printf("Programa que lee dos numeros y deducir si estan en orden creciente.");

    printf("\n\nIngrese el primer numero: ");
    scanf("%d", &num1);
    printf("Ingrese el segundo numero: ");
    scanf("%d", &num2);

    if(num1<num2){
        printf("\nLos numeros ingresados en forma ascendente: %d, %d", num1, num2);
    }else if(num1==num2){
        printf("\nLos numeros son iguales: %d, %d", num1, num2);
    }else{
        printf("\nLos numeros ingresados en forma ascendente: %d, %d", num2, num1);
    }
    printf("\n\n");
}