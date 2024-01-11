/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 19. Dividir dos numeros enteros.
*/
#include<stdio.h>
int main(){
    int number1=0;
    int number2=0;
    int division=0;

    printf("Ingrese un numero: ");
    scanf("%d", &number1);

    printf("Ingrese otro numero: ");
    scanf("%d", &number2);

    if(number1!=0 && number2!=0){
        division=number1/number2;
        printf("La division es igual a: %d\n\n", division);
    }else{
        printf("No se pueden didivir ceros\n\n");
    }    
}