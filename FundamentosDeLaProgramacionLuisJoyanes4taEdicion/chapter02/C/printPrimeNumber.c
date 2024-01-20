/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 26.Diseñar un algoritmo para determinar los números primos iguales o menores que N (leído del teclado).
    (Un número primo sólo puede ser divisible por él mismo y por la unidad.)
*/

#include<stdio.h>
int main(){
    
    int number=0; //numero ingresado
    int count=0; //cuenta las veces que el numero ha sido divido en las iteraciones
    
    printf("Ingrese un numero: ");
    scanf("%d", &number);
    
    for(int i=1; i<=number; i++){

        for(int j=1; j<=i; j++){    
            if(i%j==0){
               count++;
            }
        } 
        if(count==1){
            printf("%d", i); 
        }else if(count==2){
            printf(", %d", i);  
        }
        count=0;    
    }
    printf("\n");              
}