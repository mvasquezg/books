/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
  Capitulo 03.-Estructura general de un programa.
  Problema 18.-Leer 500 numeros enteros y obtener cuantos son positivos.
*/

import java.util.Scanner;
    
class CountingPositiveNumbers{    
    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        int countPositive=0, num=0, maxValue=15;

        System.out.print("Leer 500 numeros enteros y obtener cuantos son positivos.\n\n");

        for(int i=1; i<=maxValue; i++){
            System.out.print(i+".-Ingresa un numero: ");
            num=in.nextInt();

            if(num>0){
                countPositive++;
            }
        }
        System.out.print("\nDe "+maxValue+" valores, hay "+countPositive+" numeros positivos\n\n");
    }
}   