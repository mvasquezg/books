/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 24. Programa que lea tres numeros y descubra si uno de ellos es la suma de los otros dos
*/
#include<stdio.h>
int main(){
    int num1=0;   //numero1
    int num2=0;   //numero2
    int num3=0;   //numero3
    int sum1=0;   //suma de numero1+numero2
    int sum2=0;   //suma de numero1+numero3
    int sum3=0;   //suma de numero2+numero3
    printf("\nIngresa el primer numero: ");
    scanf("%d", &num1);
    printf("Ingresa el segundo numero: ");
    scanf("%d", &num2);
    printf("Ingresa el tercer numero: ");
    scanf("%d", &num3);
    sum1=num1+num2;
    sum2=num1+num3;
    sum3=num2+num3;
    if(sum1==num3){
        printf("\nSon iguales\n");
    }else if(sum2==num2){
        printf("\nSon iguales\n");
    }else if(sum3==num1){
        printf("\nSon iguales\n");
    }else{
        printf("\nSon Distintos\n");
    
    }    
}
