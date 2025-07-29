/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 05.-imprimir letras minúsculas del alfabeto
    Pagina 168
*/
#include<stdio.h>
void main(){
    char letter='a';

    printf("Alfabeto en minuscula: \n\n");
    do{
        printf("%c ", letter);
        letter++;
    }while(letter<='z');
    printf("\n");
}
