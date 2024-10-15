/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 21.-Sumar los numeros pares del 2 al 100 e imprimir su valor.
*/

public class SumOfPairs{
     
    public static void main(String[] args){

        int sum=0;
        System.out.print(2);
        sum=2;
        for(int i=4; i<=100; i+=2){
            System.out.print(", "+i);
            sum+=i;
        }
        System.out.print("\nSuma Total: "+sum+"\n");
    }

}   