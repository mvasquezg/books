/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Escribir una frase y detenerse en la primera vocal leída. (Se supone que se leen, uno a uno, caracteres desde el teclado.)
    Pagina 188
*/
#include<stdio.h>
void main(){

    //Pinta Fila de numeros del 1 al 15
    for(int i=1; i<=15; i++){
        if(i==1){
            printf("%8d", i);    
        }else if(i>=2 && i<10 ){
            printf("%6d", i);
        }else{
            printf("%6d", i);
        }    
    }
    printf("\n");

    //Pinta los asteriscos debajo de los numeros
    for(int i=1; i<=15; i++){
        if(i==1){
            printf("%8c%c", '*', '*');    
        }else if(i>=2 && i<10){
            printf("%5c%c", '*', '*');
        }else{
            printf("%5c%c", '*', '*');
        }    
    }
    printf("\n");
    
    for(int i=1; i<=15; i++){
        //Pinta el inicio de las columnas
        printf("%d", i);

        //Pinta las multiplicaciones
        for(int j=1; j<=15; j++){
            
            if(j==i){
                printf("%8d", (j*j));    
            }else{
                printf("%6d", (i*j));
            }
        }
        printf("\n");
    }        
}