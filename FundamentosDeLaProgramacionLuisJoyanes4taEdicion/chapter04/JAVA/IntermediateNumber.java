
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 25.-Dados tres números deducir cuál es el central.

    Ejercicios:
    4.3  página 155 
*/
import java.util.Scanner;
public class IntermediateNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0, num3=0;
        System.out.print("Programa que dado tres números deducir cuál es el central.\n\n");
        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        num3=in.nextInt();

        System.out.print("\n");
        if(num1==num2 && num2==num3){
            System.out.print("Todos los numeros son iguales");
        }
        System.out.print("\n");
        if(num1>num2){  
            if(num2==num3){
                System.out.print("No hay numero intermedio.");
            }else if(num2>num3){
                System.out.print("Numero de enmedio es: "+num2);
            }else{
                System.out.print("Numero de enmedio es: "+num3);
            }
        }else { 
            if(num1==num3){
                System.out.print("No hay numero intermedio.");
            }else if(num1>num3){
                System.out.print("Numero de enmedio es: "+num1);
            }else{
                System.out.print("Numero de enmedio es: "+num2);
            }
        }
        System.out.print("\n\n");
    }
}