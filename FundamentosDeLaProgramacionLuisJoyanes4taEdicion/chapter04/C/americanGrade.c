/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 31.-El sistema de calificación americano (de Estados Unidos) se suele calcular de acuerdo al siguiente cuadro:

                 Grado numérico                                                        Grado en letra
                 Grado mayor o igual a 90                                                A
                 Menor de 90 pero mayor o igual a 80                                         B   
                 Menor de 80 pero mayor o igual a 70                                         C
                 Menor de 70 pero mayor o igual a 69                                         D
                 Menor de 69                                                                 F

                Utilizando esta información, escribir un algoritmo que acepte una calificación numérica del estudiante (0-100),
                convierta esta calificación a su equivalente en letra y visualice la calificación correspondiente en letra.

    Pagina 155-156
*/
#include<stdio.h>
void main(){
    int cal=0;
    printf("Programa que acepte una calificación numérica del estudiante (0-100), convierta esta calificación a su equivalente en letra y visualice la calificación correspondiente en letra.");
    printf("\nDe acuerdo a la siguiente tabla: ");
    printf("\n\nGrado numérico\t\t\t\tGrado en letra");
    printf("\nGrado mayor o igual a 90\t\t\tA");
    printf("\nMenor de 90 pero mayor o igual a 80\t\tB");   
    printf("\nMenor de 80 pero mayor o igual a 70\t\tC");
    printf("\nMenor de 70 pero mayor o igual a 69\t\tD");
    printf("\nMenor de 69\t\t\t\t\tF");

    printf("\n\nIngresa la calificacion numerica: ");
    scanf("%d", &cal);

    if(cal>=90){
        printf("La calificacion %d es igual a: A", cal);
    }else if(cal>=80 && cal<90){
        printf("La calificacion %d es igual a: B", cal);
    }else if(cal>=70 && cal<80){
        printf("La calificacion %d es igual a: C", cal);
    }else if(cal==69){
        printf("La calificacion %d es igual a: D", cal);
    }else{
        printf("La calificacion %d es igual a: F", cal);
    }
    printf("\n");
}