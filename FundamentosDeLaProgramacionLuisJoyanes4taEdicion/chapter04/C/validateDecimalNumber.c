/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 04.-Empleo de estructura selectiva para detectar si un numero tiene o no parte fraccionaria.
    ejemplo 4.6, pagina 136
*/
#include<stdio.h>

//librearia que contiene la funcion trunc
#include<math.h>

void main(){
    
    float num=0;
    printf("\nPrograma que emplea de estructura selectiva para detectar si un numero tiene o no parte fraccionaria.");
    
    printf("\n\nIngresa un numero con decimales: ");
    scanf("%f", &num);

    if(num==trunc(num)){
        printf("%f No tiene parte fraccionaria\n", num);
    }else{
        printf("%f Tiene parte fraccionaria\n\n", num);
    }
}