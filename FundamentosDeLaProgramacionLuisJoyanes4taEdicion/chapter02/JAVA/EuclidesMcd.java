/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 20. Escribir un algoritmo para determinar el máximo común divisor de dos números enteros (MCD)
                 por el algoritmo de Euclides:
                    
                    • Dividir el mayor de los dos enteros positivos por el más pequeño.
                    • A continuación dividir el divisor por el resto.
                    • Continuar el proceso de dividir el último divisor por el último resto hasta que la división sea exacta.
                    • El último divisor es el mcd.
*/
import java.util.Scanner;
public class EuclidesMcd{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0;
        int num2=0;
        int residuo=0;
        int divisor=0;

        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();

        System.out.print("\nMCD("+num1+", "+num2+") = ");

        do{
            if(num1>=num2 && num2!=0){
                divisor=num2;
                residuo=num1%num2;   
            }
            num1=divisor;
            num2=residuo;
        }while(num2!=0);
    
        System.out.print(num1+"\n\n");  
    }
}