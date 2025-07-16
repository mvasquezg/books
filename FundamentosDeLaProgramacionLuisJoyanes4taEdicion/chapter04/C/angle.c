/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 31.-Un ángulo se considera agudo si es menor de 90 grados, obtuso si es mayor de 90 grados y 
    recto si es igual a 90 grados. Utilizando esta información, escribir un algoritmo que acepte un ángulo en grados 
    y visualice el tipo de ángulo correspondiente a los grados introducidos.

    Pagina 155
*/
#include<stdio.h>
void main(){
    float angle;

    printf("Programa que determina si el tipo de ángulo.\n\nMenor de 90 grados: Agudo.\nIgual a 90 grados: Recto.\nMayor de 90 grados: Obtuso\n");

    printf("\nIngresa un angulo: ");
    scanf("%f", &angle);

    if(angle>90){
        printf("El angulo %f es Obtuso.", angle);
    }else if(angle==90){
        printf("El angulo %f es Recto.", angle);
    }else{
        printf("El angulo %f es Agudo.", angle);
    }
    printf("\n");
}