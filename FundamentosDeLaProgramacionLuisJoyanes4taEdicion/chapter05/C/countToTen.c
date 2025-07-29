/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 04.-Cuenta hasta 10
    Pagina 167
*/
#include<stdio.h>
void main(){
    int num=1;

    printf("Programa que cuenta del 1-10 usando ciclo do-while: \n");
    do{
        printf("%d, ", num);
        num++;
    }while(num<=10);
    printf("\n");
}