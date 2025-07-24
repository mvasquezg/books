/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 32.-Escriba un programa que simule el funcionamiento normal de un ascensor (elevador) moderno 
                con 25 pisos (niveles) y que posee dos botones de SUBIR y BAJAR, 
                excepto en el piso (nivel) inferior, que sólo existe botón de llamada para SUBIR 
                y en el último piso (nivel) que sólo existe botón de BAJAR.

    Pagina 156
*/

using System;
class Elevator{    
    public static void Main(string[] args){
        int floor=1, option=1;

        do{
            if(floor==1){
                option=2;
                System.Console.Write("\nSe encuentra en el piso: "+floor+"\nIngresa el numero de piso 2-25. 0 para salir: ");
                floor=int.Parse(System.Console.ReadLine());
            }


            if(floor==25){
                option=1;
                System.Console.Write("\nSe encuentra en el piso: "+floor+"\nIngresa un numero de piso 1-24. 0 para salir: ");
                floor=int.Parse(System.Console.ReadLine());
            }

            if (floor>1 && floor<25){
                System.Console.Write("\nSe encuentra en el piso: "+floor+"\n0.Salir\n1.-Bajar\n2.-Subir\nPresione alguna opcion: ");
                option=int.Parse(System.Console.ReadLine());
            }

            if(option!=0){
                System.Console.Write("\nIngresa el numero de piso al que desa ir:");
                floor=int.Parse(System.Console.ReadLine());
            }   
        }while(option!=0);
    }
}    