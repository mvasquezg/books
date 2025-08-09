/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 10.-Sentecia continue. 
    Pagina 177
*/

#include<stdio.h>
void main(){
    
        printf("Cuenta del 1 - 25:\n\n");
        for(int i=1; i<=25; i++){
            printf("%d, ", i);
            
            if(i==5){
                continue;
            }
        }
        printf("\n");
}
