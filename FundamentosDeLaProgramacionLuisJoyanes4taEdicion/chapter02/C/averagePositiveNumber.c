/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 09.Calcular el promedio de una serie de números positivos. 
    Un valor de cero indicará que se ha alcanzado el final de la serie de números positivos
*/

#include<stdio.h>

int main(){
    int number=0;
    int average=0;
    int count=0;
    int sum=0;

    printf("Ingresa un numero: ");
    scanf("%d", &number);
    
    while(number>0 || number<0){

        if(number>0){
            sum+=number;
            count++;
        }

        printf("Ingresa un numero: ");
        scanf("%d", &number);    
    }
    
    average=sum/count;

    printf("\n\nSuma: %d\nNumeros positvos ingresados: %d \nPromedio: %d\n\n", sum, count, average);
}