/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 24.-Escribir un programa que solicite al usuario introducir dos números. Si el primer número introducido es mayor que el segundo número, 
    el programa debe imprimir el mensaje El primer número es el mayor, en caso contrario el programa debe imprimir el mensaje El primer número es el más 
    pequeño. Considerar el caso de que ambos números sean iguales e imprimir el correspondiente mensaje.
    
    Pagina 155
*/
import java.util.Scanner;
class CompareTwoNumbers{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0;

        System.out.print("Programa que solicita al usuario introducir dos números. Si el primer número introducido es mayor que el segundo número,"); 
        System.out.print(" el programa debe imprimir el mensaje\nEl primer número es el mayor, en caso contrario el programa debe imprimir el mensaje ");
        System.out.print("El primer número es el más pequeño. Considerar el caso de que ambos números sean iguales\ne imprimir el correspondiente mensaje.\n\n");

        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();;

        System.out.print("\n");
        if(num1==num2){
            System.out.print("El numero 1 y el numero 2 son iguales.");
        }else if(num1>num2){
            System.out.print("El primer numero es el mayor");
        }else{
            System.out.print("El primer numero es el mas pequeño");
        }
        System.out.print("\n\n");
    }
}