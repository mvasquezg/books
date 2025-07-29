/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 03.-Obtener un algoritmo que lea un número (por ejemplo, 198) y obtenga el número inverso (por ejemplo, 891).
    Pagina 166
*/
#include<stdio.h>
void main(){
    int num=0, inverseNumber=0;

    printf("Programa que lee un número (por ejemplo, 198) y obtenga el número inverso (por ejemplo, 891).\n\nIngresa un numero: ");
    scanf("%d", &num);

    printf("\nNumero Inverso: ");
    do{
        inverseNumber=num%10;
        printf("%d", inverseNumber);
        num=num/10;
    }while(num>0);
    printf("\n");
}