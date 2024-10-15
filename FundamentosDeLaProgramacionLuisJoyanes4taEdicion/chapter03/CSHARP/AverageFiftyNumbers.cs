/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 23.-Calcular la media de 50 numeros e imprimir el resultado
*/
using System;

class AverageFiftyNumbers{
    
    //constante
    const int MAXVALUE=10;
    
    public static void Main(string[] args){
        int number=0, sum=0;
        float average=0;

        for(int i=1; i<=MAXVALUE; i++){
            System.Console.Write(i+".-Ingresa un numero: ");
            number=int.Parse(System.Console.ReadLine());
            sum+=number;
        }

        average=sum/MAXVALUE;

        System.Console.Write("Suma: "+sum+"\nPromedio: "+average+"\n");
    }
}    