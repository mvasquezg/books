/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 01.-Calcula la suma y el producto de dos numeros.
    ejemplo 4.1, pagina 129
*/
import java.util.Scanner;

public class SumProductTwoNumbers{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0, sum=0, product=0;

        System.out.print("Programa que calcula la suma y el producto de dos numeros. \n\nIngrese el primer numero: ");
        num1=in.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2=in.nextInt();

        sum=num1+num2;
        product=num1*num2;

        System.out.print("\nSuma:\n"+num1+" + "+num2+" = "+sum+"\n\n");
        System.out.print("\nProducto:\n"+num1+" * "+num2+" = "+product+"\n\n");
    }
}     