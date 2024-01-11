/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 18. Multiplicar dos numeros enteros.
*/

import java.util.Scanner;
public class MultiplicationTwoNumbers{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number1=0;   
        int number2=0;   
        
        int multiplication=0;
        
        System.out.print("\nIngresa el primer numero: ");
        number1=in.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        number2=in.nextInt();
        
        multiplication=number1*number2;

        System.out.print("\nLa multiplicacion es igual: "+multiplication+"\n");
            
    }
}
