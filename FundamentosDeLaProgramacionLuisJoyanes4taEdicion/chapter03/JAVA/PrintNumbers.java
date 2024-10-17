/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 25.-Disenar un diagrama que permita realizar un contador e imprimir los primeros 100 numeros enteros.
*/

public class PrintNumbers{

    public static void main(String[] args){
    
        System.out.print("1");
        for(int i=2; i<=100; i++){
            System.out.print(", "+i);
        }
        System.out.print("\n");
    }
}