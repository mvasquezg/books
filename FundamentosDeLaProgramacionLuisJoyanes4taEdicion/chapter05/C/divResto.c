/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 16.-Dados dos números enteros, realizar el algoritmo que calcule su cociente y su resto.
    
    Ejercicio 5.5
    Pagina 187
*/
#include<stdio.h>

void main(){
    int num1=0, num2=0, dividendo=0, divisor=0, cociente=0;

    printf("Ingresa el dividendo: ");
    scanf("%d", &num2);

    printf("Ingresa el divisor: ");
    scanf("%d", &num1);

     divisor=num1;
     dividendo=num2;   

    do{
        dividendo=dividendo-divisor;
        cociente++;
    }while(dividendo>=divisor);

    printf("\nLa division de %d/%d\nCociente: %d\nResto: %d\n\n", num2, num1, cociente, dividendo);
}