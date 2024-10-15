/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 22.-Sumar 10 numeros introducidos por el teclado,
*/
import java.util.Scanner;

public class SumTenNUmbers{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int sum=0, number=0;

        for(int i=1; i<=10; i++){
            System.out.print(i+".-Ingrese un numero: ");
            number=in.nextInt();
            sum+=number;
        }
        System.out.print("\nSuma Total: "+sum+"\n");
    }
}
