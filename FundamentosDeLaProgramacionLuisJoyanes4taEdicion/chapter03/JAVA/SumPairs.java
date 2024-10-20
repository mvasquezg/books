/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 28.-Escribir la suma de los primeros diez numeros pares.
*/

public class SumPairs{    
    public static void main(String[] arg){
        int sum=0;
 
        System.out.print("\n2");
        sum=2;
        for(int i=2; i<=10; i++){
            sum+=i*2;
            System.out.print(" + "+(i*2));
        }
 
        System.out.print(" = "+sum+"\n\n");
 
    }
} 