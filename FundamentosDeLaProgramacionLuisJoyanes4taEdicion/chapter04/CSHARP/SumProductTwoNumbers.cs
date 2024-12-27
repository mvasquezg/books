/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 01.-Calcula la suma y el producto de dos numeros.
    ejemplo 4.1, pagina 129
*/
using System;
class SumProductTwoNumbers{
    public static void Main(string[] args){
        int num1=0, num2=0, sum=0, product=0;

        System.Console.Write("Programa que calcula la suma y el producto de dos numeros. \n\nIngrese el primer numero: ");
        num1=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingrese el segundo numero: ");
        num2=int.Parse(System.Console.ReadLine());

        sum=num1+num2;
        product=num1*num2;

        System.Console.Write("\nSuma:\n"+num1+" + "+num2+" = "+sum+"\n\n");
        System.Console.Write("\nProducto:\n"+num1+" * "+num2+" = "+product+"\n\n");
    }
}     