/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 12.-Algoritmo que nos indique si un numero entero leido de teclado tiene 1, 2, 3 o mas digitos. Considerar los negativos.
    ejemplo 4.14, Pagina 144
*/
using System;
class ThreeDigits{

    public static void Main(string[] args){
        int number=0;

        System.Console.Write("Programa que nos indica si un numero entero leido de teclado tiene 1, 2, 3 o mas digitos. Considera los negativos.\n\n");
        System.Console.Write("Ingrese un numero: ");
        number=int.Parse(System.Console.ReadLine());

        if((number>=0 && number<10) || (number>-10 && number<=0)){
            System.Console.Write("El numero "+number+" tiene una cifra");
        }else if((number>=10 && number<100) || (number<=-10 && number>-100)){
            System.Console.Write("El numero "+number+" tiene dos cifras");
        }else if((number>=100 && number<1000) || (number<=-100 && number>-1000)){
            System.Console.Write("El numero "+number+" tiene tres cifras");
        }else{
            System.Console.Write("El numero "+number+" tiene mas de tres cifras");
        }
        System.Console.Write("\n\n");
    }
}