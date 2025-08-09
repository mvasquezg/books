/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 10.-Sentecia continue. 
    Pagina 177
*/
using System;
class ContinueSentence{    
    public static void Main(string[] args){

           System.Console.Write("Cuenta del 1 - 25:\n\n");
            for(int i=1; i<=25; i++){

                if(i==5){
                    continue;
                }
                System.Console.Write(i+" ");
            }
            System.Console.Write("\n");
    }
}