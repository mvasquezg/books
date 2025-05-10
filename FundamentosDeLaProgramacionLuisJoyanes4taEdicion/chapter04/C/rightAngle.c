/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 19.-Si un ángulo es igual a 90 grados, imprimir el mensaje "El ángulo es un ángulo recto" sino imprimir el mensaje 
    "El ángulo no es un ángulo recto.

    Ejercicios
    4.1 (a) Pagina 155
*/
#include<stdio.h>
void main(){
    float angle=0;

    printf("Programa que determina si un angulo es Recto o no.\nIngrese el valor del angulo: ");
    scanf("%f", &angle);

    printf("\n");
    if(angle!=90){
        printf("El angulo %f no es recto", angle);
    }else{
        printf("El angulo %f es recto", angle);
    }
    printf("\n");
}
