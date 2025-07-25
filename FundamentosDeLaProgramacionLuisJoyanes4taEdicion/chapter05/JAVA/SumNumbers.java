/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 01.-Leer por teclado un número que represente una cantidad de números que a su vez se leerán también por teclado.
                 Calcular la suma de todos esos números.
    Pagina 160
*/
import java.util.Scanner;
public class SumNumbers{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int totalNumbers=0;
        float num=0f, sum=0f;
    
        System.out.print("Programa que lee por teclado un número que representa una cantidad de números que a su vez se leerán también por teclado.\n Calcular la suma de todos esos números.");
        System.out.print("\nIngrese la cantidad de numeros a sumar:  ");
        totalNumbers=in.nextInt();
    
        System.out.print("\n");
        while(totalNumbers>0){
            System.out.print("Ingresa un numero: ");
            num=in.nextFloat();
            sum+=num;
            totalNumbers--;
        }
        
        System.out.print("\nEl total de la suma: "+sum+"\n");
    }
}