
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 16.-Dados dos números enteros, realizar el algoritmo que calcule su cociente y su resto.
    
    Ejercicio 5.5
    Pagina 187
*/
import java.util.Scanner;

public class DivResto{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0, dividendo=0, divisor=0, cociente=0;

        System.out.print("Ingresa el dividendo: ");
        num2=in.nextInt();

        System.out.print("Ingresa el divisor: ");
        num1=in.nextInt();

        divisor=num1;
        dividendo=num2;   

        do{
            dividendo=dividendo-divisor;
            cociente++;
        }while(dividendo>=divisor);

        System.out.print("\nLa division de "+num2+" / "+num1+"\nCociente: "+cociente+"\nResto: "+dividendo+"\n\n");

    }
}