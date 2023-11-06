/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
  Capitulo 02.-Metodología de la programación y desarrollo de software.
  Problema 01.Se desea obtener una tabla con las depreciaciones acumuladas y los valores reales de cada año, de un automóvil
  comprado por 20.000 euros en el año 2005, durante los seis años siguientes suponiendo un valor de recuperación o
  rescate de 2.000. Realizar el análisis del problema, conociendo la fórmula de la depreciación anual constante D
  para cada año de vida útil.

  D = coste – valor de recuperación/vida útil

  D = (20,000 – 2,000)/6 = 18,000/6 = 3,000  
*/
#include<stdio.h>
int main(){
    int cost=0;             //Costo 
    int salvageValue=0;     //Costo de recuperación
    int usefulLife=0;       //Vida util;
    int yearOfPurcharse=0;  //anho de compra
    int depretiation=0;     //Depreciacion 
    int acumDepretiation=0; //Depreciacion Acumulada

    printf("Ingresa el anho de compra del vehiculo: ");
    scanf("%d", &yearOfPurcharse);

    printf("Ingresa el costo del vehiculo: ");
    scanf("%d", &cost);

    printf("Ingresa el costo de recuperacion del vehiculo: ");
    scanf("%d", &salvageValue);

    printf("Ingresa la vida util del vehiculo: ");
    scanf("%d", &usefulLife);

    depretiation=(cost-salvageValue)/usefulLife;
    acumDepretiation = depretiation;

    printf("\n\nAnho\tDepreciacion\tDepreciacion Acumulada\tValor anual\n");
    for(int i=1; i<=usefulLife; i++){
        printf("%d\t%d\t\t%d\t\t\t%d\n", (yearOfPurcharse+i), depretiation, (acumDepretiation), (cost-acumDepretiation) );
        acumDepretiation+=depretiation;
    }
    return 0;
}  