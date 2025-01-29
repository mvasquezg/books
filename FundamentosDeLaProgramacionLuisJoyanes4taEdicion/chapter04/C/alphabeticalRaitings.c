/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 08.-Se desea convertir las calificaciones alfabeticas A, B, C, D, E y F a calificaciones
    numericas 4, 5, 6, 7, 8, 9 respectivamente.

    A=4 
    B=5 
    C=6 
    D=7 
    E=8
    F=9
    
    ejemplo 4.10, Pagina 141
*/
#include<stdio.h>
void main(){
    char letter='0';
    int cal=0;

    printf("Se desea convertir las calificaciones alfabeticas A, B, C, D, E y F a calificaciones numericas 4, 5, 6, 7, 8, 9 respectivamente.\n");
    printf("\nA=4\nB=5\nC=6\nD=7\nE=8\nF=9\n\n");

    printf("Ingresa una letra: ");
    scanf("%c", &letter);

    switch(letter){
        case 'A':
           cal=4;
           break;
        case 'B':
           cal=5;
           break;
        case 'C':
           cal=6;
           break;
        case 'D':
           cal=7;
           break;
        case 'E':
           cal=8;
           break;
        case 'F':
           cal=9;
           break;
        default:
            printf("Calificacion no valida\n\n");                   
    }

   if(cal!=0){
        printf("La calificacion %c es equivalente a %d\n\n", letter, cal);
   }    
}
