/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición.
  Capitulo 02.-Metodología de la programación y desarrollo de software.  
  Problema 01.Se desea obtener una tabla con las depreciaciones acumuladas y los valores reales de cada año, de un automóvil
  comprado por 20.000 euros en el año 2005, durante los seis años siguientes suponiendo un valor de recuperación o
  rescate de 2.000. Realizar el análisis del problema, conociendo la fórmula de la depreciación anual constante D
  para cada año de vida útil.

D = coste – valor de recuperación/vida útil

D = (20,000 – 2,000)/6 = 18,000/6 = 3,000  
*/
using System;
class Depreciation{
    public static void Main(string[] args){
        int cost=0;             //Costo 
        int salvageValue=0;     //Costo de recuperación
        int usefulLife=0;       //Vida util;
        int yearOfPurcharse=0;  //anho de compra
        int depretiation=0;     //Depreciacion 
        int acumDepretiation=0; //Depreciacion Acumulada

        System.Console.Write("Ingresa el anho de compra del vehiculo: ");
        yearOfPurcharse=int.Parse(Console.ReadLine());

        System.Console.Write("Ingresa el costo del vehiculo: ");
        cost=int.Parse(Console.ReadLine());

        System.Console.Write("Ingresa el costo de recuperacion del vehiculo: ");
        salvageValue=int.Parse(Console.ReadLine());

        System.Console.Write("Ingresa la vida util del vehiculo: ");
        usefulLife=int.Parse(Console.ReadLine());

        depretiation=(cost-salvageValue)/usefulLife;
        acumDepretiation = depretiation;

        System.Console.Write("\n\nAnho\tDepreciacion\tDepreciacion Acumulada\tValor anual\n");
        for(int i=1; i<=usefulLife; i++){
            System.Console.Write((yearOfPurcharse+i)+"\t"+depretiation+"\t\t"+acumDepretiation+"\t\t\t"+(cost-acumDepretiation)+"\n");
            acumDepretiation+=depretiation;
        } 
    }  
}