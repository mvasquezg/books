/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 19. Dividir dos numeros enteros.
*/
import java.util.Scanner;
public class DivisionTwoNumbers{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number1=0;   
        int number2=0;   
        
        int division=0;
        
        System.out.print("\nIngresa el primer numero: ");
        number1=in.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        number2=in.nextInt();
        
        if(number1!=0 && number2!=0){
            division=number1/number2;
            System.out.print("\nLa Division es igual a: "+division+"\n");    
        }else{
            System.out.print("\nNo se pueden dividir ceros\n");    
        }  
    }
}