/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición.
  Capitulo 02.-Metodología de la programación y desarrollo de software.
  Problema 01.Se desea obtener una tabla con las depreciaciones acumuladas y los valores reales de cada año, de un automóvil
  comprado por 20.000 euros en el año 2005, durante los seis años siguientes suponiendo un valor de recuperación o
  rescate de 2.000. Realizar el análisis del problema, conociendo la fórmula de la depreciación anual constante D
  para cada año de vida útil.

    D = coste – valor de recuperación/vida útil

    D = (20,000 – 2,000)/6 = 18,000/6 = 3,000  
*/
import java.util.Scanner;
class Depreciation{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int cost=0;             //Costo 
        int salvageValue=0;     //Costo de recuperación
        int usefulLife=0;       //Vida util;
        int yearOfPurcharse=0;  //anho de compra
        int depreciation=0;     //Depreciacion 
        int acumDepreciation=0; //Depreciacion Acumulada

        System.out.print("Ingresa el anho de compra del vehiculo: ");
        yearOfPurcharse=in.nextInt();
        System.out.print("Ingresa el costo del vehiculo: ");
        cost=in.nextInt();
        System.out.print("Ingresa el costo de recuperacion del vehiculo: ");
        salvageValue=in.nextInt();
        System.out.print("Ingresa la vida util del vehiculo: ");
        usefulLife=in.nextInt();

        depreciation=(cost-salvageValue)/usefulLife;
        acumDepreciation = depreciation;

        System.out.print("\n\n   Anho\t\tDepreciacion\tDepreciacion Acumulada\tValor anual\n");
        for(int i=1; i<=usefulLife; i++){
            System.out.print(i+".-"+(yearOfPurcharse+i)+"\t\t"+depreciation+"\t\t"+acumDepreciation+"\t\t\t"+(cost-acumDepreciation)+"\n");
            acumDepreciation+=depreciation;
        }
    }  
}