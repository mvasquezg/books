/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 04.-Diseñar un algoritmo que contenga un subprograma de cálculo del factorial de un número y una llamada al
                mismo.
    
    Ejemplo4
    Pagina 207
*/
import java.util.Scanner;

public class FactorialFunction{
    static int showFactorial(int x){
        if(x<=1){
            return 1;
        }else{
            return x*showFactorial(x-1);
        }

    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=0;
        System.out.print("Programa que calcula un factorial:\nIngrese un numero: ");
        x=in.nextInt();

        System.out.print("\nResultado del factorial:\n"+x+"! = "+showFactorial(x)+"\n\n");
    }
}