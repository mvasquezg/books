/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 025.-Diseñar un algoritmo para calcular la velocidad (en m/s) de los corredores de la carrera 
    de 1.500 metros.
    
    La entrada consistirá en parejas de números (minutos,segundos) que dan el tiempo del corredor; por cada
    corredor, el algoritmo debe visualizar el tiempo en minutos y segundos, así como la velocidad media. 2.14. Escribir un algoritmo que cuente el número de ocu-
    
    Ejemplo de entrada de datos: (3,53) (3,40) (3,46), (3,52) (4,0) (0,0); el último par de datos se utilizará
    como fin de entrada de datos.*/
#include<stdio.h>

void main(){
    int min=0;      //minutos
    int sec=0;      //segundos
    int sumSec=0;   //sumaSegundos
    int sumMin=0;   //sumaMinutos
    int count=0;    //Contador
    int average=0;  //promedio
    int minsToSeconds=0; //Minitos convertidos a segundos
    int totalSeconds=0;  //Total de segunsos
    int m=0;            //Minutos
    int s=0;            //Segundos

    printf("Captura el tiempo de los corredores (minutos, segundos).\nPara terminar la captura ingresa (0,0).\n");
    do{
        printf("\ningresa minutos: ");
        scanf("%d", &min);

        printf("ingresa segundos: ");
        scanf("%d", &sec);

        if(min>0){
            sumMin+=min;
            sumSec+=sec;

            count++;
        }
    }while(min>0);

    minsToSeconds=sumMin*60;
    totalSeconds=minsToSeconds+sumSec;

    average=totalSeconds/count;

    m=average/60;
    s=average%60;

    printf("\n\nPromedio de Minutos y segundps alcanzado\nMinuto: %d\nSegundos: %d\n\n", m, s);
}
