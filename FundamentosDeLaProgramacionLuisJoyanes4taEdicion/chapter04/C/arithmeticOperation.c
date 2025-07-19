/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 32.-Escribir un programa que seleccione la operación aritmética a ejecutar entre dos números dependiendo del valor de una variable 
        denominada seleccionOp.

    Pagina 156
*/
#include<stdio.h>
void main(){
    int selectionOpc=0, num1=0, num2=0;

    printf("Programa que ejecuta una operación aritmética entre dos números dependiendo de la opcion elegida\n");
    printf("\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n\nElija Opcion: ");
    scanf("%d", &selectionOpc);

    printf("\nIngrese el primer numero: ");
    scanf("%d", &num1);
    printf("Ingrese el segundo numero: ");
    scanf("%d", &num2);

    printf("\n");
    switch(selectionOpc){
        case 1:
                printf("Suma:\n %d + %d = %d ", num1, num2, (num1+num2));
            break;
        case 2:
            printf("Resta:\n %d - %d = %d ", num1, num2, (num1-num2));
            break;
        case 3:
            printf("Multiplicacion:\n %d * %d = %d ", num1, num2, (num1*num2));
            break;    
        case 4:
            printf("Division:\n %d + %d = %d ", num1, num2, (num1/num2));
            break;
        default:
            printf("La operacion no existe");
            break;        
    }//end switch

    printf("\n");
}