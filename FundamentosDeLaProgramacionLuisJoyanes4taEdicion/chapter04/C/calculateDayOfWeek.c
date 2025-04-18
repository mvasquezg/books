/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 11.-Preguntar que dia fue el dia 1 del mes actual y calcular que dia de la semana es hoy.
    ejemplo 4.13, Pagina 143
*/
#include<stdio.h>
void main(){
    int day=0, dayNow=0, dayCalculate=0, d=0;
    char dayChar='0';
    printf("Programa que pregunta el dia que inicia el mes:\n\tlunes, martes, miercoles, Jueves, viernes sabado o domingo\ncalcula que dia de la semana es hoy.\n");
    printf("\nIngrese la inicial del primer dia del mes \n\tL (Lunes):\n\tM (Martes)\n\tX (MIercoles)\n\tJ (Jueves)\n\tV (Viernes)\n\tS (Sabado)\n\tD (Domingo)\nElige la opcion: ");
    scanf("%c", &dayChar);

    switch(dayChar){
        case 'L':
            day=0;
            break;
        case 'M':
            day=1;
            break; 
        case 'X':
            day=2;
            break;
        case 'J':
            day=3;
            break;
        case 'V':
            day=4;
            break;
        case 'S':
            day=5;
            break;
        case 'D':
            day=6;
            break;
        default:
            day=-1;
            break;
    }
    printf("\n");
    if(day!=-1){
        printf("Ingrese el fecHa de hoy: ");
        scanf("%d", &dayNow);

        dayCalculate=dayNow+day;

        d=dayCalculate%7;

        printf("\n");
        switch(d){
            case 1:
                printf("\nEl dia de hoy es: Lunes");
                break;
            case 2:
                printf("\nEl dia de hoy es: Martes");
                break;
            case 3:
                printf("\nEl dia de hoy es: Miercoles");
                break;
            case 4:
                printf("\nEl dia de hoy es: Jueves");
                break;        
            case 5:
                printf("\nEl dia de hoy es: Viernes");
                break;
            case 6:
                printf("\nEl dia de hoy es: Sabado");
                break;
            case 0:
                printf("\nEl dia de hoy es: Domingo");
                break;            
        }
    }else{
        printf("El dia ingresado no existe como valor. Adios.");
    }

    printf("\n\n");
}