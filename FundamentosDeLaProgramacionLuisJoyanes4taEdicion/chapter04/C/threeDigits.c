/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 12.-Algoritmo que nos indique si un numero entero leido de teclado tiene 1, 2, 3 o mas digitos. Considerar los negativos.
    ejemplo 4.14, Pagina 144
*/
#include<stdio.h>
void main(){
    int number=0, numberNegative,option=0;

    printf("Programa que nos indica si un numero entero leido de teclado tiene 1, 2, 3 o mas digitos. Considera los negativos.\n\n");

    printf("Ingrese un numero: ");
    scanf("%d", &number);

    if((number>=0 && number<10) || (number>-10 && number<=0)){
        printf("El numero %d tiene una cifra", number);
    }else if((number>=10 && number<100) || (number<=-10 && number>-100)){
        printf("El numero %d tiene dos cifras", number);
    }else if((number>=100 && number<1000) || (number<=-100 && number>-1000)){
        printf("El numero %d tiene tres cifras", number);
    }else{
        printf("El numero %d tiene mas de tres cifras", number);
    }
    
    printf("\n\n");
}