
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 25.-Dados tres números deducir cuál es el central.

    Ejercicios:
    4.3  página 155 
*/
#include<stdio.h>
void main(){
    int num1=0, num2=0, num3=0;
    printf("Programa que dado tres números deducir cuál es el central.\n\n");
    printf("Ingresa el primer numero: ");
    scanf("%d", &num1);

    printf("Ingresa el segundo numero: ");
    scanf("%d", &num2);

    printf("Ingresa el tercer numero: ");
    scanf("%d", &num3);

    printf("\n");
    if(num1==num2 && num2==num3){
        printf("Todos los numeros son iguales");
    }
    printf("\n");
    if(num1>num2){  
        if(num2==num3){
            printf("No hay numero intermedio.");
        }else if(num2>num3){
            printf("Numero de enmedio es: %d", num2);
        }else{
            printf("Numero de enmedio es: %d", num3);
        }
    }else { 
        if(num1==num3){
            printf("No hay numero intermedio.");
        }else if(num1>num3){
            printf("Numero de enmedio es: %d", num1);
        }else{
            printf("Numero de enmedio es: %d", num2);
        }
    }
    printf("\n\n");
}