/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 03.-Obtener un algoritmo que lea un número (por ejemplo, 198) y obtenga el número inverso (por ejemplo, 891).
    Pagina 166
*/

using System;
class InverseNumber{    
    public static void Main(string[] args){
        int num=0, inverseNumber=0;

        System.Console.Write("Programa que lee un número (por ejemplo, 198) y obtenga el número inverso (por ejemplo, 891).\n\nIngresa un numero: ");
        num=int.Parse(System.Console.ReadLine());

        System.Console.Write("\nNumero Inverso: ");
        do{
            inverseNumber=num%10;
            System.Console.Write(inverseNumber);
            num=num/10;
        }while(num>0);
        System.Console.Write("\n");
    }
}    