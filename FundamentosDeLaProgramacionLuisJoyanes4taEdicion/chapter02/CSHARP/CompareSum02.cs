/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 24. Programa que lea tres numeros y descubra si uno de ellos es la suma de los otros dos
*/
using System;
class CompareSum{
    public static void Main(string[] args){
        int num1=0;   //numero1
        int num2=0;   //numero2
        int num3=0;   //numero3
        int sum1=0;   //suma de numero1+numero2
        int sum2=0;   //suma de numero1+numero3
        int sum3=0;   //suma de numero2+numero3
        System.Console.Write("\nIngresa el primer numero: ");
        num1=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingresa el segundo numero: ");
        num2=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingresa el tercer numero: ");
        num3=int.Parse(System.Console.ReadLine());
        sum1=num1+num2;
        sum2=num1+num3;
        sum3=num2+num3;
        if(sum1==num3){
            System.Console.Write("\nSon iguales\n");
        }else if(sum2==num2){
            System.Console.Write("\nSon iguales\n");
        }else if(sum3==num1){
            System.Console.Write("\nSon iguales\n");
        }else{
            System.Console.Write("\nSon Distintos\n");
        }    
    }
}