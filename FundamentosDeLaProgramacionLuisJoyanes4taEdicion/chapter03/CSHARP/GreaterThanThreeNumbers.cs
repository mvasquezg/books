/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 13.-Determinar el mayor de tres numeros.
*/
using System;
class GreaterThanThreeNumbers{
    public static void Main(string[] args){
        int num1=0, num2=0, num3=0;

        System.Console.Write("Ingresa el primer numero: ");
        num1=int.Parse(Console.ReadLine());

        System.Console.Write("Ingresa el segundo numero: ");
        num2=int.Parse(Console.ReadLine());

        System.Console.Write("Ingresa el tercer numero: ");
        num3=int.Parse(Console.ReadLine());

        if(num1==num2){

            if(num2==num3){
                System.Console.Write("Los tres numeros son iguales.");
            }else if(num2>num3){
                System.Console.Write(num1+" y "+num2+" son iguales y mayores");
            }else{
                System.Console.Write(num3+" es mayor");
            }
        }else if(num1>num2){
            if(num2==num3){
                System.Console.Write(num1+" es mayor");
            }else if(num2>num3){
                System.Console.Write(num1+" es mayor");
            }else{
                if(num1==num3){
                    System.Console.Write(num1+" y "+num3+" son iguales y mayores");
                }else if(num1>num3){
                    System.Console.Write(num1+"%d es mayor");
                }else{
                    System.Console.Write(num3+" es mayor");
                }
            }
        }else{
            if(num2==num3){
                System.Console.Write(num2+" y "+num3+" son iguales y mayores");
            }else if(num2>num3){
                System.Console.Write(num2+" es mayor");
            }else{
                System.Console.Write(num3+" es mayor");
            }
        }
        System.Console.Write("\n\n");
    }
}