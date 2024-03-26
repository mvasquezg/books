/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 11.-Programa que muestre el resultado de las siguientes expresiones mezclando los operadores logicos y relacionales: 
					
				(1 < 5) Y ( 5 < 10) 
				(5 > 10) O (‘A’ < ‘B’)
*/
#include<stdio.h>
void main(){

    if((1<5) && (5<10)){
        printf("(1<5) && (5<10) = Verdadero\n\n");
    }else{
        printf("(1<5) && (5<10) = Falso\n\n");
    }

    if((5 > 10) || (65 < 66)){
        printf("(5 > 10) O (%c < %c) = Verdadero\n\n", 65, 66);
    }else{
        printf("(5 > 10) O (%c < %c) = Falso\n\n", 65, 66);
    }
}