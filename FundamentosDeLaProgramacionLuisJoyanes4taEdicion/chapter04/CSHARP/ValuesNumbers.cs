
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 22.-Si x es mayor que y, y z es menor que 20, leer un valor para p

    Ejercicios
    4.1 (d) Pagina 155
*/
using System;

class ValuesNumbers{
    public static void Main(string[] args){
        int x=0, y=0, z=0, p=0;

        System.Console.Write("Programa que lee el valor de P si X es mayor que Y, y Z es menor que 20.\n");
        System.Console.Write("\nIngresa el valor x: ");
        x=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingresa el valor y: ");
        y=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingresa el valor z: ");
        z=int.Parse(System.Console.ReadLine());    


        if( (x>y) && (z<20)){
            System.Console.Write("Ingresa el valor p: ");
            p=int.Parse(System.Console.ReadLine());
        }else{
            System.Console.Write("\nNo se cumple la condicion X>Y && z<20");
        }
        System.Console.Write("\n\nLos valores son: X="+x+", Y="+y+", Z="+z+", P="+p+"\n\n");
    }
}    