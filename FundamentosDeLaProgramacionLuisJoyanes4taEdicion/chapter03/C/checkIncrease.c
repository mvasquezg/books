/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 01.-Mostra funcionamiento operadores de incremento.
*/  
#include<stdio.h>
void main(){
    int n=5;
    
    printf("Valor inicial de n: %d", n);
    printf("\nEscribir el valor de la n cuando se ejecuta: n++: %d", n++);
    printf("\nImprimir el valor de n cuando ya se ejecuto n++: %d", n);

    n=5;
    printf("\n\nAsignando valor inicial de n, nuevamente: %d", n);
    printf("\nEscribir el valor de la n cuando se ejecuta: ++n: %d", ++n);
    printf("\nImprimir el valor de n cuando ya se ejecuto ++n: %d\n\n", n);
}
