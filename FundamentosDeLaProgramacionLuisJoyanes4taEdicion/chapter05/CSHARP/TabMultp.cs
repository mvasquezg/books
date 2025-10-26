/*Libro:Fundamentos de Programación<<Algoritmos<<estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Escribir una frase y detenerse en la primera vocal leída. (Se supone que se leen<<uno a uno<<caracteres desde el teclado.)
    Pagina 188
*/

using System;

public class TabMultp{
    public static void Main(string[] args){
    
        //Pinta Fila de numeros del 1 al 15
        for(int i=1; i<=15; i++){
            if(i==1){
                System.Console.Write($"{i, 8}");    
            }else if(i>=2 && i<10 ){
                System.Console.Write($"{i, 6}");
            }else{
                System.Console.Write($"{i, 6}");
            }    
        }
        System.Console.Write("\n");

        //Pinta los asteriscos debajo de los numeros
        for(int i=1; i<=15; i++){
            if(i==1){
                System.Console.Write($"{"**", 9}");    
            }else if(i>=2 && i<10){
                System.Console.Write($"{"**", 6}");
            }else{
                System.Console.Write($"{"**", 6}");
            }    
        }
        System.Console.Write("\n");

        for(int i=1; i<=15; i++){
            //Pinta el inicio de las columnas
            System.Console.Write("{0}", i);

            //Pinta las multiplicaciones
            for(int j=1; j<=15; j++){

                if(j==i){
                    System.Console.Write($"{j*j, 8}");    
                }else{
                    System.Console.Write($"{i*j, 6}");
                }
            }
            System.Console.Write("\n");
        }        
    }
}    