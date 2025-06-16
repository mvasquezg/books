/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 26.-Calcular la raíz cuadrada de un número y escribir su resultado. Considerando el caso en que el número sea negativo.

    Ejercicios:
    4.4  página 155 
*/
import java.util.Scanner;

public class SqrtNumber{
        
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double num=0;
        System.out.print("programa que calcula la raíz cuadrada de un número y escribir su resultado. Considerando el caso en que el número sea negativo.");
        System.out.print("\n\nIngresa un numero: ");
        num=in.nextDouble();
        System.out.print("\n");
        if(num<=0){
            System.out.print("El numero ingresado no tiene raiz cuadrada.");
        }else{
            System.out.print("La raiz cuadrada de "+num+" es igual a: "+Math.sqrt(num));
        }
        System.out.print("\n\n");
    }
}