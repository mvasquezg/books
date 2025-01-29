/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 08.-Se desea convertir las calificaciones alfabeticas A, B, C, D, E y F a calificaciones
    numericas 4, 5, 6, 7, 8, 9 respectivamente.

    A=4 
    B=5 
    C=6 
    D=7 
    E=8
    F=9
    
    ejemplo 4.10, Pagina 141
*/
using System;
class AlphabeticalRaitings{
    public static void Main(string[] args){
        char letter='0';
        int cal=0;

        System.Console.Write("Se desea convertir las calificaciones alfabeticas A, B, C, D, E y F a calificaciones numericas 4, 5, 6, 7, 8, 9 respectivamente.\n");
        System.Console.Write("\nA=4\nB=5\nC=6\nD=7\nE=8\nF=9\n\n");

        System.Console.Write("Ingresa una letra: ");
        letter=System.Console.ReadLine()[0];

        switch(letter){
            case 'A':
               cal=4;
               break;
            case 'B':
               cal=5;
               break;
            case 'C':
               cal=6;
               break;
            case 'D':
               cal=7;
               break;
            case 'E':
               cal=8;
               break;
            case 'F':
               cal=9;
               break;
            default:
                System.Console.Write("Calificacion no valida\n\n");
                break;                   
        }

        if(cal!=0){
            System.Console.Write("La calificacion "+letter+" es equivalente a "+cal+"\n\n");
        }

    }
}