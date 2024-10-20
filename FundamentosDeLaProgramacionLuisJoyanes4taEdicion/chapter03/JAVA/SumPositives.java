/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 29.-Escribir un algoritmo que lea los datos de entrada de un archivo que solo contien numeros y sume los numeros positivos.
*/

import java.util.Scanner;

public class SumPositives{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int sum=0, num=0;
        System.out.print("Programa que calcula la suma de los numeros positivos, presione -99 para salir:\n");
        do{
            System.out.print("\nIngrese un numero: ");
            num=in.nextInt();

            if(num>0){
                sum+=num;
            }

        }while(num!=-99);

        System.out.print("\nLa suma de todos o numeros positivos es: "+sum+"\n\n");
    }   
}