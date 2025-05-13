/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 20.-Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima del punto de ebullición del agua”
     sino visualizar el mensaje “por debajo del punto de ebullición del agua”

    Ejercicios
    4.1 (b) Pagina 155
*/
#include<stdio.h>
void main(){
    float temperature=0;

    printf("Programa que muestra en pantalla el siguiente mensaje\n--por encima del punto de ebullición del agua--");
    printf(" si la temperatura es mayor a 100 grados, en caso contrario imprime --por debajo del punto de ebullición del agua--.");
    printf("\n\nIngrese La temperatura: ");
    scanf("%f", &temperature);

    printf("\n");
    if(temperature>100){
        printf("La temperatura esta por encima del punto de ebullición del agua");
    }else{
        printf("La temperatura esta por debajo del punto de ebullición del agua");
    }
    printf("\n");
}
