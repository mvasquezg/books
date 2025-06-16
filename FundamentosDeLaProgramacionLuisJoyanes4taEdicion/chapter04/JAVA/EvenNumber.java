/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 27.-Escribir los diferentes métodos para deducir si una variable o expresión numérica es par.

    Ejercicios:
    4.5  página 155 
*/
import java.util.Scanner;

public class EvenNumber{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0;

        System.out.print("Escribir los diferentes métodos para deducir si una variable o expresión numérica es par.");
        System.out.print("\n\nIngresa un numero: ");
        num=in.nextInt();

        if(num%2==0){
            System.out.print("El numero: "+num+" es par");
        }else{
            System.out.print("El numero: "+num+" es impar");
        }
        System.out.print("\n\n");
    }
}