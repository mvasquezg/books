/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 30.Muchos bancos y cajas de ahorro calculan los intereses de las cantidades depositadas 
    por los clientes diariamente según las premisas siguientes. 
    
    Un capital de 1.000 euros, con una tasa de interés del 6 por 100, renta un interés en un día de 0,06 
    multiplicado por 1.000 y dividido por 365. Esta operación producirá 0,16 euros de interés y el capital 
    acumulado será 1.000,16. El interés para el segundo día se calculará multiplicando 0,06 por 1.000 y 
    dividiendo el resultado por 365. 

    Diseñar un algoritmo que reciba tres entradas: el capital a depositar, la tasa de interés y 
    la duración del depósito en semanas, y calcular el capital total acumulado al final del período de tiempo 
    especificado.
*/
import java.util.Scanner;
public class SavingBank{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int capital=0;              //Dinero a invertir
        float interest=0;             //intres ganado
        int numberOfWeeks=0;        //Numero de Semanas
        int totalDays=0;            //Dias totales
        float interestPercentage=0; //Porcentaje del interes 
        float sumDayInterest=0;     //Suma de los interes diarios
        float acumTotal=0;          //capital + interes
        System.out.print("Ingrese la cantidad a invertir: ");
        capital=in.nextInt();

        System.out.print("Ingrese el interes: ");
        interest=in.nextFloat();

        System.out.print("Ingrese el numero de semanas: ");
        numberOfWeeks=in.nextInt();

        interestPercentage=interest/100;
        totalDays=numberOfWeeks*7;

        for(int i=1; i<=totalDays; i++){
            sumDayInterest+=(capital*interestPercentage)/365;
        }
        acumTotal=capital+sumDayInterest;
        System.out.print("\n\nEl interes ganado en "+sumDayInterest+"\nNumero de Semanas de inversion: "+numberOfWeeks+"\nAcumulaod total: $ "+acumTotal+"\n\n");
    }
}