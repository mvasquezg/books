/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 04.-Cuenta hasta 10
    Pagina 167
*/
using System;
class CountToTen{    
    public static void Main(string[] args){
        int num=1;

        System.Console.Write("Programa que cuenta del 1-10 usando ciclo do-while: \n");
        do{
            System.Console.Write(num+", ");
            num++;
        }while(num<=10);
        System.Console.Write("\n");
    }
}