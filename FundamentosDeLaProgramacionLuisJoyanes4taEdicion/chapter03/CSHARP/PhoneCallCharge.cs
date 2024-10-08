/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 14.-Determinar el cobro de una llamada telefonica considerando lo siguiente:
    
    a) Toda llamada que dure menos de tres minutos (5 pasos), tiene un coste de 10 centimos.
    b) Cada minuto adicional a partir de los primeros tres minutos es un paso de contador y cuesta 5 centimos.

*/
using System;
class PhoneCallCharge{
    public static void Main(string[] args){
        int numberOfSteps=0, differenceInSteps=0;
        float subtotal=0, total=0;
        System.Console.Write("Ingrese la cantidad de pasos: ");
        numberOfSteps=int.Parse(System.Console.ReadLine());

        if(numberOfSteps<=5){
            total=10;
        }else{
            differenceInSteps=numberOfSteps-5;
            subtotal=differenceInSteps*5;
            total=subtotal+10;
        }

        System.Console.Write("Total a pagar "+total+" centimos.\n\n");
    }
}