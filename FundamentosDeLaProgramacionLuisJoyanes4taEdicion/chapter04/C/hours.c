/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 14.-Algoritmo al que le damos la HH, MM, SS. y nos calcule la hora dentro de un segundo.
    Leeremos las horas, minutos y segundos como numeros enteros. 
    ejemplo 4.18, Pagina 148
*/
#include<stdio.h>
void main(){
    int h=0, m=0, s=0;
    printf("Programa al que le damos la HH, MM, SS. y nos calcule la hora dentro de un segundo");

    printf("\n\ningrese la hora: ");
    printf("ingrese la hora: ");
    scanf("%d", &h);
    printf("ingrese los mm: ");
    scanf("%d", &m);
    printf("ingrese los segundos: ");
    scanf("%d", &s);

    if(h<24 && m<60 && s<60){
        s=s+1;

        if(s==60){
            s=0;
            m=m+1;

            if(m==60){
                m=0;
                h=h+1;
            }

            if(h==24){
                h=00;
            }
        }
    }
    printf("La hora es:  %d:%d:%d hrs\n\n", h, m, s);

}