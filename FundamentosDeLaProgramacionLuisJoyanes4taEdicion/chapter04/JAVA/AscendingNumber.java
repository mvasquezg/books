/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 15.-Leer dos numeros y deducir si estan en orden creciente. 
    Actividades de programacion Rsueltas
    4.1, Pagina 151
*/
import java.util.Scanner;

public class AscendingNumber{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0;
        
        System.out.print("Programa que lee dos numeros y deducir si estan en orden creciente.");
        System.out.print("\n\nIngrese el primer numero: ");
        num1=in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2=in.nextInt();

        if(num1<num2){
            System.out.print("Los numeros estan en forma ascendente: "+num1+", "+num2);
        }else if(num1==num2){
            System.out.print("\nLos numeros son iguales: "+num1+" "+num2);
        }else{
            System.out.print("Los numeros estan en forma ascendente: "+num2+", "+num1);
        }
        System.out.print("\n\n");
    }
}    