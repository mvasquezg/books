
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 21.-Si el número es positivo, sumar el número a total de positivos, sino sumar al total de negativos.

    Ejercicios
    4.1 (c) Pagina 155
*/
using System;

class SumNegPosNumber{    
    public static void Main(string[] args){
        int num=0, sumPosit=0, sumNegat=0;
        char resp='0';

        System.Console.Write("Programa que de un listado de numero evalua Si el número es positivo, sumar el número a total de positivos, sino sumar al total de negativos.\n\n");    

        do{
            System.Console.Write("Ingresa un numero: ");
            num=int.Parse(System.Console.ReadLine());

            if(num<0){
                sumNegat+=num;
            }else{
                sumPosit+=num;
            }

            System.Console.Write("\nDesea agregar otro numero: ");
            resp=System.Console.ReadLine()[0];

        }while(resp!='n');

        System.Console.Write("\nSuma de numeros positivos: "+sumPosit+"\nSuma de numeros negativos: "+sumNegat+"\n\n");
    }
}    