/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 10.-Leida una fecha, decir el dia de la semana, suponiendo que el dia 1 de dicho mes fue lunes.
    ejemplo 4.12, Pagina 142
*/
#include<stdio.h>
void main(){
   int day=0, month=0, year=0, d=0;
    printf("\nLeida una fecha, decir el dia de la semana, suponiendo que el dia 1 de dicho mes fue lunes.\nConsidere que todos los meses tengan 31 dias\n");
    printf("\nIngrese la fecha:\nDia: ");
    scanf("%d", &day);
    printf("Mes: ");
    scanf("%d", &month);
    printf("Ingrese anho: ");
    scanf("%d", &year);
    d=day%7;
    printf("\n");
    switch(d){
        case 1:
            printf("La fecha %d-%d-%d, el dia fue: Lunes", day, month, year);
            break;
        case 2:
            printf("La fecha %d-%d-%d, el dia fue: Martes", day, month, year);
            break;
        case 3:
            printf("La fecha %d-%d-%d, el dia fue: Miercoles", day, month, year);
            break;
        case 4:
            printf("La fecha %d-%d-%d, el dia fue: Jueves", day, month, year);
            break;        
        case 5:
            printf("La fecha %d-%d-%d, el dia fue: Viernes", day, month, year);
            break;
        case 6:
            printf("La fecha %d-%d-%d, el dia fue: Sabado", day, month, year);
            break;
        case 0:
            printf("La fecha %d-%d-%d, el dia fue: Domingo", day, month, year);
            break;            
    }
    printf("\n\n");
}