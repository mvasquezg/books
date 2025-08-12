/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 15.-Ejecutar y visualizar el programa siguiente que imprime una tabla de m filas por n columnas y un carácter
prefijado.
    Pagina 185
*/
#include<stdio.h>
void main(){
    int row=0, column=0;
    char ch=0;

    printf("Ingrese la cantidad de filas: ");
    scanf("%d", &row);

    printf("Ingrese la cantidad de columnas: ");
    scanf("%d", &column);

    printf("Ingrese character: ");
    scanf(" %c", &ch);

    printf("\n");
    for(int i=1; i<=row; i++){
        for(int j=1; j<=column; j++){
            printf("%c", ch);
        }
        printf("\n");
    }
    
}