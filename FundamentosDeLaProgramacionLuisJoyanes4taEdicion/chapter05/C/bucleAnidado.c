/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 12.-El segmento de programa siguiente visualiza una tabla de multiplicación por cálculo y visualización de productos
                 de la forma x * y para cada x en el rango de 1 a Xultimo y desde cada y en el rango 1 a Yultimo (donde Xultimo, e Yultimo son enteros prefijados). La tabla que se desea obtener es
    Pagina 183
*/
#include<stdio.h>

void main(){
    
    printf("%15c%5c\n", 'i', 'j');
    
    for(int i=0; i<=4; i++){
        printf("Externo%8d\n", i); 
        for(int j=0; j<i; j++){
            printf("%8s%12d\n", "Interno",j); 
        }
            
    }
    printf("\n\n");
}