/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 05.-imprimir letras minúsculas del alfabeto
    Pagina 168
*/
using System;
class LettersLowerCase{
    public static void Main(string[] args){
        char letter='a';

        System.Console.Write("Alfabeto en minuscula: \n\n");
        do{
            System.Console.Write(letter+" ");
            letter++;
        }while(letter<='z');
        System.Console.Write("\n");
    }
}