/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Escribir una frase y detenerse en la primera vocal leída. (Se supone que se leen, uno a uno, caracteres desde el teclado.)
    Pagina 188

*/
#include<stdio.h>
void main(){
    char letter='0';

    printf("El programa termina al leer una vocal\n\n");
    do{
        printf("Ingresa un letra: ");
        scanf(" %c", &letter);
        
    }while(letter!='a' && letter!='e' && letter!='i' && letter!='o' && letter!='u');

    printf("\n\nLa vocal que termino el ciclo es: %c\n\n", letter);
}