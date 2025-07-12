/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 30.-Realizar un programa que averigüe si dados dos números introducidos por teclado uno es divisor del otro.
    Pagina 155
*/
#include<stdio.h>
void main(){
    int num1=0, num2=0;
    
    printf("Programa que averigüe si dados dos números introducidos por teclado uno es divisor del otro.\n");
    printf("\nIngresa el primer numero: ");
    scanf("%d", &num1);
    printf("Ingresa el segundo numero: ");
    scanf("%d", &num2);

    printf("\n");
    if(num1%num2==0){
        printf("%d es divisor de %d ", num2, num1);
    }else if(num2%num1==0){
        printf("%d es divisor de %d ", num1, num2);
    }else{
        printf("Los numeros %d, %d no son divisibles uno del otro.", num2, num1);
    }
    printf("\n\n");

}