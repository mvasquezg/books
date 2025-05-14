
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 21.-Si el número es positivo, sumar el número a total de positivos, sino sumar al total de negativos.

    Ejercicios
    4.1 (c) Pagina 155
*/
#include<stdio.h>
void main(){
    int num=0, sumPosit=0, sumNegat=0;
    char resp='0';
    
    printf("Programa que de un listado de numero evalua Si el número es positivo, sumar el número a total de positivos, sino sumar al total de negativos.\n\n");    
    
    do{
        printf("Ingresa un numero: ");
        scanf("%d", &num);
        
        if(num<0){
            sumNegat+=num;
        }else{
            sumPosit+=num;
        }

        printf("\nDesea agregar otro numero: ");
        scanf("%*c%c", &resp);
        
    }while(resp!='n');
    
    printf("\nSuma de numeros positivos: %d\nSuma de numeros negativos: %d\n\n", sumPosit, sumNegat);
}