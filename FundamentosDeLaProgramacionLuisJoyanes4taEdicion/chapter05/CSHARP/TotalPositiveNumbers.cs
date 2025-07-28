/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 02.-Contar los números enteros positivos introducidos por teclado. Se consideran dos variables enteras numero 
                y contador (contará el número de enteros positivos). Se supone que se leen números positivos y se detiene 
                el bucle cuando se lee un número negativo o cero.
    Pagina 161
*/
using System;
class TotalPositiveNumbers{    
    public static void Main(string[] args){
        int num=0, totalNumbers=0;
    
        System.Console.Write("Contar los números enteros positivos introducidos por teclado.\nSe supone que se leen números positivos y se detiene el bucle cuando se lee un número negativo o cero.");
        System.Console.Write("\n\nIngrese un numero: ");
       num=int.Parse(System.Console.ReadLine());
    
        while(num>0){
            totalNumbers++;
            System.Console.Write("Ingrese un numero: ");
           num=int.Parse(System.Console.ReadLine());
        }
    
        System.Console.Write("\nTotal de numeros positivos ingresados: "+totalNumbers+"\n");
    }
}
