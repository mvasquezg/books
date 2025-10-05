/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 03.-Definición de la función: y = x^n (potencia n de x)
    
    Ejemplo3
    Pagina 206
*/
#include<stdio.h>

//Funcion showY
void calculateY(int x, int n){
    int result=1;

    for(int i=1; i<=n; i++){
        result*=x;
    }

    printf("El resultado de la funcion Y=x^n es igual a:\nx=%d\nn=%d\n\nY=%d\n", x,n, result);
}


void main(){
    int x=0, n=0;
    printf("Program que calcula la funcion de Y=x^n.\nIngresa el valor x: ");
    scanf("%d", &x);

    printf("Ingresa el valor de n: ");
    scanf("%d", &n);

    printf("\n\n************");
    printf("\nLLamando a la funcion showY()\n");
    calculateY(x, n);
    
}