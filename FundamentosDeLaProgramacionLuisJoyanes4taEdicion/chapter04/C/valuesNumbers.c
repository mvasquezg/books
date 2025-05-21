
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 22.-Si x es mayor que y, y z es menor que 20, leer un valor para p

    Ejercicios
    4.1 (d) Pagina 155
*/
#include<stdio.h>
void main(){
    int x=0, y=0, z=0, p=0;
    
    printf("Programa que lee el valor de P si X es mayor que Y, y Z es menor que 20.\n");
    printf("\nIngresa el valor x: ");
    scanf("%d", &x);
    printf("Ingresa el valor y: ");
    scanf("%d", &y);
    printf("Ingresa el valor z: ");
    scanf("%d", &z);    
    
        
    if( (x>y) && (z<20)){
        printf("Ingresa el valor p: ");
        scanf("%d", &p);
    }else{
        printf("\nNo se cumple la condicion X>Y && z<20");
    }
    printf("\n\nLos valores son: X=%d, Y=%d, Z=%d, P=%d\n\n", x, y, z, p);
}