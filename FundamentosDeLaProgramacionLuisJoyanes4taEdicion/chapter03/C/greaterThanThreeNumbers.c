/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 13.-Determinar el mayor de tres numeros.
*/
#include<stdio.h>
void main(){
    int num1=0, num2=0, num3=0;

    printf("Ingresa el primer numero: ");
    scanf("%d", &num1);

    printf("Ingresa el segundo numero: ");
    scanf("%d", &num2);

    printf("Ingresa el tercer numero: ");
    scanf("%d", &num3);

    if(num1==num2){

        if(num2==num3){
            printf("Los tres numeros son iguales.");
        }else if(num2>num3){
            printf("%d y %d son iguales y mayores", num1, num2);
        }else{
            printf("%d es mayor", num3);
        }
    }else if(num1>num2){
        if(num2==num3){
            printf("%d es mayor", num1);
        }else if(num2>num3){
            printf("%d es mayor", num1);
        }else{
            if(num1==num3){
                printf("%d y %d son iguales y mayores", num1, num3);
            }else if(num1>num3){
                printf("%d es mayor", num1);
            }else{
                printf("%d es mayor", num3);
            }
        }

    }else{
        if(num2==num3){
            printf("%d y %d son iguales y mayores", num2, num3);
        }else if(num2>num3){
            printf("%d es mayor", num2);
        }else{
            printf("%d es mayor", num3);
        }
    }

    printf("\n\n");
}