/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Escribir una frase y detenerse en la primera vocal leída. (Se supone que se leen, uno a uno, caracteres desde el teclado.)
    Pagina 188
*/
using System;
class VocalEndBucle{

    public static void Main(string[] args){
        char letter='0';

        System.Console.Write("El programa termina al leer una vocal\n\n");
        do{
            System.Console.Write("Ingresa un letra: ");
            letter=System.Console.ReadLine()[0];

        }while(letter!='a' && letter!='e' && letter!='i' && letter!='o' && letter!='u');

        System.Console.Write("\n\nLa vocal que termino el ciclo es: "+letter+"\n\n");
    }
}