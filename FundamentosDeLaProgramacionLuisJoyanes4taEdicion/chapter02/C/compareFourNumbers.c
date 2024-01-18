/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 023.-Escribir un algoritmo que lea cuatro números y a continuación visualice el mayor de los cuatro
*/
#include<stdio.h>
void main(){
    int a; //Numero 1
    int b; //Numero 2
    int c; //Numero 3
    int d; //Numero 4

    printf("Ingresa el primer numero: ");
    scanf("%d", &a);
    printf("Ingresa el segundo numero: ");
    scanf("%d", &b);
    printf("Ingresa el tercer numero: ");
    scanf("%d", &c);
    printf("Ingresa el cuarto numero: ");
    scanf("%d", &d);

    if(a==b){
        if(b==c){
            if(c==d){
                printf("Los numeros A=%d, B=%d, C=%d, D=%d. Son iguales\n\n", a, b, c, d);
            }else if(c>d){
                printf("Los numeros A=%d, B=%d, C=%d Son iguales y mayores que D=%d\n\n", a, b, c, d);
            }else{
                printf("El numero D=%d es mayor que A=%d, B=%d, C=%d\n\n", d, a, b, c);
            }
        }else if(b>c){
            if(b==d){
                printf("Los numeros A=%d, B=%d, D=%d son mayores que C=%d.\n\n", a, b, d, c);
            }else if(b>d){
                printf("Los numeros A=%d, B=%d, son mayores que C=%d, D=%d .\n\n", a, b, c, d);
            }else{
                printf("El numero D=%d es mayor que A=%d, B=%d, C=%d\n\n", d, a, b, c);
            }
        }else{
            if(c==d){
                printf("Los numeros C=%d, D=%d son mayores que A=%d, B=%d.\n\n", c, d, a, b);
            }else if(c>d){
                printf("El numero C=%d es mayor que A=%d, B=%d, D=%d\n\n", c, a, b, d);
            }else{
                printf("El numero D=%d es mayor que A=%d, B=%d, C=%d\n\n", d, a, b, c);
            }
        }
    }else if(a>b){
        if(a==c){
            if(c==d){
                printf("Los numeros que A=%d, C=%d, D=%d, son mayores que B=%d\n\n", a, c, d, b);
            }else if(c>d){
                printf("Los numeros que A=%d, C=%d, son mayores que B=%d, D=%d\n\n", a, c, b, d);
            }else{
                printf("El numero D=%d, es mayor que A=%d, B=%d, C=%d\n\n", d, a, c, b);
            }
        }else if(a>c){
            if(a==d){
                printf("Los numeros A=%d, D=%d son mayores que  B=%d, C=%d\n\n",  a, d, b, c);
            }else if(a>d){
                printf("El numero A=%d, es mayor que  B=%d, C=%d, D=%d\n\n",  a, b, c, d);
            }else{
                printf("El numero D=%d, es mayor que  A=%d, B=%d, C=%d\n\n", d,  a, b, c);
            }
        }else{
            if(c==d){
             printf("Los numeros C=%d, D=%d son mayores que A=%d, B=%d.\n\n", c, d, a, b); 
            }else if(c>d){
                printf("El numero C=%d es mayor que A=%d, B=%d, D=%d.\n\n", c, a, b, d); 
            }else{
                printf("El numero D=%d es mayor que A=%d, B=%d, C=%d.\n\n", d, a, b, c); 
            }
        }
    }else{
        if(b==c){
            if(c==d){
                printf("Los numeros B=%d, C=%d, D=%d son mayores que A=%d.\n\n", b, c, d, a); 
            }else if(c>d){
                printf("Los numeros B=%d, C=%d son mayores que A=%d, D=%d.\n\n", b, c, a, d); 
            }else{
                printf("El numero D=%d es mayor que A=%d, B=%d, C=%d.\n\n", d, a, b, c); 
            }
        }else if(b>c){
            if(b==d){
                printf("Los numeros B=%d, D=%d son mayores que A=%d, C=%d.\n\n", b, d, a, c); 
            }else if(b>d){
                printf("El numero B=%d es mayor que A=%d, C=%d D=%d.\n\n", b, a, c, d); 
            }else{
                printf("El numero D=%d es mayor que A=%d, B=%d C=%d.\n\n", d, a, b, c); 
            }
            
        }else{
            if(c==d){
                printf("Los numeros C=%d, D=%d son mayores que A=%d, B=%d.\n\n", c, d, a, b); 
            }else if(c>d){
                printf("El numero C=%d es mayor que A=%d, B=%d D=%d.\n\n", c, a, b, d); 
            }else{
                printf("El numero D=%d es mayor que A=%d, B=%d C=%d.\n\n", d, a, b, c); 
            }
        }
    }


}