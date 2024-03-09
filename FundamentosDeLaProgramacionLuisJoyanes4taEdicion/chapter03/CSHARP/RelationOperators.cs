/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 07.-Programa que aplica operadores relacionales.

    < Menor que.
    > mayor que.
    == Igual que.
    <= menor o igual que
    >= mayor o igual que 
    != distinto que
*/
using System;

class RelationOperators{
    public static void Main(string[] args){
        int a=4, b=4;
        System.Console.Write("Programa que muestra los operadores relacionales con los numeros A="+a+", B="+b+"\n\n");
        if(a<b){
            System.Console.Write(a+" < "+b+" = Verdadero\n");
        }else{
            System.Console.Write(a+" < "+b+" = Falso\n");
        }

        if(a>b){
            System.Console.Write(a+" > "+b+" = Verdadero\n");
        }else{
            System.Console.Write(a+" > "+b+" = Falso\n");
        }
    
        if(a==b){
            System.Console.Write(a+" == "+b+" = Verdadero\n");
        }else{
            System.Console.Write(a+" == "+b+" = Falso\n");
        }
    
        if(a<=b){
            System.Console.Write(a+" <= "+b+" = Verdadero\n");
        }else{
            System.Console.Write(a+" <= "+b+" = Falso\n");
        }
    
        if(a>=b){
            System.Console.Write(a+" >= "+b+" = Verdadero\n");
        }else{
            System.Console.Write(a+" >= "+b+" = Falso\n");
        }
    
        if(a!=b){
            System.Console.Write(a+" != "+b+" = Verdadero\n");
        }else{
            System.Console.Write(a+" != "+b+" = Falso\n");
        }

        System.Console.Write("\n\n");
    }
}