/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 26.Diseñar un algoritmo para determinar los números primos iguales o menores que N (leído del teclado).
    (Un número primo sólo puede ser divisible por él mismo y por la unidad.)
*/
import java.util.Scanner;

public class PrintPrimeNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int number=0; //numero ingresado
        int count=0; //cuenta las veces que el numero ha sido divido en las iteraciones

        System.out.print("Ingrese un numero: ");
        number=in.nextInt();

        for(int i=1; i<=number; i++){

            for(int j=1; j<=i; j++){    
                if(i%j==0){
                    count++;
                }
            } 
            
            if(count==1){
                System.out.print(i); 
            }else if(count==2){
                System.out.print(", "+i);  
            }
            count=0;    
        }
        System.out.print("\n");
    }
}