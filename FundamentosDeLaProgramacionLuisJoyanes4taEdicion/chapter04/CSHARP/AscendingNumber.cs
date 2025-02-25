/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 15.-Leer dos numeros y deducir si estan en orden creciente. 
    Actividades de programacion Rsueltas
    4.1, Pagina 151
*/
using System;
class AscendingNumber{    
    public static void Main(string[] args){
        int num1=0, num2=0;

        System.Console.Write("Programa que lee dos numeros y deducir si estan en orden creciente.");
        System.Console.Write("\n\nIngrese el primer numero: ");
        num1=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingrese el segundo numero: ");
        num2=int.Parse(System.Console.ReadLine());

        if(num1<num2){
            System.Console.Write("Los numeros estan en forma ascendente: "+num1+", "+num2);
        }else if(num1==num2){
            System.Console.Write("\nLos numeros son iguales: "+num1+" "+num2);
        }else{
            System.Console.Write("Los numeros estan en forma ascendente: "+num2+", "+num1);
        }
        System.Console.Write("\n\n");
    }
}    