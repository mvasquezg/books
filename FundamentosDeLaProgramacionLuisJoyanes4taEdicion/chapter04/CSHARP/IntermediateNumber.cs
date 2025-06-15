
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 25.-Dados tres números deducir cuál es el central.

    Ejercicios:
    4.3  página 155 
*/
using System;
class IntermediateNumber{
    public static void Main(string[] args){
        int num1=0, num2=0, num3=0;
        System.Console.Write("Programa que dado tres números deducir cuál es el central.\n\n");
        System.Console.Write("Ingresa el primer numero: ");
        num1=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el segundo numero: ");
        num2=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el tercer numero: ");
        num3=int.Parse(System.Console.ReadLine());

        System.Console.Write("\n");
        if(num1==num2 && num2==num3){
            System.Console.Write("Todos los numeros son iguales");
        }
        System.Console.Write("\n");
        if(num1>num2){  
            if(num2==num3){
                System.Console.Write("No hay numero intermedio.");
            }else if(num2>num3){
                System.Console.Write("Numero de enmedio es: "+num2);
            }else{
                System.Console.Write("Numero de enmedio es: "+num3);
            }
        }else { 
            if(num1==num3){
                System.Console.Write("No hay numero intermedio.");
            }else if(num1>num3){
                System.Console.Write("Numero de enmedio es: "+num1);
            }else{
                System.Console.Write("Numero de enmedio es: "+num2);
            }
        }
        System.Console.Write("\n\n");
    }
}