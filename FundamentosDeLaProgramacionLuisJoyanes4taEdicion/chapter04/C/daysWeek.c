/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 18.-Construir un algoritmo que escriba los nombres de los días de la semana, en función de la entrada correspondiente
a la variable DIA.
        1. LUNES
        2. MARTES
        3. MIERCOLES
        4. JUEVES
        5. VIERNES
        6. SABADO
        7. DOMINGO
    
        Actividades de programacion Resueltas
        4.4, Pagina 152-153

*/
#include<stdio.h>
void main(){
    int day=0;
    printf("Ingresa un numero del 1 al 7, para indicar el dia del semana\nIngresa un numero: ");
    scanf("%d", &day);
    printf("\n");
    switch(day){
        case 1:
            printf("Dia %d es: Lunes", day);
            break;
        case 2:
            printf("Dia %d es: Martes", day);
            break; 
        case 3:
            printf("Dia %d es: Miercoles", day);
            break;
        case 4:
            printf("Dia %d es: Jueves", day);
            break;
        case 5:
            printf("Dia %d es: Viernes", day);
            break;
        case 6:
            printf("Dia %d es: Sabado", day);
            break;
        case 7:
            printf("Dia %d es: Domingo", day);
            break;
        default:
            printf("El valor ingresado no pertenece a algun dia de la semana.");
            break;                            
    }
    printf("\n\n");
}   